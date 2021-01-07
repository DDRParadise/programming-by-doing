
public class App {

	public static void main(String[] args) {
		
		// print all numbers between 2 and 20. put a ">" on prime numbers
		// prime numbers are divisible only by 1 or itself
		for(int i = 2; i <= 20; i++) {
			if(isPrime(i)) {
				System.out.println(i + " >" );
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println("**************************************************************************************");
		
		// print only prime numbers between 2 and 100
		for(int i = 2; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			} 
		}

	}
	public static boolean isPrime(int n) {
		
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}