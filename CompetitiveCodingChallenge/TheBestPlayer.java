package CompetitiveCodingChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBestPlayer {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = br.readLine().split(" ");
		int n = Integer.parseInt(firstLine[0]);
		int t = Integer.parseInt(firstLine[1]);
		String [] names = new String[n];
		int[] fq = new int[n];
		for(int i=0 ;i<n;i++ ){
			String [] inputs = br.readLine().split(" ");
			names[i] = inputs[0];
			fq[i] = Integer.parseInt(inputs[1]);
		}
		
		for(int i = 0;i<n;i++){
			for(int j=0;j<n;j++){
				if(fq[i] > fq[j]){
					int temp_fq = fq[i];
					String temp_names = names[i];
					fq[i] = fq[j];
					fq[j] = temp_fq;
					names[i]=names[j];
					names[j]=temp_names;
				}else if (fq[i] == fq[j]){
					if(names[i].length() < names[j].length()){
						int temp_fq = fq[i];
						String temp_names = names[i];
						fq[i] = fq[j];
						fq[j] = temp_fq;
						names[i]=names[j];
						names[j]=temp_names;
					}
				}
			}
		}
		
		for(int i=0;i<t;i++){
			System.out.println(names[i]);
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
