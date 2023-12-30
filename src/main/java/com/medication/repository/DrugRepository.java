package com.medication.repository;

import com.medication.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Compaore Yann Djamel

@Repository
public interface DrugRepository extends JpaRepository<Drug, Integer> {
}
