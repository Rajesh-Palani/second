package object;

public class UseSchoolStudent {
	public static void main(String[] args) {
		SchoolStudent schoolStudent1=new SchoolStudent();
		schoolStudent1.name="raj";
		schoolStudent1.physicsMark=50;
		schoolStudent1.englishMark=70;
		schoolStudent1.tamilMark=80;
		schoolStudent1.socialMark=60;
		schoolStudent1.scienceMark=10;
		schoolStudent1.average=(schoolStudent1.physicsMark+schoolStudent1.englishMark+schoolStudent1.tamilMark+schoolStudent1.socialMark+schoolStudent1.scienceMark)/5;
		System.out.println(schoolStudent1.average);
		SchoolStudent schoolStudent2=new SchoolStudent();
		schoolStudent2.name="kumar";
		schoolStudent2.physicsMark=70;
		schoolStudent2.englishMark=50;
		schoolStudent2.tamilMark=40;
		schoolStudent2.scienceMark=60;
		schoolStudent2.socialMark=50;
		schoolStudent2.average=(schoolStudent2.physicsMark+schoolStudent2.englishMark+schoolStudent2.tamilMark+schoolStudent2.socialMark+schoolStudent2.scienceMark)/5;
		System.out.println(schoolStudent2.average);	
	}

}
