package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Branch;
import com.jsp.service.BranchService;

public class TestBranch {

	public static void main(String[] args) {
		Branch branch = new Branch();

		branch.setId(1);
		branch.setName("Vamshi");
		branch.setPhone(968782989l);
		branch.setAdress("Ameerpet");
		branch.setWebsite("www.jsp.com");

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		BranchService branchService = (BranchService) applicationContext.getBean("branchService");
		Branch branch2 = branchService.saveBranch(branch);

		if (branch != null) {
			System.out.println("Data Saved..");
		} else {
			System.out.println("Plz check the data ");
		}

	}

}
