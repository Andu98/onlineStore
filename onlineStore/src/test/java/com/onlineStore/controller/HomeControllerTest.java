package com.onlineStore.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest {

    private HomeController homeControllerUnderTest;

    @Before
    public void setUp() {
        homeControllerUnderTest = new HomeController();
    }

    @Test
    public void testHome() {

        final String result = homeControllerUnderTest.home();

        assertEquals("home", result);
    }

}
