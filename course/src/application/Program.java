package application;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // CHAMA A FUNÇÃO SCANNER PARA LER UM VALOR DIGITADO
		
		Triangulo x, y;
		x = new Triangulo(); // CRIA UM NOVO OBJETO DO TIPO TRIANGULO
		y = new Triangulo ();
		

		System.out.println("Digite as areas do triangulo X:"); // PRINT DA DELA O COMANDO PARA DIGITAR OS VALORES
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as areas do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area(); // CHAMA O METODO AREA E COLOCA O RESULTADO NA VARIAVEL CRIADA
		double areaY = y.area();

		
		
		System.out.printf("Area do triangulo X: %.4f%n", areaX); // PRINTA NA TELA O RESULTADO DA AREA
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) { // VERIFICA QUAL TRIANGULO É O MAIOR 
			System.out.println("Maior area: X");
		}
		else {
			System.out.println("Maior area: Y");
		}
		
		
		
		sc.close();
	}

}
