package desafio8Triangulo;

import java.util.Scanner;

/*
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
 * Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados)
 * e apresentea mensagem: Perimetro = XX.X
 * Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura,
 * mostrando a mensagem: Area = XX.X
 * Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2
 */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		boolean triangulo = false;
		
		if(a > (Math.abs(b-c)) && a <(Math.abs(b+c))) {
			triangulo = true;
		}
		
		else if(b > (Math.abs(a-c)) && b <(Math.abs(a+c))) {
			triangulo = true;
		}
		
		else if(c > (Math.abs(b-a)) && c <(Math.abs(b+a))) {
			triangulo = true;
		}
		
		if (triangulo == true) {
			double perimetro = a+b+c;
			System.out.println("Perimetro = "+perimetro);
		}
		else if(triangulo == false) {
			double area = (((a+b)*c)/2);
			System.out.println("Area = "+area);
		}
		
		

	}

}
