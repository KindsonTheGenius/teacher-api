package com.kindsonthegenius.demos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.demos.models.Teacher;
import com.kindsonthegenius.demos.repositories.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	public List<Teacher> getAll() {
		return (List<Teacher>) teacherRepository.findAll();
	}

}
