
public class FirstMain {
	public static void main(String[] args) {
		int totalCount = 0;
		int lastCount = 1000;
		
		for (int i = 3; i < lastCount; i+=3) {
			totalCount = totalCount + i;
		}
		
		for (int i = 5; i < lastCount; i+=5) {
			if(i % 15 != 0) {
				totalCount = totalCount + i;				
			}
		}
		
		System.out.println("###############");
		System.out.println(totalCount);
		System.out.println("###############");
	}
}
