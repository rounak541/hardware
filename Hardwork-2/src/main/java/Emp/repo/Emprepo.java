package Emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Emp.entity.entity;

@Repository

public interface Emprepo extends JpaRepository<entity, Integer>{
 
}
