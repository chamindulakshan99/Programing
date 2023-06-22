import java.util.ArrayList;

public class Q3{
	public static void main(String[] args){
		ArrayList<Student> list = new ArrayList<>();
	
		Student s1 = new Student( "John Doe",18,85.5);
		Student s2 = new Student( "Jane Smith",17,92.0);
		Student s3 = new Student( "Michael Johnson",19,78.3);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student student : list){
			System.out.printf("Name: %s , Age: %d , Grade: %.1f\n",student.getName(),student.getAge(),student.getGrade());
		}
		
		System.out.println();
		
		
		for(Student student : list){
			if(student.getName()=="John Doe"){
				student.setGrade(90.2);
				System.out.printf("After Modification => Name: %s , Age: %d , Grade: %.1f\n",student.getName(),student.getAge(),student.getGrade());
				break;
			}
		}
		
		System.out.println("\nAfter removing Element => ");
		
		for(int i=0;i<list.size();i++){
			Student student= list.get(i);
			if(student.getName()=="Jane Smith"){
				list.remove(i);
			}
		}
		
		for(Student student : list){
			System.out.printf("Name: %s , Age: %d , Grade: %.1f\n",student.getName(),student.getAge(),student.getGrade());
		}
		
		System.out.println();
		
		
	}
}

class Student{
	private String name;
	private int age;
	private double grade;
	
	public Student(String name,int age,double grade){
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setGrade(double grade){
		this.grade=grade;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getGrade(){
		return grade;
	}
	
	
}