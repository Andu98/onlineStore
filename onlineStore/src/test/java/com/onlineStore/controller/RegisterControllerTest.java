package com.onlineStore.controller;

import com.onlineStore.model.*;
import com.onlineStore.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RegisterControllerTest {

    @Mock
    private CustomerService mockCustomerService;

    @InjectMocks
    private RegisterController registerControllerUnderTest;


    @Test
    public void testRegisterCustomerPost() {
        // Setup
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

        final BindingResult result = Mockito.mock(BindingResult.class);
        final Model model = Mockito.mock(Model.class);


        // Configurare CustomerService.getAllCustomers
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
        shippingAddress1.setCountry("country");
        shippingAddress1.setZipCode("zipCode");
        shippingAddress1.setCustomer(new Customer());
        customer1.setShippingAddress(shippingAddress1);
        final Cart cart1 = new Cart();
        cart1.setCartId(0);
        final CartItem cartItem1 = new CartItem();
        cartItem1.setCartItemId(0);
        cartItem1.setCart(new Cart());
        final Product product1 = new Product();
        product1.setProductId(0);
        product1.setProductName("productName");
        product1.setProductCategory("productCategory");
        product1.setProductDescription("productDescription");
        product1.setProductPrice(0.0);
        product1.setProductCondition("productCondition");
        product1.setProductStatus("productStatus");
        product1.setUnitInStock(0);
        product1.setProductManufacturer("productManufacturer");
        product1.setProductImage(null);
        cartItem1.setProduct(product1);
        cartItem1.setQuantity(0);
        cartItem1.setTotalPrice(0.0);
        cart1.setCartItems(List.of(cartItem1));
        cart1.setCustomer(new Customer());
        cart1.setGrandTotal(0.0);
        customer1.setCart(cart1);
        final List<Customer> customerList = List.of(customer1);
        when(mockCustomerService.getAllCustomers()).thenReturn(customerList);

        // Run the test
        final String rezultat = registerControllerUnderTest.registerCustomerPost(customer, result, model);

        // Verify the results
        assertEquals("registerCustomer", rezultat);
    }

    @Test
    public void testRegisterCustomerPost_CustomerServiceGetAllCustomersReturnsNoItems() {
        // Setup
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

        final BindingResult result = Mockito.mock(BindingResult.class);
        final Model model = Mockito.mock(Model.class);

        when(mockCustomerService.getAllCustomers()).thenReturn(Collections.emptyList());

        // Run the test
        final String rezultat = registerControllerUnderTest.registerCustomerPost(customer, result, model);

        // Verify the results
        assertEquals("registerCustomerSuccess", rezultat);
        verify(mockCustomerService).addCustomer(any(Customer.class));
    }
}
