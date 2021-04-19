package com.onlineStore.dao.impl;

import com.onlineStore.model.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CustomerDaoImplTest {

    @Mock
    private SessionFactory mockSessionFactory;

    @Mock
    private Session session = Mockito.mock(Session.class);

    @InjectMocks
    private CustomerDaoImpl customerDaoImplUnderTest;

    @Test
    public void testAddCustomer() {

        final Customer customer = new Customer();
        customer.setCustomerId(0);
        customer.setCustomerName("customerName");
        customer.setCustomerEmail("customerEmail");
        customer.setCustomerPhone("customerPhone");
        customer.setUsername("username");
        customer.setPassword("password");
        customer.setEnabled(false);
        final BillingAddress billingAddress = new BillingAddress();
        billingAddress.setBillingAddressId(0);
        billingAddress.setStreetName("streetName");
        billingAddress.setApartmentNumber("apartmentNumber");
        billingAddress.setCity("city");
        billingAddress.setState("state");
        billingAddress.setCountry("country");
        billingAddress.setZipCode("zipCode");
        billingAddress.setCustomer(new Customer());
        customer.setBillingAddress(billingAddress);
        final ShippingAddress shippingAddress = new ShippingAddress();
        shippingAddress.setShippingAddressId(0);
        shippingAddress.setStreetName("streetName");
        shippingAddress.setApartmentNumber("apartmentNumber");
        shippingAddress.setCity("city");
        shippingAddress.setState("state");
        shippingAddress.setCountry("country");
        shippingAddress.setZipCode("zipCode");
        shippingAddress.setCustomer(new Customer());
        customer.setShippingAddress(shippingAddress);
        final Cart cart = new Cart();
        cart.setCartId(0);
        final CartItem cartItem = new CartItem();
        cartItem.setCartItemId(0);
        cartItem.setCart(new Cart());
        final Product product = new Product();
        product.setProductId(0);
        product.setProductName("productName");
        product.setProductCategory("productCategory");
        product.setProductDescription("productDescription");
        product.setProductPrice(0.0);
        product.setProductCondition("productCondition");
        product.setProductStatus("productStatus");
        product.setUnitInStock(0);
        product.setProductManufacturer("productManufacturer");
        product.setProductImage(null);
        cartItem.setProduct(product);
        cartItem.setQuantity(0);
        cartItem.setTotalPrice(0.0);
        cart.setCartItems(List.of(cartItem));
        cart.setCustomer(new Customer());
        cart.setGrandTotal(0.0);
        customer.setCart(cart);

        when(mockSessionFactory.getCurrentSession()).thenReturn(session);

        customerDaoImplUnderTest.addCustomer(customer);

    }


    @Test
    public void testGetCustomerById() {

        when(mockSessionFactory.getCurrentSession()).thenReturn(session);


        final Customer result = customerDaoImplUnderTest.getCustomerById(0);

    }



}
