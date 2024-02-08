package abono;

import java.util.Scanner;

public class somaAbonoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		float salario, abono, novoSalario;
		
		System.out.println("Digite seu salário: ");
		salario = scan.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = scan.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O valor do abono mais seu salário é: "+novoSalario);
		
	}

}
