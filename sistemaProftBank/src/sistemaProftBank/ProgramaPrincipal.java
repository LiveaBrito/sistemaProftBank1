package sistemaProftBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		List<BankDados> dadosCliente = new ArrayList<>();
		
		
		BankDados dado = new BankDados();
		int opcao;
		
		do {
			
			System.out.println("*********************");
			System.out.println("     MENU PRINCIPAL  ");
			System.out.println("*********************");
			System.out.println();
			System.out.println("1 - CRIANDO A CONTA CORRENTE"); //CADASTRANDO O TITULAR
			System.out.println("2 - MOSTRAR TODOS AS CONTAS");
			System.out.println("3 - MOSTRAR DADOS DA CONTA DESEJADA");
			System.out.println("4 - ALTERAR DADOS DA CONTA CORRENTE");
			System.out.println("5 - EXCLUIR CONTA CORRENTE");
			System.out.println("6 - EFETUAR DEPÓSITO");
			System.out.println("7 - EFETUAR PAGAMENTO");
			System.out.println("8 - EFETUAR TRANSFERENCIA ENTRE CONTAS");
			System.out.println("9 - FINALIZAR O SISTEMA");
			System.out.print("Digite a opção desejada: ");
			//opcao = leitor.nextInt();
			
			
			try {
			opcao = leitor.nextInt();
			switch (opcao) {
			case 1:
				dado.cadastrar (leitor,dadosCliente);
				
				break;
				
			case 2:
				dado.mostrarTodosOsClientes(dadosCliente);
				
				break;
				
			case 3:
				dado.mostrarDadosContaDesejada(leitor, dadosCliente);
				
				break;
				
			case 4:
				dado.alterarCadastro(leitor,dadosCliente);
				
				break;
				
			case 5:
				dado.excluirConta(leitor,dadosCliente);
				
				break;
				
			case 6:
				dado.efetuarDeposito(leitor,dadosCliente);
				
				break;
				
			case 7:
				dado.efetuarPagamento(leitor,dadosCliente);
				
				break;
			
			case 8:
				dado.transferirEntreContas(leitor, dadosCliente);
				
				break;
			
			case 9:
				dado.encerrarSistema(leitor);
				
				break;
			
		default:
			System.out.println();
			System.out.println("OPÇÃO INVÁLIDA");
			System.out.println();
			}
			
		} catch (Exception e){
				System.out.println("OPÇÃO INVÁLIDA"); //caso o usuario digite algo errado, ele vai continuar o programa
				leitor.next();
				opcao = 0;
			}
			
			
		} while (opcao != 9);
		
	}
		
}


