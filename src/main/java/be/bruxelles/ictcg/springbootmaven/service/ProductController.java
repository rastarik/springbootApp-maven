package be.bruxelles.ictcg.springbootmaven.service;

import be.bruxelles.ictcg.springbootmaven.model.Product;
import be.bruxelles.ictcg.springbootmaven.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private  IProductRepository productRepository;

    @GetMapping(path = "/products")
    public String listOfProducts(Model model){

        List<Product> listOfProducts = productRepository.findAll();
        model.addAttribute("listOfProducts",listOfProducts);
        return "products";
    }

}
