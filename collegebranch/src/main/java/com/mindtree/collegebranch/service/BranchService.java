package com.mindtree.collegebranch.service;

import com.mindtree.collegebranch.entity.Branch;

public interface BranchService {

	void insertbranch(Branch branch, String collegeName);

	Branch getBranch(int branchId);

	void updatedetails(Branch b, int strength);

}
