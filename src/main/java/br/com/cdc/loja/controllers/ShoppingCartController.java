package br.com.cdc.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cdc.loja.daos.ProductDAO;
import br.com.cdc.loja.models.Product;
import br.com.cdc.loja.models.ShoppingCart;
import br.com.cdc.loja.models.ShoppingItem;
import br.com.cdc.loja.models.enuns.BookType;

@Controller
@RequestMapping("/shopping")
public class ShoppingCartController {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ShoppingCart shoppingCart;

    @PostMapping
    public ModelAndView add(Integer productId, BookType bookType) {
        ShoppingItem item = createItem(productId, bookType);
        shoppingCart.add(item);
        return new ModelAndView("redirect:/produtos");
    }

    private ShoppingItem createItem(Integer productId, BookType bookType) {
        Product product = productDAO.find(productId);
        return new ShoppingItem(product, bookType);
    }

    @GetMapping
    public String items(){
        return "shoppingCart/items";
    }

}
