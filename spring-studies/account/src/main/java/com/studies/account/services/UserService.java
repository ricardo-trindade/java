package com.studies.account.services;

import com.studies.account.dtos.requests.UserRequestDTO;
import com.studies.account.dtos.responses.UserResponseDTO;
import com.studies.account.entities.User;
import com.studies.account.enums.Status;
import com.studies.account.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    @Transactional
    public UserResponseDTO cadastro(UserRequestDTO dto) {

        if (repository.existsByNome(dto.nome())) {
            throw new RuntimeException("Esse nome de usuário já está em uso");
        }

        User user = new User();

        user.setNome(dto.nome());
        user.setEmail(dto.email());
        user.setSenha(dto.senha());
        user.setAniversario(dto.aniversario());

        user.setDataCriacao(LocalDate.now());
        user.setStatus(Status.ONLINE);

        repository.save(user);

        return new UserResponseDTO(
                user.getNome(),
                user.getEmail(),
                user.getAniversario(),
                user.getDataCriacao(),
                user.getStatus()
        );
    }

    @Transactional(readOnly = true)
    public List<UserResponseDTO> findAll() {
        return repository.findAll().stream()
                .map(UserResponseDTO::new) // Referência ao construtor: muito mais elegante!
                .toList();
    }

    public UserResponseDTO findByNome(String nome) {

        User user = repository.findByNome(nome)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o nome: " + nome));

        return new UserResponseDTO(
                user.getNome(),
                user.getEmail(),
                user.getAniversario(),
                user.getDataCriacao(),
                user.getStatus()
        );
    }

    @Transactional
    public UserResponseDTO atualizar(String nome, UserRequestDTO dto) {
        User user = repository.findByNome(nome).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        if (repository.existsByNome(dto.nome())) {
            throw new RuntimeException("Esse nome de usuário já está em uso");
        }

        user.setNome(dto.nome());
        user.setEmail(dto.email());
        user.setSenha(dto.senha());
        user.setAniversario(dto.aniversario());

        repository.save(user);

        return new UserResponseDTO(
                user.getNome(),
                user.getEmail(),
                user.getAniversario(),
                user.getDataCriacao(),
                user.getStatus()
        );
    }

    @Transactional
    public Void deleteByNome(String nome) {
        User user = repository.findByNome(nome).orElseThrow(() -> new RuntimeException("Usuário não encontrado com o nome: " + nome));
        return repository.deleteByNome(nome);
    }
}
