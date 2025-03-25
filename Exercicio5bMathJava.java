import java.util.Scanner;
import java.lang.Math;
public class Exercicio5bMathJava{ 

	public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
	    int l1, l2, l3;
	System.out.print("Valor de Lado 1: ");
        l1 = scanner.nextInt();
        System.out.print("Valor de Lado 2: ");
        l2 = scanner.nextInt();
	System.out.print("Valor de Lado 3: ");
        l3 = scanner.nextInt();
        
        if (!(l1+l2 <= l3 || l2+l3<=l1 || l3+l1<=l2)){
            System.out.print("É triângulo! ");
            
            if(Math.pow(l1,2) == Math.pow(l2,2) + Math.pow(l3,2) || Math.pow(l2,2) == Math.pow(l3,2) + Math.pow(l1,2 ) || Math.pow(l3,2) == Math.pow(l1,2) + Math.pow(l2,2)){
                System.out.print("É retângulo! ");
            } else{
                System.out.print("Não é retângulo! ");
            }
        } else {
            System.out.print("Não é triângulo! ");
        }
    		scanner.close();
	}
}
