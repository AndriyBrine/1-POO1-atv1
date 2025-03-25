import java.util.Scanner;



public class Exercicio5bFuncoes {
	// Rallye
	public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double DV = 0;
        int inscV = 0;
        double pont1V = 0;
        double pont2V = 0;
        double pont3V = 0;
        double pont1 = 0;
        double pont2 = 0;
        double pont3 = 0;

        System.out.print("Tempo padrão 1: ");
        double tp1 = scanner.nextDouble();
        System.out.print("Tempo padrão 2: ");
        double tp2 = scanner.nextDouble();
        System.out.print("Tempo padrão 3: ");
        double tp3 = scanner.nextDouble();
        
        System.out.print("Inscrição: ");
		int ninsc = scanner.nextInt();
		
		while (ninsc != 9999){
            System.out.printf("Qual o tempo 1 da equipe %d? ", ninsc);
            double tempo1 = scanner.nextDouble();
            System.out.printf("Qual o tempo 2 da equipe %d? ", ninsc);
            double tempo2 = scanner.nextDouble();
            System.out.printf("Qual o tempo 3 da equipe %d? ", ninsc);
            double tempo3 = scanner.nextDouble();
            
            double D1 = tp1 - tempo1;
            double D1abs = Math.abs(D1);
                if (D1abs < 3){
                    pont1 = 100;
                } else if(3 <= D1abs && D1abs <= 5) {
                    pont1 = 80;
                } else{
                    pont1 = 80 - (D1abs - 5)/5;
                }
            
            double D2 = tp2 - tempo2;
            double D2abs = Math.abs(D2);
                if (D2abs < 3){
                    pont2 = 100;
                } else if(3 <= D2abs && D2abs <= 5) {
                    pont2 = 80;
                } else {
                    pont2 = 80 - (D2abs - 5)/5;
                }
            
            double D3 = tp3 - tempo3;
            double D3abs = Math.abs(D3);
                if (D3abs < 3){
                    pont3 = 100;
                } else if(3 <= D3abs && D3abs <= 5) {
                    pont3 = 80;
                } else{
                    pont3 = 80 - (D3abs - 5)/5;
                }
            
            double DTotal = pont1 + pont2 + pont3;
            
            System.out.printf("Número de inscrição: %d, ", ninsc);
            System.out.printf("Pontos etapa 1: %.2f, ", pont1);
            System.out.printf("Pontos etapa 2: %.2f", pont2);
            System.out.printf("Pontos etapa 3: %.2f, ", pont3);
            System.out.printf("Pontuação total: %.2f, ", DTotal);
            
            if (DTotal > DV){
                DV = DTotal;
                pont1V = pont1;
                pont2V = pont2;
                pont3V = pont3;
                inscV = ninsc;
            }
            System.out.println("");
            System.out.printf("Inscrição: ");
            ninsc = scanner.nextInt();
		}
		
            System.out.printf("Número de inscrição do grupo vencedor: %d, ", inscV);
            System.out.printf("Pontos etapa 1 do grupo vencedor: %.2f, ", pont1V);
            System.out.printf("Pontos etapa 2 do grupo vencedor: %.2f, ", pont2V);
            System.out.printf("Pontos etapa 3 do grupo vencedor: %.2f, ", pont3V);
            System.out.printf("Pontuação total do grupo vencedor: %.2f, ", DV);
}
}
