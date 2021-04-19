package com.onlineStore.service.impl;

import com.onlineStore.dao.CustomerOrderDao;
import com.onlineStore.model.Cart;
import com.onlineStore.model.CartItem;
import com.onlineStore.model.CustomerOrder;
import com.onlineStore.service.CartService;
import com.onlineStore.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    public void addCustomerOrder(CustomerOrder customerOrder){
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    public double getCustomerOrderGrandTotal(int cartId){
        double grandTotal=0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for(CartItem item : cartItems){
            grandTotal += item.getTotalPrice();
        }
        return grandTotal;
    }


}
