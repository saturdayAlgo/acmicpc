package p02750;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int[] data;
	
	private static void quick(int st, int en) {
		if(en-st<=1) return;
		
		int pivot = data[st];
		int l = st +1;
		int r = en-1;
		while(true) {
			while(l<=r && data[l]<=pivot) l++;
			while(l<=r && data[r] >= pivot)r--;
			if(l>r) break;
			int tmp = data[l];
			data[l] = data[r];
			data[r] = tmp;
		}
		
		int tmp = data[st];
		data[st] = data[r];
		data[r] = tmp;
		
		quick( st,r);
		quick(r+1, en);
	}
	
	private static void custom(int N) {
		for(int i=0; i<N; i++){
			for(int j=i+1; j<N; j++){
				if(data[i]>data[j]){
					int tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
		}
	}
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int N = Integer.parseInt(br.readLine());
			data = new int[N];
			
			for(int i=0; i<N; i++){
				data[i] = Integer.parseInt(br.readLine());
			}
			
//			custom(N);
			quick(0, N);
			
			for(int i=0; i<N; i++){
				System.out.println(data[i]);
			}
			
		} catch (IOException e) {
		}
	}
}
