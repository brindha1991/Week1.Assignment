package assignment.week1;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=13;
		int i;
		boolean flag= false;

		for(i=2;i<=(num/2);i++) {

			if (num % i == 0) {
				flag = true;
				break;  
			}
		}
		
		if (flag == true) {
			System.out.println(num + " is not a prime number");
		}
		else {
			System.out.println(num + " is prime number");
		}


	}

}


