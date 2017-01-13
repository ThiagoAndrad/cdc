package br.com.cdc.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cdc.loja.daos.ProductDAO;
import br.com.cdc.loja.models.enuns.BookType;

@Controller
@RequestMapping("/shopping")
public class ShoppingCartController {

    @Autowired
    private ProductDAO productDAO;

    @PostMapping
    public ModelAndView add(Integer productId, BookType bookType) {
    }

}
