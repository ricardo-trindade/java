package com.studies.account.repositories;

import com.studies.account.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByNome(String nome);
    public Boolean existsByNome(String nome);
    public Void deleteByNome(String nome);
}
