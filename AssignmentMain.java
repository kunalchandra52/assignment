package com.ty.assignment;

import java.util.*;


public class AssignmentMain {

	public static void main(String[] args) {
		Set<Student> hashSet=new HashSet<Student>();
		hashSet.add(new Student(1,"Kunal",29,65.9));
		hashSet.add(new Student(2,"Komal",28,66.9));
		hashSet.add(new Student(3,"Sonal",27,67.9));
		hashSet.add(new Student(4,"Kamal",26,68.9));
		hashSet.add(new Student(5,"Chulbul",25,69.9));
		hashSet.add(new Student(6,"Pagal",21,65.91));
		hashSet.add(new Student(4,"Pagal",22,64.9));
		hashSet.add(new Student(3,"Pagal",23,63.9));
		hashSet.add(new Student(2,"Kunal",25,62.9));
		hashSet.add(new Student(1,"Kamal",24,61.9));
		for (Student student : hashSet) {
			System.out.println(student);
		}
		List<Student> list=new ArrayList<Student>(hashSet);
		/*Scanner scan=new Scanner(System.in);
		DecisionClass decisionClass=new DecisionClass();
		decisionClass.sortingDecision();*/
		Scanner scan=new Scanner(System.in);
		int input=1;
		while(input>=1&&input<=4){
			 input=scan.nextInt();
			
			

			if(input==1) {
				Collections.sort(list,new IdWise());
				System.out.println(list);
			}else if(input==2) {
				Collections.sort(list,new MarksWise());
				System.out.println(list);
			}else if(input==3) {
				Collections.sort(list,new AgeWise());
				System.out.println(list);
			}else if(input==4) {
				Collections.sort(list,new NameWise());
				System.out.println(list);
			}else if(input==5) {
				System.exit(input);
				System.out.println(list);
			}else {
				System.out.println("Plz give valid input");
			}
			System.out.println("would u like to sort again if yes press Y else press N");
			String st=scan.next();
			if(st.equals("N")) {
				input=5;
			}
				
		}
		


		
		}

	}







