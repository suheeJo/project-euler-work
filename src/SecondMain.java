
public class SecondMain {
	public static void main(String[] args) {
		int lastCount = 4000000;
		
		int prev = 1;
		int next = 2;
		int totalCount = next;
		while(true) {
			next = prev + next;
			
			if(next > lastCount) {
				break;
			}
			
			prev = next - prev;
			if(next % 2 == 0) {
				totalCount = totalCount + next;				
			}
		}
		
		System.out.println("###############");
		System.out.println(totalCount);
		System.out.println("###############");
	}
}
