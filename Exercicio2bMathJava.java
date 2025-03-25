public class Exercicio2{

	public static long f_fatorial (int n){
		long f = 1;

		for(long i = 1; i <= n; i++){
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args){
		for(int i = 0; i <= 15; i++){
			System.out.printf("Número: %d ", i);
			System.out.printf("Fatorial: %d",f_fatorial(i));
			System.out.println("");
		}
	}
}
