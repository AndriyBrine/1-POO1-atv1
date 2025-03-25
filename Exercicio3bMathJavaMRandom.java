import java.lang.Math;
import java.util.Random;
public class Exercicio3bMathJava{ 

	public static void main (String[] args){
	    Random random = new Random();
        for (int i = 1; i <=10; i++){
            int x1 = random.nextInt();
            int y1 = random.nextInt();
            int x2 = random.nextInt();
            int y2 = random.nextInt();
            double dstnc = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.printf("%.2f, ", x1);
            System.out.printf("%.2f e ",y1);
            System.out.printf("%.2f,",x2);
            System.out.printf("%.2f, distância: %.2f", y2, dstnc);
            System.out.println("");
        }
    }
}
