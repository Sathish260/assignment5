package org.college;


	public class Student extends department{
		
		public void studentName() {
			System.out.println("ram");
		}
		public void studentDepartment() {
			System.out.println("MCA");
		}
		public void studentID() {
			System.out.println("1290");
		}
		
		public static void main(String[] args) {
			Student call = new Student();
			call.collegeName();
			call.collegeCode();
			call.collegeRank();
			call.departmentName();
			call.studentName();
			call.studentDepartment();
			call.studentID();
			

		}
}
