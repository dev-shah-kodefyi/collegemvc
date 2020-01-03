package com.mindtree.collegebranch.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int collegeId;
private String collegeName;
private String collegeLocation;
private int collegeBranch;
@OneToMany(mappedBy="college",cascade=CascadeType.ALL)
private List<Branch>branches;
public College() {
	super();
	// TODO Auto-generated constructor stub
}
public College(int collegeId, String collegeName, String collegeLocation, int collegeBranch, List<Branch> branches) {
	super();
	this.collegeId = collegeId;
	this.collegeName = collegeName;
	this.collegeLocation = collegeLocation;
	this.collegeBranch = collegeBranch;
	this.branches = branches;
}
public int getCollegeId() {
	return collegeId;
}
public void setCollegeId(int collegeId) {
	this.collegeId = collegeId;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public String getCollegeLocation() {
	return collegeLocation;
}
public void setCollegeLocation(String collegeLocation) {
	this.collegeLocation = collegeLocation;
}
public int getCollegeBranch() {
	return collegeBranch;
}
public void setCollegeBranch(int collegeBranch) {
	this.collegeBranch = collegeBranch;
}
public List<Branch> getBranches() {
	return branches;
}
public void setBranches(List<Branch> branches) {
	this.branches = branches;
}
@Override
public String toString() {
	return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeLocation=" + collegeLocation
			+ ", collegeBranch=" + collegeBranch + ", branches=" + branches + "]";
}

}
