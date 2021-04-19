package com.onlineStore.service.impl;

import com.onlineStore.dao.ProductDao;
import com.onlineStore.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceImplTest {

    @Mock
    private ProductDao mockProductDao;

    @InjectMocks
    private ProductServiceImpl productServiceImplUnderTest;

    @Test
    public void testGetProductById() {

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
        when(mockProductDao.getProductById(0)).thenReturn(product);

        final Product result = productServiceImplUnderTest.getProductById(0);

    }

    @Test
    public void testGetProductList() {

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
        when(mockProductDao.getProductList()).thenReturn(products);

        final List<Product> result = productServiceImplUnderTest.getProductList();

    }

    @Test
    public void testGetProductList_ProductDaoReturnsNoItems() {

        when(mockProductDao.getProductList()).thenReturn(Collections.emptyList());

        final List<Product> result = productServiceImplUnderTest.getProductList();

    }

    @Test
    public void testAddProduct() {

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


        productServiceImplUnderTest.addProduct(product);

        verify(mockProductDao).addProduct(any(Product.class));
    }

    @Test
    public void testEditProduct() {

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


        productServiceImplUnderTest.editProduct(product);


        verify(mockProductDao).editProduct(any(Product.class));
    }

    @Test
    public void testDeleteProduct() {
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

        productServiceImplUnderTest.deleteProduct(product);

        verify(mockProductDao).deleteProduct(any(Product.class));
    }
}
