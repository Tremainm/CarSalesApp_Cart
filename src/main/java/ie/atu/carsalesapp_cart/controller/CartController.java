package ie.atu.carsalesapp_cart.controller;

import ie.atu.carsalesapp_cart.service.CartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService)
    {
        this.cartService = cartService;
    }
}
