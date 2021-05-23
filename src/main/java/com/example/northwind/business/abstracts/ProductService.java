package com.example.northwind.business.abstracts;

import java.util.List;

import com.example.northwind.core.utilities.results.DataResult;
import com.example.northwind.core.utilities.results.Result;
import com.example.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
