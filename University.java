package in.ac.kletech.university;

public class University {

		 static String CET1="E30",CET2="E241";
		 
		static{
		System.out.println("Welcome to KLE TECh University\n");
		System.out.println("CET Codes are "+CET1+" and "+ CET2);
		}
		
		
		int noofStud[]=new int[5];
		School[] s=new School[5];
		
		class School{
			private String progcode;
			private String SchCoord;
			private int noofStud;
			private int noofStaff;
			public String getProgcode() {
				return progcode;
			}
			public String getSchCoord() {
				return SchCoord;
			}
			public int getNoofStud() {
				return noofStud;
			}
			public int getNoofStaff() {
				return noofStaff;
			}
			public School(String progcode,String SchCoord,int noofStud,int noofStaff)
			{
				super();
				this.progcode=progcode;
				this.SchCoord=SchCoord;
				if(noofStud>120)
				{
					this.noofStud=noofStud;
					System.out.println("Intake exceeded in "+progcode +" that is " +noofStud );
					
				}
				else
					this.noofStud=noofStud;
					this.noofStaff=noofStaff;
			}
	 	}
		
		void createSchools()
		{
			s[0]= new School("CS","AMIT",50,6);
			s[1]= new School("E&C","VAIBHAV",60,7);
			s[2]=new School("E&E","ROHINI",150,20);
			s[3]=new School("MECH","MANTESH",80,15);
			s[4]=new School("CIVIL","SHRISHAIL",90,10);
		}
		void cal_stud()
		{
			
			for(int i=0;i< noofStud.length;i++)
			{ 
				noofStud[i]=s[i].getNoofStud();	
			}
				
		}
	
}