package com.onlineStore.dao.impl;

import com.onlineStore.dao.CartDao;
import com.onlineStore.model.Cart;
import com.onlineStore.service.CustomerOrderService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

    @Autowired
    private CustomerOrderService customerOrderService;

    @Autowired
    private SessionFactory sessionFactory;


    public Cart getCartById(int cartId){
        Session session = sessionFactory.getCurrentSession();
        return (Cart) session.get(Cart.class,cartId);
    }

    public void update(Cart cart){
        int cartId= cart.getCartId();
       double grandTotal=customerOrderService.getCustomerOrderGrandTotal(cartId);
       cart.setGrandTotal(grandTotal);

       Session session = sessionFactory.getCurrentSession();
       session.saveOrUpdate(cart);
    }

    public Cart validate(int cartId) throws IOException{
        Cart cart = getCartById(cartId);

        //verificam daca nu exista cosul sau este gol
        if(cart==null|| cart.getCartItems().size()==0){
            throw new IOException(cartId+"");
        }
        update(cart);
        return cart;
    }
}
