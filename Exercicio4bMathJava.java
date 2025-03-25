import java.lang.Math;
public class Exercicio4{ 

	public static void main (String[] args){
        float q = 1;
        float V = 0;
        float S;
        
        for(int i = 38; i >= 2; i--){
            S = (i-1) * i/q;
            V = V + S;
            q = q+1;
        }
        System.out.printf("%.2f",Math.sqrt(V));
	}
}
