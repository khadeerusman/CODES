package in.ac.kletech.cricket;

import java.util.Arrays;

public class CricketPlayer {

		 String sName;
		 int iNumInn;
		 int iiTotalRuns;
		 double fBatAvg;
		CricketPlayer(String sName,int iNumInn,int iiTotalRuns,double fBatAvg){
			
			this.sName=sName;
			this.iNumInn=iNumInn;
			this.iiTotalRuns=iiTotalRuns;
			this.fBatAvg=fBatAvg;
			
		}
	
		public String getsName() {
			return sName;
		}
		public int getiNumInn() {
			return iNumInn;
		}
		public int getiiTotalRuns() {
			return iiTotalRuns;
		}
		public double getfBatAvg() {
			return fBatAvg;
		}
		
		static void sortRuns(){
			int iTotalRuns[]={450,350,600,300,420};
			Arrays.sort(iTotalRuns);
			for(int i=0;i<iTotalRuns.length;i++){
				
				System.out.println("Runs are " +iTotalRuns[i] );

				}
				
			}
			
			
		//}
		
}
