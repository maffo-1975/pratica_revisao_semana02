package ProgramaPrincipal;

import java.util.Locale;
import java.util.Scanner;

import LojaSuprimentosInformatica.Fatura;

public class GeradorFatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero: ");
		String numero = sc.nextLine();
		
		System.out.print("Descri��o: ");
		String descricao = sc.nextLine();
		
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		
		System.out.print("Pre�o: ");
		double preco = sc.nextDouble();
		
		Fatura fatura = new Fatura(numero, descricao, quantidade, preco);
		
		System.out.println();
		System.out.print(fatura);
		
		sc.close();

	}

}
