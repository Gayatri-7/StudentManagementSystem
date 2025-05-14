package studentmanagement;

public class Student {
    private String name;
	private int rollNumber;
	private int age;
	
	public Student(String name,int rollNumber,int age) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.age=age;
	}
  
	
   public String getName() {
	   return name;
   }
   public int getRollNumber() {
	   return rollNumber;
   }
   public int getAge() {
	   return age;
   }
   
   public void setName(String name) {
	   this.name=name;
   }
    public void setRollNumber(int rollNumber) {
	   this.rollNumber=rollNumber;
   }
   public void setAge(int age) {
	   this.age=age;
	   
 }
}
