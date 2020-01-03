package com.mindtree.collegebranch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Branch {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int branchId;
private String branchName;
private int branchTotalStrength;
private String branchHod;
@ManyToOne
private College college;
public Branch() {
	super();
	// TODO Auto-generated constructor stub
}
public Branch(int branchId, String branchName, int branchTotalStrength, String branchHod, College college) {
	super();
	this.branchId = branchId;
	this.branchName = branchName;
	this.branchTotalStrength = branchTotalStrength;
	this.branchHod = branchHod;
	this.college = college;
}
public int getBranchId() {
	return branchId;
}
public void setBranchId(int branchId) {
	this.branchId = branchId;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public int getBranchTotalStrength() {
	return branchTotalStrength;
}
public void setBranchTotalStrength(int branchTotalStrength) {
	this.branchTotalStrength = branchTotalStrength;
}
public String getBranchHod() {
	return branchHod;
}
public void setBranchHod(String branchHod) {
	this.branchHod = branchHod;
}
public College getCollege() {
	return college;
}
public void setCollege(College college) {
	this.college = college;
}
@Override
public String toString() {
	return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchTotalStrength="
			+ branchTotalStrength + ", branchHod=" + branchHod + ", college=" + college + "]";
}


}
