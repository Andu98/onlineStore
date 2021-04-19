package com.onlineStore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;


@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 6764395676612370591L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    @NotEmpty(message= " Numele produsul nu poate fi null")
    private String productName;
    private String productCategory;
    private String productDescription;

    @Min(value=0,message = " Pretul produsului nu poate fi mai mic de 0")
    private double productPrice;
    private String productCondition;
    private String productStatus;
    @Min(value=0,message = " Numarul de unitati pe inventar nu poate fi mai mic de 0")
    private int unitInStock;
    private String productManufacturer;

    @Transient //nu trebuie creat un camp in bdd pentru productImage
    private MultipartFile productImage;


    //id-ul unui produs poate face parte din mai multe Cosuri
    //dar un Cos poate referi cate un singur id al fiecarui produs
    //mappedBy = in clasa CartItem avem un camp product ce refera clasa aceasta
    //cascade = in cazul in care clasa parinte nu mai exista, sunt sterse si clasele child
    //fetch = aduce datele inainte ca ele sa fie folosite (pt ca ulterior sa fie transformate in JSON)
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore //spring nu converteste acest camp in format Json 
    private List<CartItem> cartItemList;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }
}
