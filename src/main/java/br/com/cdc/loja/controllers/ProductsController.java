package br.com.cdc.loja.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.cdc.loja.daos.ProductDAO;
import br.com.cdc.loja.models.Product;
import br.com.cdc.loja.models.enuns.BookType;

@Controller
@Transactional
public class ProductsController {
	
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/produtos/form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("products/form");
		modelAndView.addObject("types", BookType.values());
		return modelAndView;
	}

	@RequestMapping("/produtos")
	public String save(Product product) {
		productDAO.save(product);
		return "products/ok";
	}
}
