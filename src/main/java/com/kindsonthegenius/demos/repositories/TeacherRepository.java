package com.kindsonthegenius.demos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.demos.models.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

}
