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
public class CustomerOrderDaoImplTest {

    @Mock
    private SessionFactory mockSessionFactory;

    @Mock
    private Session session = Mockito.mock(Session.class);

    @InjectMocks
    private CustomerOrderDaoImpl customerOrderDaoImplUnderTest;

    @Test
    public void testAddCustomerOrder() {
        // Setup
        final CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setCustomerOrderId(0);
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
        customer.setCart(new Cart());
        cart.setCustomer(customer);
        cart.setGrandTotal(0.0);
        customerOrder.setCart(cart);
        final Customer customer1 = new Customer();
        customer1.setCustomerId(0);
        customer1.setCustomerName("customerName");
        customer1.setCustomerEmail("customerEmail");
        customer1.setCustomerPhone("customerPhone");
        customer1.setUsername("username");
        customer1.setPassword("password");
        customer1.setEnabled(false);
        final BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setBillingAddressId(0);
        billingAddress1.setStreetName("streetName");
        billingAddress1.setApartmentNumber("apartmentNumber");
        billingAddress1.setCity("city");
        billingAddress1.setState("state");
        billingAddress1.setCountry("country");
        billingAddress1.setZipCode("zipCode");
        billingAddress1.setCustomer(new Customer());
        customer1.setBillingAddress(billingAddress1);
        final ShippingAddress shippingAddress1 = new ShippingAddress();
        shippingAddress1.setShippingAddressId(0);
        shippingAddress1.setStreetName("streetName");
        shippingAddress1.setApartmentNumber("apartmentNumber");
        shippingAddress1.setCity("city");
        shippingAddress1.setState("state");
        customer1.setShippingAddress(shippingAddress1);
        customerOrder.setCustomer(customer1);

        when(mockSessionFactory.getCurrentSession()).thenReturn(session);


        customerOrderDaoImplUnderTest.addCustomerOrder(customerOrder);


    }

    @Test(expected = HibernateException.class)
    public void testAddCustomerOrder_SessionFactoryThrowsHibernateException() {

        final CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setCustomerOrderId(0);
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
        customer.setCart(new Cart());
        cart.setCustomer(customer);
        cart.setGrandTotal(0.0);
        customerOrder.setCart(cart);
        final Customer customer1 = new Customer();
        customer1.setCustomerId(0);
        customer1.setCustomerName("customerName");
        customer1.setCustomerEmail("customerEmail");
        customer1.setCustomerPhone("customerPhone");
        customer1.setUsername("username");
        customer1.setPassword("password");
        customer1.setEnabled(false);
        final BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setBillingAddressId(0);
        billingAddress1.setStreetName("streetName");
        billingAddress1.setApartmentNumber("apartmentNumber");
        billingAddress1.setCity("city");
        billingAddress1.setState("state");
        billingAddress1.setCountry("country");
        billingAddress1.setZipCode("zipCode");
        billingAddress1.setCustomer(new Customer());
        customer1.setBillingAddress(billingAddress1);
        final ShippingAddress shippingAddress1 = new ShippingAddress();
        shippingAddress1.setShippingAddressId(0);
        shippingAddress1.setStreetName("streetName");
        shippingAddress1.setApartmentNumber("apartmentNumber");
        shippingAddress1.setCity("city");
        shippingAddress1.setState("state");
        customer1.setShippingAddress(shippingAddress1);
        customerOrder.setCustomer(customer1);

        when(mockSessionFactory.getCurrentSession()).thenThrow(HibernateException.class);


        customerOrderDaoImplUnderTest.addCustomerOrder(customerOrder);


    }
}
