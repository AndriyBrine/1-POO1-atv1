import java.lang.Math;

public class Exercicio1bMathJava {

	public static void main (String[] args){
		for (int i = 0; i <= 360; i++){
			double angulo = Math.toRadians(i);
			double seno = Math.sin(angulo);

			double cosseno = Math.cos(angulo);

			double tangente = Math.tan(angulo);

			System.out.printf("Ângulo %d ", i);
			System.out.printf(" Seno: %.3f", seno);
			System.out.printf(" Cosseno: %.3f", cosseno);

			if (i == 90 || i == 270){
				System.out.printf(" Tangente: -----");
			} else {
				System.out.printf(" Tangente: %.3f", tangente);
				}
			System.out.println("");
			System.out.println("-------------------------------------------------------------");
		}
	}
}
