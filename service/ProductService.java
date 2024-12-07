package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import model.Product;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private RestTemplate restTemplate;

    private final String URL = "https://fakestoreapi.com/products"; // Fake Store API URL

    public List<Product> getAllProducts() {
        // Sending GET request to the API and returning the response as a list of products
        Product[] products = restTemplate.getForObject(URL, Product[].class);
        return Arrays.asList(products);
    }
}
