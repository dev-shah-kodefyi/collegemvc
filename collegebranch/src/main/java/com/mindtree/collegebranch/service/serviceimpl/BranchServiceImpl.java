package com.mindtree.collegebranch.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.collegebranch.entity.Branch;
import com.mindtree.collegebranch.entity.College;
import com.mindtree.collegebranch.repository.BranchRepository;
import com.mindtree.collegebranch.repository.CollegeRepository;
import com.mindtree.collegebranch.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {
	@Autowired
	CollegeRepository collegerepo;
	BranchRepository branchrepo;

	@Override
	public void insertbranch(Branch branch, String collegeName) {
		College college = collegerepo.findByCollegeName(collegeName);
		branch.setCollege(college);
		int count = 0;
		if (college.getBranches().size() < college.getCollegeBranch()) {
			branch.setCollege(college);
			branchrepo.save(branch);
		}

	}

	@Override
	public Branch getBranch(int branchId) {
		Branch branch = branchrepo.findById(branchId).get();

		return branch;
	}

	@Override
	public void updatedetails(Branch b, int strength) {
		b.setBranchTotalStrength(strength);

		branchrepo.save(b);

	}

}
