package salarioLiquido;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float[] valores = new float[4];
		float salarioLiquido = 0;
		String texto = "Digite o salário bruto: ";
		
		for(int i = 0; i <= 3; i++){
			System.out.println(texto);
			valores[i] = scan.nextFloat();
			if(i == 0) {
				texto = "Digite o adicional noturno: ";
			}
			if(i == 1) {
				texto = "Digite as horas extras: ";
			}
			if(i == 2) {
				texto = "Digite os descontos: ";
			}
		}
		
		salarioLiquido = valores[0] + valores[1] + (valores[2] * 5) - valores[3];
		System.out.println("O salário liquido é: " + salarioLiquido);

	}

}
