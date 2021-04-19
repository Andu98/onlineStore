package com.onlineStore.service;

import com.onlineStore.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);

}
