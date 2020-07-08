package p02217;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int i=0; i<n; i++){
                int tmp = Integer.parseInt(br.readLine());
                list.add(tmp);
            }
            
            Collections.sort(list, Comparator.reverseOrder());
            Iterator<Integer> it = list.iterator();
            
            int res = 0;
            int cnt = 0;
            while(it.hasNext()){
                cnt++;
                int num = it.next();
                res = Math.max(num*cnt, res);
            }
            
            System.out.println(res);
        } catch(IOException e){
        }
	}
}
