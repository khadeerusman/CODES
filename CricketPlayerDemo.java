package in.ac.kletech.cricket;

public class CricketPlayerDemo {

	public static void main(String[] args) {

		CricketPlayer[] C = new CricketPlayer[5];

		C[0]=new CricketPlayer("Sachin",5,450,42.5);
		C[1]=new CricketPlayer("Raina",4,350,25);
		C[2]=new CricketPlayer("Dhoni",6,600,45);
		C[3]=new CricketPlayer("Kohli",5,300,35);
		C[4]=new CricketPlayer("Gambhir",6,420,40);
		CricketPlayer.sortRuns();
		
	}

}
