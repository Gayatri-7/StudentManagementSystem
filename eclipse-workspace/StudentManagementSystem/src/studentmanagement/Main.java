package studentmanagement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 Manager manager=new Manager();
	 
     while(true) {
    	 System.out.println("********Student Management System***********");
    	 System.out.println("1.Add a Student");
    	 System.out.println("2.delete a student");
    	 System.out.println("3.View all Students");
    	 System.out.println("4.Search Student");
    	 System.out.println("5.Exit");
    	 System.out.println("Pls choose an option");
    	 int c=scanner.nextInt();
    	 
    	 switch(c) {
    	 
    	 case 1:
    		 
    		 System.out.println("Enter Student name");
    		 scanner.nextLine();
    		 String name=scanner.nextLine();
    		 System.out.println("Enter Student rollno");
    		 int rollNumber=scanner.nextInt();
    		 System.out.println("Enter Student age");
    		 int age=scanner.nextInt();
    		 Student student=new Student(name,rollNumber,age);
    		 manager.addStudent(student);
    		 System.out.println("Student added Successfully");
    		 break;
    		 
    	 case 2:
    		  
    		 System.out.println("to Delete student entry,enter roll number");
    		 int rnoToDelete=scanner.nextInt();
    		 manager.deleteStudent(rnoToDelete);
    		 break;
    	
    	 case 3:
    		 manager.viewAllStudents();
    		 break;
    		 
    	 case 4:
    		 System.out.println("Enter roll number to search");
    		 int rollnoToSearch=scanner.nextInt();
    		 Student foundStudent=manager.searchStudent(rollnoToSearch);
    		 if(foundStudent!=null) {
    			 System.out.println("Student found! "+ foundStudent.getName()+ "," + foundStudent.getAge()+","+foundStudent.getRollNumber());
    		 }
    		 else {
    			 System.out.println("Student not found"); 
    		 }
    		 break;
    		 
    		 
    	 case 5:
    		  
    		 System.out.println("Exiting...");
    		 scanner.close();
    		 System.exit(0);
    		 break;
    		 
    	default:
    		 System.out.println("Invalid choice,Please put a valid choice");
    		 
    		 
    	 
    	 }
     }
	}

}


//while (true) loop is used here to keep the Student Management System running continuously,
//allowing the user to perform multiple operations