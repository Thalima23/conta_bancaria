package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();
	
	public static void main(String[] args) {
		
		
		
		int opcao; // armazena o nº correspondente a opçao do menu escolhida pelo usuário.
		
		
		// Instanciar Objetos da Classe Conta
		
		Conta c1 = new Conta(1, 123, 1, "Cintia Dourado", 500000.00f);
		Conta c2 = new Conta(2, 123, 2, "Priscila Lins", 500000.00f);
		System.out.println("O Saldo da conta é: " + c1.getSaldo());
		
		c1.setSaldo(6000000.00f);
		
		
		System.out.println("O Saldo da conta é: " + c1.getSaldo());
		
		c1.visualizar();
		c2.visualizar();
		c1.sacar(1000);
		
		System.out.println(c1.sacar(1000));
		System.out.println("O saldo da conta é: " + c1.getSaldo());
	
		System.out.println(c2.sacar(1000000));
		System.out.println("O saldo da conta é: " + c2.getSaldo());
		
		c1.depositar(5000);
		System.out.println("O saldo da conta é: " + c1.getSaldo());
		
		// Instanciar Objetos da Classe ContaCorrente
		ContaCorrente cc1= new ContaCorrente(3, 456, 1, "Thuany Silva", 1000000.00f, 100000.00f);
		
		cc1.visualizar();
		
		// Instanciar Objetos da Classe Conta Poupanca
		ContaPoupanca cp1= new ContaPoupanca(4, 567,2, "Thalita Lima", 100000.00f, 30);
		
		cp1.visualizar();
		cp1.sacar(1000.00f);
		cp1.visualizar();
		cp1.depositar(500.00f);
		cp1.visualizar();
		
		//Sacar conta corrente
		System.out.println(cc1.sacar(2000000.00f));
		cc1.visualizar();

		cc1.visualizar();
		System.out.println(cc1.sacar(2000.00f));
		cc1.visualizar();
		
		//Depositar conta corrente
		cc1.depositar(5000.00f);
		cc1.visualizar();
		
		

		while (true) { //true indica que o laço será infinito, ou seja, continuará até que ocorra uma interrupção manual 
			
			// Construindo a estrutura visual do menu:
			
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + Cores. ANSI_CYAN_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                                                     ");
			System.out.println("               Anubi's Bank                          ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			try {
			opcao = leia.nextInt();
			leia.nextLine();
			}catch(InputMismatchException e){
			opcao = -1; 
				System.out.println("\nDigite um número entre 0 e 8");
			}
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nAnubis's Bank - Descomplicando seu presente e seu futuro!");
				sobre();
                 leia.close();
				System.exit(0);
		}

		switch (opcao) { // condicional por casos, para tratar as opções de 1 a 8. Cada número acionará uma mensagem específica
		case 1:
			System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
			keyPress();
			break;
		case 2:
			System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
			keyPress();
			break;
		case 3:
			System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
			keyPress();
			break;
		case 4:
			System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
			keyPress();
			break;
		case 5:
			System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
			keyPress();
			break;
		case 6:
			System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
			keyPress();
			break;
		case 7:
			System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
			keyPress();
			break;
		case 8:
			System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
			keyPress();
			break;
			
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
			keyPress();
			break;
				
		}
	}


public static void sobre() {
	System.out.println("\n*********************************************************");
	System.out.println("Projeto Desenvolvido por: Thalita Lima");
	System.out.println("Contato: thalitalima23@gmail.com");
	System.out.println("Github: https://github.com/Thalima23");
	System.out.println("*********************************************************");
	
	
}

public static void keyPress() {
System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
leia.nextLine();

		
}		
}


