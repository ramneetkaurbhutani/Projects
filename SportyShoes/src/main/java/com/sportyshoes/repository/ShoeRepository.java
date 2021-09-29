package com.sportyshoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoes.entity.Shoe;


public interface ShoeRepository extends JpaRepository<Shoe, Integer> {

}
