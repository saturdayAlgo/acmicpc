package p02750;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int N = Integer.parseInt(br.readLine());
			int[] data = new int[N];
			
			for(int i=0; i<N; i++){
				data[i] = Integer.parseInt(br.readLine());
			}
			
			for(int i=0; i<N; i++){
				for(int j=i+1; j<N; j++){
					if(data[i]>data[j]){
						int tmp = data[i];
						data[i] = data[j];
						data[j] = tmp;
					}
				}
			}
			
			for(int i=0; i<N; i++){
				System.out.println(data[i]);
			}
			
		} catch (IOException e) {
		}
	}
}
