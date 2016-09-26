package in.ac.kletech.university;

public class UniversityDemo {


	public static void main(String[] args) {
		
	
	University KLETECH = new University();
	
	KLETECH.createSchools();
	KLETECH.cal_stud();
	
	for(int i=0;i<KLETECH.noofStud.length;i++)
	{
		if(KLETECH.noofStud[i]!=0)
			System.out.println("No Students in "+KLETECH.s[i].getProgcode()+" are  "+KLETECH.noofStud[i]);
	}
	System.out.println("--------------------------------------------------S\n");
	
}
}