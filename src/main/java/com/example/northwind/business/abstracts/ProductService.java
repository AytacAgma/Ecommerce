package com.example.northwind.business.abstracts;

import java.util.List;

import com.example.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
