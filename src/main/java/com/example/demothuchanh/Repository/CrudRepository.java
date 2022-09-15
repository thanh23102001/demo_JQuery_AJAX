package com.example.demothuchanh.Repository;

import com.example.demothuchanh.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<Company, Integer> {

}
