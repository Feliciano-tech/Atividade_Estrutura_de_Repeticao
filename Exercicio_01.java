package Estrutura_de_Repeticao;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		int cod;
		double n1, n2, n3, media; // declarando variaveis
		Scanner ler = new Scanner(System.in); // criando objeto de leitura

		do { // metodo "do" para inicio de ciclo de repeticao
			System.out.printf("Digite o codigo do aluno: "); // impriminto orientacao para o usuario
			cod = ler.nextInt(); // recebendo informacao pelo teclado do usuario
			if (cod == 0) {
				// utilizando condicional if e declarando condicao
				System.out.printf("\nAte a proxima avaliacao.");
			} else {
				// caso a condicao declarada no if seja falsa o else sera executado
				System.out.printf("Digite a primeira nota do aluno: ");
				n1 = ler.nextDouble();

				System.out.printf("Digite a segunda nota do aluno: ");
				n2 = ler.nextDouble();

				System.out.printf("Digite a terceira nota do aluno: ");
				n3 = ler.nextDouble();

				media = (n1 + n2 + n3) / 3; // fazendo o calculo da media e guardando resultado dentro da variavel
											// "media"

				if (media >= 8) {

					System.out.println("\nAluno Codigo (" + cod + ")." + "\nMedia: " + media + "\nStatus: Aprovado.\n");

				} else if (media < 8 && media > 6) {

					System.out.println(
							"\nAluno Codigo (" + cod + ")." + "\nMedia: " + media + "\nStatus: Recuperacao.\n");

				} else if (media <= 6) {

					System.out
							.println("\nAluno Codigo (" + cod + ")." + "\nMedia: " + media + "\nStatus: Reprovado.\n");

				}

			}

		} while (cod >= 1);// declaracao de condicao para que o laço continue enquanto a variavel cod for
							// maior ou igual a 1
		ler.close(); // encerrando a leitura do teclado
	}

}
