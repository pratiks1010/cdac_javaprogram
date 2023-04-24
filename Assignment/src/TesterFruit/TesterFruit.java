package TesterFruit;

import java.util.Scanner;

import com.code.Apple;
import com.code.Mango;
import com.code.Orange;

public class TesterFruit {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		Apple a = new Apple(sc.next(), sc.nextDouble(), sc.next());
		System.out.println(a);
		System.out.println(a.taste());
		System.out.println("");
		System.out.println("Details Of apple :");
		a.jam();
		System.out.println("");

		Orange o = new Orange(sc.next(), sc.nextDouble(), sc.next());
		System.out.println(o);
		System.out.println(o.taste());
		System.out.println("");
		System.out.println("Details Of Orange :");
		o.juice();
		System.out.println("");
		Mango m = new Mango(sc.next(), sc.nextDouble(), sc.next());
		System.out.println(m);
		System.out.println(m.taste());
		System.out.println("");
		System.out.println("Details Of Mango :");
		m.pulp();

		
	
	}

}
