package com.onlineStore.controller.admin;


import com.onlineStore.model.Customer;
import com.onlineStore.model.Product;
import com.onlineStore.service.CustomerService;
import com.onlineStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminHome {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;
    @RequestMapping // mapata la /admin
    public String adminPage(){
         return "admin";
    }

    @RequestMapping("/productInventory")
    public String productInventory(Model model){
        List<Product> products = productService.getProductList();
        model.addAttribute("products",products);

        return "productInventory";
    }

    @RequestMapping("/customer")
    public String customerManagement(Model model){

        List<Customer> customerList = customerService.getAllCustomers();
        model.addAttribute("customerList", customerList);


        return "customerManagement";
    }



}
