package com.crudminsait.repository;

import com.crudminsait.entities.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutoRepository extends JpaRepository<Auto, Integer> {

}
