package com.mindtree.collegebranch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.collegebranch.entity.Branch;
import com.mindtree.collegebranch.entity.College;
import com.mindtree.collegebranch.service.BranchService;
import com.mindtree.collegebranch.service.CollegeService;

@Controller
public class CollegeBranchController {

		Branch b = new Branch();
		@Autowired
		CollegeService collegeservice;
		@Autowired
		BranchService branchservice;

		@RequestMapping("/")
		public String index() {
			return "index";
		}

		@RequestMapping("/registercollege")
		public String registercollege() {
			return "collegeregistration";
		}

		@RequestMapping("/insertcollege")
		public String insertcollege(College college) {
			collegeservice.insertcollege(college);
			return "index";
		}

		@RequestMapping("/registerbranch")
		public String registerbranch(Model model) {
			List<College> colleges = collegeservice.getcollegelist();
			model.addAttribute("college", colleges);
			return "branchregistration";
		}

		@RequestMapping("/insertbranch")
		public String insertbranch(Branch branch, String collegeName) {
			branchservice.insertbranch(branch,collegeName);
			return "index";
		}

		@RequestMapping("/display")
		public String displayData(Model model) {
			List<College> college = collegeservice.displaydata();
			return "display";
		}

		@RequestMapping("/studentview")
		public String findAll(@RequestParam String collegeName, Model model) {
			List<Branch> branch = collegeservice.displaybranchView(collegeName);
			model.addAttribute("branch", branch);
			return "view";
		}

		@RequestMapping("/update/{branchId}")
		public String updateCard(@PathVariable int branchId, Model model) {
			Branch branch = branchservice.getBranch(branchId);
			model.addAttribute("branch", branch);
			b = branch;
			return "updatestrength";
		}

		@PostMapping("/updatebranchdetails")
		public String updatebranchdetails(@RequestParam int strength) {
			branchservice.updatedetails(b, strength);
			return "view";
		}
	}


