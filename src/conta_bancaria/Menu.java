package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);
	private static final ContaController contaController = new ContaController();
	
	public static void main(String[] args) {
		
		
		int opcao; // armazena o nº correspondente a opçao do menu escolhida pelo usuário.
		
		criarContasTeste();
		
	
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
				leia.nextLine();
			}
			
				if (opcao == 0) {
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
			
			listarContas();
			
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

		private static void criarContasTeste() { 
	contaController.cadastrar(new ContaCorrente(1, 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
	contaController.cadastrar(new ContaPoupanca(2, 456, 2, "Marcia Condarco", 1000000.00f, 10));
	}

		private static void listarContas() {
	contaController.listarTodas();
}
}