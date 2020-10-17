package p05430;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
class Solution{
	public void solve() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String[] ops = br.readLine().split("");
			int size = Integer.parseInt(br.readLine());
			boolean flag = true;	// true : LEFT, false : RIGHT
			boolean errFlag = false;
			String[] tokens = br.readLine().replace("[", "").replace("]", "").split(",");
			

			Deque<Integer> list = new LinkedList<Integer>();
			int[] data = new int[size];

			for (int j = 0; j < size; j++) {
				list.add(Integer.parseInt(tokens[j]));
			}
			for(String oper : ops) {
				if("R".equals(oper)) {
					flag = !flag;
				}else if("D".equals(oper)) {
					if(list.isEmpty()) {
						errFlag = true;
						break;
					} else {
						if(flag) {
							list.pollFirst();
						} else {
							list.pollLast();
						}
					}
				}
			}
			StringBuffer res = new StringBuffer();
			if(errFlag) {
				sb.append("error").append("\n");
			} else {
				res.append("[");
				int listSize = list.size();
				if(flag) {
					while(!list.isEmpty()) {
						res.append(list.pollFirst()).append(",");
					}
				} else {
					while(!list.isEmpty()) {
						res.append(list.pollLast()).append(",");
					}
				}
				
				if(listSize>0) {
					res = res.deleteCharAt(res.length()-1);
				}
				res.append("]");
				sb.append(res).append("\n");
				
			}
		}
		System.out.print(sb);
	}
}
public class Main {

	public static void main(String[] args) throws Exception {
		new Solution().solve();
	}
}
