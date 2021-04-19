package com.onlineStore.controller;

import com.onlineStore.model.*;
import com.onlineStore.service.CartItemService;
import com.onlineStore.service.CartService;
import com.onlineStore.service.CustomerService;
import com.onlineStore.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.core.userdetails.User;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CartResourcesTest {

    @Mock
    private CartService mockCartService;
    @Mock
    private CartItemService mockCartItemService;
    @Mock
    private CustomerService mockCustomerService;
    @Mock
    private ProductService mockProductService;

    @InjectMocks
    private CartResources cartResourcesUnderTest;

    @Test
    public void testGetCartById() {

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
        when(mockCartService.getCartById(0)).thenReturn(cart);

        final Cart result = cartResourcesUnderTest.getCartById(0);

    }

    @Test
    public void testAddItems() {
        // Setup
        final User activeUser = new User("username", "password", false, false, false, false, List.of());        final Customer customer = new Customer();
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
        when(mockCustomerService.getCustomerByUsername("username")).thenReturn(customer);

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
        when(mockProductService.getProductById(0)).thenReturn(product1);


        cartResourcesUnderTest.addItems(0, activeUser);


        verify(mockCartItemService).addCartItem(any(CartItem.class));
    }

    @Test
    public void testRemoveItem() {

        final CartItem cartItem = new CartItem();
        cartItem.setCartItemId(0);
        final Cart cart = new Cart();
        cart.setCartId(0);
        cart.setCartItems(List.of(new CartItem()));
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
        cartItem.setCart(cart);
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
        when(mockCartItemService.getCartItemByProductId(0)).thenReturn(cartItem);

        cartResourcesUnderTest.removeItem(0);

        verify(mockCartItemService).removeCartItem(any(CartItem.class));
    }

    @Test
    public void testClearCart() {

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
        when(mockCartService.getCartById(0)).thenReturn(cart);

        cartResourcesUnderTest.clearCart(0);

        verify(mockCartItemService).removeAllCartItems(any(Cart.class));
    }

    @Test
    public void testHandleClientErrors() {

        cartResourcesUnderTest.handleClientErrors(new Exception("message"));

    }

    @Test
    public void testHandleServerErrors() {
        cartResourcesUnderTest.handleServerErrors(new Exception("message"));
            }
}
