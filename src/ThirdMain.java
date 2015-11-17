import java.util.Date;

public class ThirdMain {
	public static void main(String[] args) {
		System.out.println("start: " + new Date());
		
		int maxPrimeFactor = 1;
		long lastCount = 600851475143l;
		
		int i = 2;
		while(lastCount > 1) {
			/*	
			while (true) {
				if(lastCount % i != 0) {
					break;
				}
				
				lastCount = lastCount / i;
				maxPrimeFactor = i;
			}
			*/
			if(lastCount % i == 0) {
				lastCount = lastCount / i;
				maxPrimeFactor = i;
			}
			i++;
		}
		System.out.println("end: " + new Date());
		System.out.println(":::: " + maxPrimeFactor);
	}
}
