package polymorphism;

public class EmpDetail {
	public void EmpDetails(int id) {
		System.out.println(id);
	}
	public void EmpDetails(int id, String name) {
		System.out.println(id+"  "+ name);
	}
	public void EmpDetails(String email, long mobileNo) {
		System.out.println(email + "  " + mobileNo);
	}
	
	public static void main(String[] args) {
		EmpDetail emp = new EmpDetail();
		emp.EmpDetails(9876);
		emp.EmpDetails(98767, "Shyam");
		emp.EmpDetails("sam@gmail.com", 9876543210L);
	}

}
