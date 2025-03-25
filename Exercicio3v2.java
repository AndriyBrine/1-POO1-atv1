import java.lang.Math;
import java.util.Random;
public class Exercicio3v2{ 

	public static void main (String[] args){
	    Random random = new Random();
        for (int i = 1; i <=10; i++){
            int x1 = random.nextInt(201) - 100;
            int y1 = random.nextInt(201) - 100;
            int x2 = random.nextInt(201) - 100;
            int y2 = random.nextInt(201) - 100;
            double dstnc = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.printf("%d,", x1);
            System.out.printf("%d e ",y1);
            System.out.printf("%d,",x2);
            System.out.printf("%d, distância: %.2f", y2, dstnc);
            System.out.println("");
            
        }
    }
}
