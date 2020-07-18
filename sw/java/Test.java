
public class Test {
	public static void main(String[] args) {
		int i=10, result = 0;
		
		while(i>1) {
			i--;
			if(i%3==1) {
				System.out.println(result + " += " + i );
				result+=i;
			}
		}
		System.out.println(result);
	}
}
