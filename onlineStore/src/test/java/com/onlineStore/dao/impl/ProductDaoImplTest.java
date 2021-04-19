package com.onlineStore.dao.impl;

import com.onlineStore.model.Product;
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
public class ProductDaoImplTest {

    @Mock
    private SessionFactory mockSessionFactory;

    @Mock
    private Session session = Mockito.mock(Session.class);

    @InjectMocks
    private ProductDaoImpl productDaoImplUnderTest;

    @Test
    public void testGetProductById() {
        when(mockSessionFactory.getCurrentSession()).thenReturn(session);

        final Product result = productDaoImplUnderTest.getProductById(0);
    }

    @Test(expected = HibernateException.class)
    public void testGetProductById_SessionFactoryThrowsHibernateException() {

        when(mockSessionFactory.getCurrentSession()).thenThrow(HibernateException.class);


        final Product result = productDaoImplUnderTest.getProductById(0);

    }



    @Test(expected = HibernateException.class)
    public void testGetProductList_SessionFactoryThrowsHibernateException() {

        when(mockSessionFactory.getCurrentSession()).thenThrow(HibernateException.class);

        final List<Product> result = productDaoImplUnderTest.getProductList();

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

        when(mockSessionFactory.getCurrentSession()).thenReturn(session);

        productDaoImplUnderTest.addProduct(product);

    }

    @Test(expected = HibernateException.class)
    public void testAddProduct_SessionFactoryThrowsHibernateException() {
        // Setup
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

        when(mockSessionFactory.getCurrentSession()).thenThrow(HibernateException.class);

        productDaoImplUnderTest.addProduct(product);

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

        when(mockSessionFactory.getCurrentSession()).thenReturn(session);

        productDaoImplUnderTest.editProduct(product);


    }

    @Test(expected = HibernateException.class)
    public void testEditProduct_SessionFactoryThrowsHibernateException() {
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

        when(mockSessionFactory.getCurrentSession()).thenThrow(HibernateException.class);

        productDaoImplUnderTest.editProduct(product);

    }

    @Test
    public void testDeleteProduct() {
        // Setup
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

        when(mockSessionFactory.getCurrentSession()).thenReturn(session);

        productDaoImplUnderTest.deleteProduct(product);

    }

    @Test(expected = HibernateException.class)
    public void testDeleteProduct_SessionFactoryThrowsHibernateException() {
        // Setup
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

        when(mockSessionFactory.getCurrentSession()).thenThrow(HibernateException.class);

        productDaoImplUnderTest.deleteProduct(product);

    }
}
