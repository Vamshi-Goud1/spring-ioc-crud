package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dto.Branch;
import com.jsp.service.BranchService;

public class TestDeleteBranch {
  public static void main(String[] args) {
	  ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		BranchService branchService = (BranchService) applicationContext.getBean("branchService");
		Branch branch=branchService.deleteBranch(1);
		
		if(branch != null) {
			System.out.println("Data deleted..");
		}else {
			System.out.println("plz check the id");
		}
  }
}