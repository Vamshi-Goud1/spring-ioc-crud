package com.jsp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jsp.dao.BranchDao;
import com.jsp.dto.Branch;

@Component
public class BranchService {

	BranchDao branchDao = new BranchDao();

	public Branch saveBranch(Branch student) {
		return branchDao.saveBranch(student);
	}

	public Branch getBranchById(int id) {
		return branchDao.getBranchById(id);
	}
	
	public Branch deleteBranch(int id) {
		return branchDao.deleteBranch(id);
	}

	public List<Branch> getAll() {
		return branchDao.getAll();
	}

	public Branch updateBranch(Branch student) {
		return branchDao.updateStudent(student);
	}

	public Branch deleteByName(Branch student) {
		return branchDao.deleteByName(student);
	}
}
