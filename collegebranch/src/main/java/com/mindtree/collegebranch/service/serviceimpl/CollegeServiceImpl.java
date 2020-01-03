package com.mindtree.collegebranch.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegebranch.entity.Branch;
import com.mindtree.collegebranch.entity.College;
import com.mindtree.collegebranch.repository.CollegeRepository;
import com.mindtree.collegebranch.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {
	@Autowired
	CollegeRepository collegerepo;

	@Override
	public void insertcollege(College college) {
		collegerepo.save(college);

	}

	@Override
	public List<College> getcollegelist() {
		List<College> collegelist = collegerepo.findAll();
		return collegelist;
	}

	@Override
	public List<College> displaydata() {
		List<College> college = collegerepo.findAll();
		return college;
	}

	@Override
	public List<Branch> displaybranchView(String collegeName) {
		College college = collegerepo.findByCollegeName(collegeName);
		List<Branch> branches = college.getBranches();
		return branches;
	}

}
