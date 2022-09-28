import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tipo de combustivel que voc~e deseja ultilizar");
		
		int gas = 0;
		int alco = 0;
		int diel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			 if (tipo == 1) {
				 gas = gas + 1;
			 }
			 else if (tipo == 2) {
				 alco = alco + 1;
			 }
			 else if (tipo == 3) {
				 diel = diel + 1;
			 }
			 else if (tipo > 4) {
				 System.out.println("Codigo invalido, digite novamente entre 1 e 4");
			 }
			 
			 tipo = sc.nextInt();
		}
		System.out.println("Muito obrigado");
		
		
	}

}
