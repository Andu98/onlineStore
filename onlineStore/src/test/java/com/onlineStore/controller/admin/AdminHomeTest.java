package com.onlineStore.controller.admin;

import com.onlineStore.model.Customer;
import com.onlineStore.model.Product;
import com.onlineStore.service.CustomerService;
import com.onlineStore.service.ProductService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class AdminHomeTest {
    @Mock
    CustomerService customerService;
    @Mock
    ProductService productService;
    @InjectMocks
    AdminHome adminHome;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAdminPage() throws Exception {
        String result = adminHome.adminPage();
        Assert.assertEquals("admin", result);
    }

}
