package numberTheory1.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConfusedMonk {

	static int GCD(int A, int B) {
		if (B == 0)
			return A;
		else
			return GCD(B, A % B);

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N - 1];
		String line = br.readLine();
		String[] temp = line.split(" ");
		int result = Integer.parseInt(temp[0]);

		for (int i = 0; i < N - 1; i++) {
			arr[i] = Integer.parseInt(temp[i + 1]);

		}
		for (int i = 0; i < N - 1; i++) {

			result = GCD(result, arr[i]);
		}

		long c=(long)(Math.pow(10, 9)+7);
	//	System.out.println(result);
		long fOx=Integer.parseInt(temp[0]);;
		for(int i=0;i<arr.length;i++){
			fOx=fOx*arr[i];
			fOx=(long) (fOx%c);
		}
		long ans=1;
		while(result!=0){
			
			if(result%2==1){
				ans=ans*fOx;
				ans=ans%c;
								
			}
			
			fOx=fOx*fOx;
			fOx=fOx%c;
			result=result/2;
			
		}
		System.out.println(ans);
	}

}
