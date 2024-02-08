package calculeDiferenca;

import java.util.Scanner;

public class CalculeDiferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float[] valores = new float[4];
		float diferenca = 0;
		int auxiliar = 1;
		
		for(int i = 0; i <= 3; i++){
			System.out.println("Digite o " + auxiliar + "° valor: ");
			valores[i] = scan.nextFloat();
			auxiliar +=1;
		}
		diferenca = (valores[0] * valores[1]) - (valores[2] * valores[3]);
		System.out.println("A diferença é: " + diferenca);

	}

}
