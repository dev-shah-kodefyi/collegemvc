package com.mindtree.collegebranch.service;

import java.util.List;

import com.mindtree.collegebranch.entity.Branch;
import com.mindtree.collegebranch.entity.College;

public interface CollegeService {

public	void insertcollege(College college);

public List<College> getcollegelist();

public List<College> displaydata();

public List<Branch> displaybranchView(String collegeName);

}
