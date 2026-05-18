package com.login.exemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.exemplo.entity.Product;
import com.login.exemplo.repositories.ProductRepository;

@RestController
@RequestMapping("produto")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
    
    @GetMapping
    public ResponseEntity<List<Product>> listarTodos() {
        List<Product> produtos = productRepository.findAll();
        return ResponseEntity.ok(produtos); 
    }
    
	@GetMapping("/{id}")
	public ResponseEntity<Product> buscarId(@PathVariable int id) {
		
		Optional<Product> produto = productRepository.findById(id);
		
		if(produto.isPresent()) {
		    return ResponseEntity.ok(produto.get());
	    } else {
            return ResponseEntity.notFound().build();
        }
	}
    
    @PostMapping
    public ResponseEntity<Product> criar(@RequestBody Product product) {
        Product newProduct = productRepository.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Product> atualizar(@PathVariable int id, @RequestBody Product produtoAtualizado) {
        
        return productRepository.findById(id)
            .map(produtoExistente -> {
                produtoExistente.setNomeProduto(produtoAtualizado.getNomeProduto());
                produtoExistente.setPrecoProduto(produtoAtualizado.getPrecoProduto());
                produtoExistente.setQuantidadeProduto(produtoAtualizado.getQuantidadeProduto());
                
                Product salvo = productRepository.save(produtoExistente);
                return ResponseEntity.ok(salvo);
            })
            .orElseGet(() -> {
                return ResponseEntity.notFound().build();
            });
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id) {
        
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}