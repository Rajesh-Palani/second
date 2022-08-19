package object;

public class UseStudent {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="raj";
		student1.height=50.6f;
		student1.weight=63.1f;
		student1.age=17;
		student1.qualification="B.E Mechanical";
		student1.ismale=true;
		Student student2=new Student();
		student2.name="kumar";
		student2.height=5.3f;
		student2.weight=60.8f;
		student2.age=9;
		student2.qualification="B.E Civil Engineering";
		student2.ismale=true;
		System.out.println(student1.name+" "+student1.height+" "+student1.weight+" "+student1.age+" "+student1.qualification+" "+student1.ismale);
		System.out.println(student2.name+" "+student2.height+" "+student2.weight+" "+student2.age+" "+student2.qualification+" "+student2.ismale);
		
		
				
		
		
		
	}

}
