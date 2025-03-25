import java.util.Scanner;
import java.lang.Math;
public class Exercicio4{ 

	public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double Q;
        
        System.out.print("Massa do corpo (gramas) = ");
        int mc = scanner.nextInt();
        System.out.print("Calor específico da substância (cal/g°C) = ");
        int ce = scanner.nextInt();
        System.out.print("Variação de temperatura (celsius) = ");
        int C = scanner.nextInt();
        
        Q = mc * ce * C;
        
        System.out.printf("Quantidade de calor necessária para aquecer o corpo = %.2f", Q);
        scanner.close();
	}
}
