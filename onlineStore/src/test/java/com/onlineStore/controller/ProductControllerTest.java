package com.onlineStore.controller;

import com.onlineStore.model.Product;
import com.onlineStore.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.Model;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

    @Mock
    private ProductService mockProductService;

    @InjectMocks
    private ProductController productControllerUnderTest;

    @Test
    public void testGetProducts() {
        final Model model = Mockito.mock(Model.class);

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
        final List<Product> products = List.of(product);
        when(mockProductService.getProductList()).thenReturn(products);

        final String result = productControllerUnderTest.getProducts(model);

        assertEquals("productList", result);
    }

    @Test
    public void testGetProducts_ProductServiceReturnsNoItems() {
        // Setup
        final Model model = Mockito.mock(Model.class);

        when(mockProductService.getProductList()).thenReturn(Collections.emptyList());


        final String result = productControllerUnderTest.getProducts(model);


        assertEquals("productList", result);
    }

    @Test
    public void testViewProduct() throws Exception {
        final Model model = Mockito.mock(Model.class);
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
        when(mockProductService.getProductById(0)).thenReturn(product);


        final String result = productControllerUnderTest.viewProduct(0, model);


        assertEquals("viewProduct", result);
    }

    @Test
    public void testGetProductByCategory() {
        // Setup
        final Model model = Mockito.mock(Model.class);


        // Configure ProductService.getProductList(...).
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
        final List<Product> products = List.of(product);
        when(mockProductService.getProductList()).thenReturn(products);

        // Run the test
        final String result = productControllerUnderTest.getProductByCategory("searchCondition", model);

        // Verify the results
        assertEquals("productList", result);
    }

    @Test
    public void testGetProductByCategory_ProductServiceReturnsNoItems() {
        // Setup
        final Model model = Mockito.mock(Model.class);

        when(mockProductService.getProductList()).thenReturn(Collections.emptyList());

        // Run the test
        final String result = productControllerUnderTest.getProductByCategory("searchCondition", model);

        // Verify the results
        assertEquals("productList", result);
    }
}
