public class FourthMain {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		int max = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				String multi = i * j + "";
				
				int length = multi.length();
				if(length % 2 == 0) {
					String prev = multi.substring(0, length / 2);
					StringBuffer next = new StringBuffer(multi.substring(length / 2));

					if(prev.equals(next.reverse().toString())) {
						if(max < Integer.parseInt(multi)) {
							max = Integer.parseInt(multi);						
						}
					}					
				}
			}
		}
		
		System.out.println(max);
		System.out.println(System.currentTimeMillis());
	}
}
