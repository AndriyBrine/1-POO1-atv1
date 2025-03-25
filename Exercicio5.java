import java.util.Scanner;
import java.lang.Math;
public class Exercicio5{ 

	public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
	    int l1, l2, l3;
        l1 = teclado.nextInt();
        l2 = teclado.nextInt();
        l3 = teclado.nextInt();
        if (!(l1+l2 <= l3 || l2+l3<=l1 || l3+l1<=l2)){
            System.out.print("É triângulo! ");
            if(Math.pow(l1,2) == Math.pow(l2,2) + Math.pow(l3,2)){
                System.out.print("É retângulo! ");
            } else if (Math.pow(l2,2) == Math.pow(l3,2) + Math.pow(l1,2)){
                System.out.print("É retângulo! ");
            } else if (Math.pow(l3,2) == Math.pow(l1,2) + Math.pow(l2,2)){
                System.out.print("É retângulo! ");
            } else{
                System.out.print("Não é retângulo! ");
            }
        } else {
            System.out.print("Não é triângulo! ");
        }
	}
}
