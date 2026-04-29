package com.studentmanagement;

import java.util.Scanner;

public class Student implements StudentData {
	private int id;
	private String name;
	private int age;
	static Scanner sc = new Scanner(System.in);
	public Student() {
		System.out.println("enter ID");
		this.id=sc.nextInt();
		System.out.println("enter name");
		this.name=sc.next();
		System.out.println("enter age");
		this.age=sc.nextInt();
	}
	public void show() {
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("age:"+this.age);
	}

	static {
		System.out.println("welcome to student amanagement system");
		}
	
}

