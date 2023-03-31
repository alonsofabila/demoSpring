package com.desarrollo.demospring.controllers;

import com.desarrollo.demospring.entities.Product;
import com.desarrollo.demospring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Product controller.
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/")
    public String list(Model model) {
        model.addAttribute("products", productService.listAllProducts());
        System.out.println("Returning products:");
        return "products";
    }
    @RequestMapping(value="product/{id}")
    public String showProduct(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "productshow";
    }

    // Afficher le formulaire de modification du Product
    @GetMapping(value="product/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "productform";
    }
    @RequestMapping(value="product/new")
    public String newProduct(Model model) {
        model.addAttribute("product", new Product());
        return "productform";
    }
    @RequestMapping(value = "product", method = RequestMethod.POST)
    public String saveProduct(Product product) {
        productService.saveProduct(product);
        System.out.println(">>>Save product");
        return "redirect:/" ;
    }
    @GetMapping(value="product/delete/{id}")
    public String delete(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return "redirect:/";
    }

}
