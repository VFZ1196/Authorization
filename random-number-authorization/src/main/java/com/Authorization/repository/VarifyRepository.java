package com.Authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Authorization.model.Varify;

@Repository
public interface VarifyRepository extends JpaRepository<Varify, Long> {

}
