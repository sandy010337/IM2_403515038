import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

public class ScannerTester{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter two number");
		int number_1 = in.nextInt();
		int number_2= in.nextInt();
		System.out.println("A+B="+(number_1+number_2));
		System.out.println("A-B="+(number_1-number_2));
		System.out.println("A*B="+(number_1*number_2));
		if(number_2<=0){
			System.out.println("The calculation Of divide is'nt reasonable");		
		}	
		else{
			System.out.println("A/B="+(number_1/number_2));
		}
	}
}
