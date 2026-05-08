package com.studies.store.services;

import com.studies.store.dtos.requests.ProductRequestDTO;
import com.studies.store.dtos.responses.ProductResponseDTO;
import com.studies.store.entities.Product;
import com.studies.store.enums.Status;
import com.studies.store.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    @Transactional
    public ProductResponseDTO criarProduto(ProductRequestDTO dto) {
        Product product = new Product();

        product.setNome(dto.nome());
        product.setPreco(dto.preco());
        product.setEstoque(dto.estoque());

        product.setStatus(Status.DISPONIVEL);
        product.setDataLancamento(LocalDate.now());

        product = repository.save(product);

        return new ProductResponseDTO(
                product.getId(),
                product.getNome(),
                product.getPreco(),
                product.getEstoque(),
                product.getStatus(),
                product.getDataLancamento()
        );
    }

    @Transactional(readOnly = true)
    public List<ProductResponseDTO> findAll() {
        return repository.findAll().stream()
                .map(ProductResponseDTO::new) // Referência ao construtor: muito mais elegante!
                .toList();
    }

    @Transactional(readOnly = true)
    public ProductResponseDTO buscarPorId(UUID id) {
        Product product = repository.findById(id).orElse(null);
        return new ProductResponseDTO(
                product.getId(),
                product.getNome(),
                product.getPreco(),
                product.getEstoque(),
                product.getStatus(),
                product.getDataLancamento()
        );
    }

    @Transactional
    public ProductResponseDTO atualizarPorId(UUID id, ProductRequestDTO dto) {
        Product product = repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontradp"));
        product.setNome(dto.nome());
        product.setPreco(dto.preco());
        product.setEstoque(dto.estoque());

        return new ProductResponseDTO(
                product.getId(),
                product.getNome(),
                product.getPreco(),
                product.getEstoque(),
                product.getStatus(),
                product.getDataLancamento()
        );
    }

    @Transactional
    public void deletarPorId(UUID id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Produto não encontrado");
        }
        repository.deleteById(id);
    }
}
