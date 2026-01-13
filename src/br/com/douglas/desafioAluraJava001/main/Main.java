package br.com.douglas.desafioAluraJava001.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome = "Douglas Borges";
		String tipoConta = "Corrente";
		double saldo = 0;
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Tipo de conta: " + tipoConta);
		System.out.println("Saldo atual:" + saldo);

		int opcao = 0;
		Scanner leitura = new Scanner(System.in);
		while (opcao != 4) {
			System.out.println("""
					
					Digite uma opção
					1 - Cosultar saldo
					2 - Transferir valor
					3 - Receber valor
					4 - Sair

					""");
			opcao = leitura.nextInt();
			
			if (opcao == 1) {
				System.out.println("Saldo: " + saldo);
			} else if (opcao == 2) {
				System.out.println("Qual o valor que deseja transferir ");
				double valor = leitura.nextDouble();
				if (valor > saldo) {
					System.out.println("Não é possivel realizar a transferência");
				} else {
					saldo -= valor;
					System.out.println("Novo saldo: " + saldo);
				}
			} else if (opcao == 3) {
				System.out.println("Valor recebido: ");
				double valor = leitura.nextDouble();
				saldo += valor;
				System.out.println("Novo saldo: " + saldo);
			} else if (opcao != 4) {
				System.out.println("Opção invalida!");
			}
			
		}

	}

}
