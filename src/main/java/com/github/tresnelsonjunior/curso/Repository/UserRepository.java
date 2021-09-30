package com.github.tresnelsonjunior.curso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.tresnelsonjunior.curso.Domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
