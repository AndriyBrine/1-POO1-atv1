import java.lang.Math;
public class Exercicio3bMathJavaMRandom{ 

	public static void main (String[] args){
        for (int i = 1; i <=10; i++){
            double x1 = Math.random();
            double y1 = Math.random();
            double x2 = Math.random();
            double y2 = Math.random();
            double dstnc = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.printf("%.2f, ", x1);
            System.out.printf("%.2f e ",y1);
            System.out.printf("%.2f,",x2);
            System.out.printf("%.2f, distância: %.2f", y2, dstnc);
            System.out.println("");
        }
    }
}
