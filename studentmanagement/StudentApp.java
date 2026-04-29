package com.studentmanagement;

import java.util.Scanner;

public class StudentApp  {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	StudentData service =new Student();
	
	
	
	service.show();
	
	}

}
