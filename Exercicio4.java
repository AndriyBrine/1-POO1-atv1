import java.util.Scanner;
import java.lang.Math;
public class Exercicio4{ 

	public static void main (String[] args){
        int q = 1;
        int V = 0;
        int S;
        
        for(int i = 38; i >= 2; i--){
            S = (i-1) * i/q;
            V = V + S;
            q = q+1;
        }
        System.out.print(V);
	}
}
