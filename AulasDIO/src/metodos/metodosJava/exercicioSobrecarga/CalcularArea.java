package metodos.metodosJava.exercicioSobrecarga;

public class CalcularArea {
	
	public static void areaQuadrilatero(double lado) {
		double area = lado*lado;
		
		System.out.println("A área do Quadrado é: "+area);
	}
	
	public static void areaQuadrilatero(double lado1, double lado2) {
		double area = lado1 * lado2;
		
		System.out.println("A área do Retângulo é: "+area);
	}
	
	public static void areaQuadrilatero(double baseMaior, double baseMenor, double altura) {
		double area = ((baseMaior + baseMenor) * altura) / 2;
		
		System.out.println("A área do Trapézio é: "+area);
	}
	

}
