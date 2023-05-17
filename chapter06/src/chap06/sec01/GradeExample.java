package chap06.sec01;

public class GradeExample {
	public static void main(String[] args) {
	
	Grade grade=new Grade();
	
	grade.x=90;
	grade.y=80;
	grade.z=70;


	System.out.println("รัมก: " + grade.gradesum());

	grade.getgradeavg();
		
	}

}

