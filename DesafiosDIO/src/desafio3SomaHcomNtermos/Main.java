package desafio3SomaHcomNtermos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double h = 0;
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();

		for (int i = 1; i <= n; i++) {
			h = h + (1.0/i);
		}
		
		
		System.out.println((int)Math.round(h));
		
		sc.close();

	}

}
