package CompetitiveCodingChallenge;
/**
 * 
 * A new deadly virus has infected large population of a planet. 
 * A brilliant scientist has discovered a new strain of virus which can cure this disease.
 * Vaccine produced from this virus has various strength depending on midichlorians count.
 * A person is cured only if midichlorians count in vaccine batch is more than midichlorians count of person. 
 * A doctor receives a new set of report which contains midichlorians count of each infected patient,
 * Practo stores all vaccine doctor has and their midichlorians count.
 * You need to determine if doctor can save all patients with the vaccines he has. 
 * The number of vaccines and patients are equal.

Input Format

First line contains the number of vaccines - N
Second line contains N integers, which are strength of vaccines. 
Third line contains N integers, which are midichlorians count of patients.

Output Format
Print a single line containing 
′Yes′ or ′No′.
 *  
 */
import java.util.Scanner;

public class SavePatients {

	public static void main(String args[] ) throws Exception {
	       Scanner scan = new Scanner(System.in);
	       int n = scan.nextInt();
	       int[] vac = new int[n];
	       int[] mcPat = new int[n];
	       for(int i =0;i<n;i++){
	           vac[i] = scan.nextInt();
	       }
	      for(int i =0;i<n;i++){
	           mcPat[i] = scan.nextInt();
	       }
	        vac = bubbleSort(vac);
	        mcPat = bubbleSort(mcPat);
	        boolean canSave = true;
	        for(int i= 0;i< vac.length;i++){
	        	if(vac[i] < mcPat[i]){
	        		canSave = false;
	        		break;
	        	}
	        }
	        if(canSave){
	        	System.out.println("Yes");
	        }else{
	        	System.out.println("No");
	        }
	    }

	private static int[] bubbleSort(int[] vac) {
		
		for(int i=0;i<vac.length;i++){
			for(int j=i+1;j<vac.length;j++){
				if(vac[i] > vac[j]){
					int temp = vac[i];
					vac[i] = vac[j];
					vac[j] = temp;
				}
			}
		}
		return vac;	
	}

}
