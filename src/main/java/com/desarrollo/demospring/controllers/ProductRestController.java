package com.desarrollo.demospring.controllers;

import com.desarrollo.demospring.entities.Product;
import com.desarrollo.demospring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

    /**
     * List all products.
     *
     * @param_model
     * @return
     */

    @GetMapping ("/productlist")
    public List<Product> productlist(){
        System.out.println("Devolviendo productos");

        return(List<Product>) productService.listAllProducts();
    }

    @PostMapping("/newproduct")
    public ResponseEntity<String> saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        System.out.println(">>> Save product");
        return new ResponseEntity<>("Producto creado!", HttpStatus.OK);
    }

    //public String list(Model model) {
    //model.addAttribute("products");
    //System.out.println("Returning products:");
    //return productService.listAllProducts(ss);
/*
    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
/*    @RequestMapping(value = "product/{id}")
    public String showProduct(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "productshow";
    }
    // Afficher le formulaire de modification du Product
    @GetMapping(value= "product/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "productform";
    }
    /**
     * New product.
     *
     * @param model
     * @return
     */
    /*
    @RequestMapping("product/new")
    public String newProduct(Model model) {
        model.addAttribute("product", new Product());
        return "productform";
    }
    /**
     * Save product to database.
     *
     * @param product
     * @return
     */

    /*
    @RequestMapping(value = "product", method = RequestMethod.POST)
    public String saveProduct(Product product) {
        productService.saveProduct(product);
        System.out.println(">>> Save product");
        return "redirect:/";
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    /*
    @GetMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return "redirect:/";
    }
    */
}
