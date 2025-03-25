import java.util.Scanner;
import java.lang.Math;
public class Exercicio4{ 

	public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatura Celsius = ");
        int C = scanner.nextInt();
        double F, K; // Pois são decimais
        F = (C * 1.8) + 32;
        K = C + 273.15;
        System.out.printf("Fahrenheit = %.2f ", F);
        System.out.println("");
        System.out.printf("Kelvin = %.2f", K);
        
	}
}
