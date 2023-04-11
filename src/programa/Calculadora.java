package programa;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String operacao;
		int fator1, fator2, resultado;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual operação você quer fazer? ");
		operacao = sc.nextLine();
		
		while (operacao != "s" || operacao != "S") {
			fator1 = sc.nextInt();
			fator2 = sc.nextInt();
			if (operacao == "+") {
				resultado = fator1 + fator2;
				System.out.println(resultado);
			}
			if (operacao == "-") {
				resultado = fator1 - fator2;
				System.out.println(resultado);
			}
			if (operacao == "*") {
				resultado = fator1 * fator2;
				System.out.println(resultado);
			}
			if (operacao == "/") {
				if (fator2 == 0) {
					System.out.println("Erro: divisão por zero!");
				}
				else {
					resultado = fator1 / fator2;
					System.out.println(resultado);
				}
			}
			else {
				System.out.println("Erro: operação inválida!");
			}
		}
		sc.close();
	}

}
