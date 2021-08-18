package com.assignment.Asiignment2.repository;

import org.springframework.data.repository.CrudRepository;

import com.assignment.Asiignment2.bean.Student;


public interface StudentRepository  extends CrudRepository<Student, String> {

}
