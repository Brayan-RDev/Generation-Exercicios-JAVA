package media;

import java.util.Scanner;

public class SomaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float[] notas = new float[4];
		float media = 0;
		int auxiliar = 0;
		
		for(int i = 0; i <= 3; i++){
			System.out.println("Digite a nota: ");
			notas[i] = scan.nextFloat();
			media = media + notas[i];
			auxiliar += 1;
		}
		
		media = media / auxiliar;
		System.out.println("A média é: "+ media);
	}

}
