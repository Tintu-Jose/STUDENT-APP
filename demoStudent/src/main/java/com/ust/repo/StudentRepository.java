package com.ust.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ust.model.Student; 
 
//@Repository
//@Component
public interface StudentRepository extends JpaRepository<Student,Integer> 
{ 
 
} 
