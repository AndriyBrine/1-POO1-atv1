import java.lang.Math;

public class Exercicio1 {

	public static void main (String[] args){
		for (int i = 0; i <= 360; i++){
			double angulo = Math.toRadians(i);
			double seno = Math.sin(angulo);

			double cosseno = Math.cos(angulo);

			double tangente = Math.tan(angulo);

			System.out.printf("Ângulo %d ", i);
			System.out.printf(" Seno: %.2f", seno);
			System.out.printf(" Cosseno: %.2f", cosseno);

			if (i == 90 || i == 270){
				System.out.printf(" Tangente: -----");
			} else {
				System.out.printf(" Tangente: %.2f", tangente);
				}
			System.out.println("");
		}
	}
}
