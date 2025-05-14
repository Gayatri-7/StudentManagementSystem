package studentmanagement;
import java.util.ArrayList;
public class Manager {

	private ArrayList<Student> students;//variable students
    public Manager() {
    	students=new ArrayList<>();
    }
    //add student
    public void addStudent(Student student) {
    	students.add(student);
    }
    
   //Delete student by rollNumber
    public void deleteStudent(int rollNumber) {
    	for(int i=0;i<students.size();i++) {
    		Student student =students.get(i);//first get the student
    		if(student.getRollNumber()==rollNumber) { //get his rollnumber
    			students.remove(i);
    			return;	
    		}
    		else {
    			System.out.println("Student not found");
    		}
    	}
    }
    
    //View students
    public void viewAllStudents() {
    	if(students.isEmpty()) {
    		System.out.println("Student not found");
    		return;
    	}
    	else {
    		for(int i=0;i<students.size();i++) {
    			Student student=students.get(i);//bcs in ArrayList u have to explicitly get each element
    			System.out.println("Name: "+ student.getName()+" RollNumber: "+ student.getRollNumber()+" Age: "+ student.getAge());
    		}
    	}
    }
    
    //Search Student
    public Student searchStudent(int rollNumber) {
    	for(int i=0;i<students.size();i++) {
    		Student student=students.get(i);
    		if(student.getRollNumber()==rollNumber) {
    			return student;
    		}
    	}
    		 
    			return null;
    		
    	}
    }
  
    
    
    
    
    
 
