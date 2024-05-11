package sistemaProftBank;

import java.util.InputMismatchException;
import java.util.List;
//import java.util.Scanner;
import java.util.Scanner;

public class BankDados {
	
	//Construtor
	public BankDados (String numeroDaConta, String titular, double saldoInicial, double saldoLimite) {
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		this.saldoInicial = saldoInicial;
		this.saldoLimite = saldoLimite;
		
		
	}
	
	//Construtor Padrão
	public BankDados() {}
	
	
	//Atributos
	private String numeroDaConta;
	private String titular;
	private double saldoInicial;
	private double saldoLimite;
	
	
	//Métodos do Menu
	// ----> 1
	public void cadastrar (Scanner leitor, List<BankDados> dadosCliente) { 
		
	try { //acha o erro ao digitar os valores errados
		System.out.println();
		System.out.println("***************************");
		System.out.println("CRIANDO A CONTA CORRENTE"); //CADASTRANDO UM NOVO CLIENTE
		System.out.println("******************************");
		System.out.println();
		
		
		System.out.println("Numero da Conta: ");
		String numeroDaConta = leitor.next();
		
		System.out.println("Nome do titular: ");
		String titular = leitor.next(); //para escrever um nome mais extenso (no caso um nome completo, com espaços entre eles)
		
			
		System.out.println("Saldo Inicial: ");
		double saldoInicial = leitor.nextDouble();
				
				
		System.out.println("Saldo limite: ");
		double saldoLimite = leitor.nextDouble();
				
	
		//Cria um objeto e insere as informações dentro dele
		BankDados dado = new BankDados(numeroDaConta, titular, saldoInicial, saldoLimite);
		
		//Adiciona o objeto dentro do vetor (simulando o banco de dados)
		dadosCliente.add(dado);
		
		System.out.println();
		System.out.println("****CORRENTISTA CADASTRADO COM SUCESSO!!!****");
		
	}catch (InputMismatchException erro) { //identifica o caracter errado que o usuario escreveu
		System.out.println("Erro, tente novamente");
		leitor.next();
	}
		

	}
	
	// ----> 2
	public void mostrarTodosOsClientes(List<BankDados> dadosCliente) {
		
		System.out.println();
		System.out.println("**************************");
		System.out.println(" MOSTRANDO TODOS OS CLIENTES ");
		System.out.println("********************************");
		
		//dados -- a variavel que vai ser usada para o comando for
		for(BankDados numeroDaConta : dadosCliente) {
			System.out.println("Numero da conta: " + numeroDaConta.getNumeroDaConta());
			System.out.println("Nome do Titular: " + numeroDaConta.getTitular());
			System.out.println("Saldo inicial: " + numeroDaConta.getSaldoInicial());
			System.out.println("Saldo Limite: " + numeroDaConta.getSaldoLimite());
			System.out.println("-------------------------------------------");
			
		}	
		
	}
	
	// ---> 3
	public void mostrarDadosContaDesejada (Scanner leitor, List<BankDados> dadosCliente) {
		
		System.out.println();
		System.out.println("***************************");
		System.out.println(" MOSTRANDO DADOS DA CONTA DESEJADA ");
		System.out.println("************************************");
		System.out.println();
		System.out.println("Digite o numero da conta desejada: ");
		String pesquisarTitular = leitor.next();
		
		for(BankDados numeroDaConta : dadosCliente) { //pegar e usar a variável numeroDaConta
			
			if(pesquisarTitular.equals(numeroDaConta.getNumeroDaConta())){
				System.out.println("Numero da conta: " + numeroDaConta.getNumeroDaConta());
				System.out.println("Nome do Titular: " + numeroDaConta.getTitular());
				System.out.println("Saldo inicial: " + numeroDaConta.getSaldoInicial());
				System.out.println("Saldo Limite: " + numeroDaConta.getSaldoLimite());
				System.out.println("-------------------------------------------");
				break;
				
			}
			
		}
		
	}
	
	// ---> 4
	public void alterarCadastro(Scanner leitor, List<BankDados> dadosCliente) {
		
		System.out.println();
		System.out.println("*****************************");
		System.out.println("ALTERANDO DADOS DA CONTA DESEJADA");
		System.out.println("************************************");
		System.out.println();
		System.out.println("Digite o numero da conta desejada: ");
		String alterar = leitor.next();
		
		for(BankDados numeroDaConta : dadosCliente) {
			if(alterar.equals(numeroDaConta.getNumeroDaConta())) {
				System.out.println("Numero da conta: " + numeroDaConta.getNumeroDaConta());
				System.out.println("Nome do Titular: " + numeroDaConta.getTitular());
				System.out.println("Saldo inicial: " + numeroDaConta.getSaldoInicial());
				System.out.println("Saldo Limite: " + numeroDaConta.getSaldoLimite());
				System.out.println("-------------------------------------------");
				
				System.out.println();
				System.out.println("Digite o novo nome do titular: ");
				numeroDaConta.setTitular(leitor.next());
				System.out.println("Digite o novo saldo Limite: ");
				numeroDaConta.setSaldoLimite(leitor.nextDouble());
				
			}
			
		}
		
	}
	
	// ----> 5
	public void excluirConta (Scanner leitor, List<BankDados> dadosCliente) {
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("EXCLUIR CONTA");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("Digite o numero da conta: ");
		String contaExcluir = leitor.next();
		
		for(BankDados numeroDaConta : dadosCliente) {
			
			if(contaExcluir.equals(numeroDaConta.getNumeroDaConta())) {
				System.out.println("Numero da conta: " + numeroDaConta.getNumeroDaConta());
				System.out.println("Nome do Titular: " + numeroDaConta.getTitular());
				System.out.println("Saldo inicial: " + numeroDaConta.getSaldoInicial());
				System.out.println("Saldo Limite: " + numeroDaConta.getSaldoLimite());
				System.out.println();
				System.out.println("----------------------------------------");
				System.out.println("VOCÊ TEM CERTEZA QUE DESEJA EXCLUIR ESSA CONTA?");
				System.out.println("1 - SIM");
				System.out.println("2 - NÃO");
				System.out.println("************************");
				String excluir = leitor.next();
				
			if(excluir.equals("1")) {
				if(numeroDaConta.getSaldoInicial() ==0) {
					dadosCliente.remove(numeroDaConta); //Removendo a conta da lista
					System.out.println("CONTA EXCLUÍDA COM SUCESSO");
					return;
				}else {
					System.out.println("Esta conta não poderá ser excluida devido ao saldo atual");
				}
				
			}else if(excluir.equals("2")) {
				return; //Termina o método após processar a conta
			}else {
				System.out.println("Opção inválida. Digite 1 para SIM, ou 2 para NÃO");
			}
					
			}
		}
		return;
	}
	
	// ----> 6
	public void efetuarDeposito (Scanner leitor, List<BankDados> dadosCliente) {
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("EFETUAR DEPÓSITO");
		System.out.println("********************************");
		System.out.println();
		System.out.println("Digite o numero da conta: ");
		String depositarConta = leitor.next();
		
		try {
		for(BankDados numeroDaConta : dadosCliente) {
			
			if(depositarConta.equals(numeroDaConta.getNumeroDaConta())) {
				System.out.println("Numero da Conta: " + numeroDaConta.getNumeroDaConta());
				System.out.println("Nome do Titular: " + numeroDaConta.getTitular());
				System.out.println("Saldo: " + numeroDaConta.getSaldoInicial());
				System.out.println("--------------------------------------------");
				System.out.println();
				System.out.println("*******************************************");
				System.out.println("Depositando o valor na conta");
				System.out.println("********************************************");
				System.out.println();
				System.out.println("Digite o valor a depositar: ");
				double valorDepositar = leitor.nextDouble();
				
				double novoSaldo = numeroDaConta.getSaldoInicial() + valorDepositar;
				numeroDaConta.setSaldoInicial(novoSaldo);
				System.out.println("Saldo: " + numeroDaConta.getSaldoInicial());
				System.out.println();
				System.out.println("Depósito realizado com Sucesso!!!");
				
				return;
				
				}
			
			}
		
		}catch (InputMismatchException erro) {
			System.out.println("Valor Inválido");
			leitor.next();
			}	
		} 

	
	
	
	// ----> 7
	public void efetuarPagamento (Scanner leitor, List<BankDados> dadosCliente) {
		
		System.out.println("**************************************");
		System.out.println("EFETUANDO PAGAMENTO");
		System.out.println("**************************************");
		System.out.println("Digite o numero da conta: ");
		String contaRetirar = leitor.next();
		
		try {
		for(BankDados numeroDaConta : dadosCliente) {
			
			if(contaRetirar.equals(numeroDaConta.getNumeroDaConta())) {
				System.out.println("Numero da Conta: " + numeroDaConta.getNumeroDaConta());
				System.out.println("Nome do Titular: " + numeroDaConta.getTitular());
				System.out.println("Saldo: " + numeroDaConta.getSaldoInicial());
				System.out.println("Saldo Limite: " + numeroDaConta.getSaldoLimite());
				System.out.println();
				System.out.println("*********************************************");
				System.out.println("                 Valor a pagar");
				System.out.println("*********************************************");
				System.out.println("Digite o valor a ser retirado: ");
				double valorRetirar = leitor.nextDouble();
				
				double novoSaldo1 = numeroDaConta.getSaldoInicial() - valorRetirar;
				numeroDaConta.setSaldoInicial(novoSaldo1);
				System.out.println("Saldo: " + numeroDaConta.getSaldoInicial());
				System.out.println();
				System.out.println("Pagamento realizado com Sucesso!!!!");
				
				return;
				
			}
		}
	}catch (InputMismatchException erro) {
		System.out.println("Valor Inválido");
		leitor.next();
		
	}
		
	}
	
	// -----> 8
	public void transferirEntreContas (Scanner leitor, List<BankDados> dadosCliente) {
		
		System.out.println();
		System.out.println("*******************************");
		System.out.println("EFETUAR TRANSFERÊNCIA");
		System.out.println("**************************************");
		System.out.println("Digite o numero da conta de origem: ");
		String contaOrigem = leitor.next();
		
		for(BankDados numeroDaConta1 : dadosCliente) {
			
			if(contaOrigem.equals(numeroDaConta1.getNumeroDaConta())) {
				System.out.println("Numero da Conta: " + numeroDaConta1.getNumeroDaConta());
				System.out.println("Nome do Titular: " + numeroDaConta1.getTitular());
				System.out.println("Saldo: " + numeroDaConta1.getSaldoInicial());
				System.out.println("Saldo Limite: " + numeroDaConta1.getSaldoLimite());
				System.out.println();
				System.out.println("************************************");
				System.out.println("Digite o numero da conta de destino: ");
				System.out.println("*****************************************");
				String contaDestino = leitor.next();
				
				
		for(BankDados numeroDaConta2 : dadosCliente) {
			
			if(contaDestino.equals(numeroDaConta2.getNumeroDaConta())) {
				System.out.println("Numero da Conta: " + numeroDaConta2.getNumeroDaConta());
				System.out.println("Nome do Titular: " + numeroDaConta2.getTitular());
				System.out.println("Saldo: " + numeroDaConta2.getSaldoInicial());
				System.out.println("Saldo Limite: " + numeroDaConta2.getSaldoLimite());
				System.out.println("-----------------------------------");
				System.out.println("Digite o valor a ser transferido para " + numeroDaConta2.getTitular());
				double valorTransferir = leitor.nextDouble();
	
				
				if(valorTransferir > numeroDaConta1.getSaldoInicial()) {
					System.out.println("Saldo insuficiente para a transferência");
					return;	
				}else { 
	
					double retirado = numeroDaConta1.getSaldoInicial() - valorTransferir;
					numeroDaConta1.setSaldoInicial(retirado);
					System.out.println();
					System.out.println("Valor retirado");
					
					double depositado = numeroDaConta2.getSaldoInicial() + valorTransferir;
					numeroDaConta2.setSaldoInicial(depositado);
					System.out.println();
					System.out.println("Valor Transferido com sucesso");
					return; //criar aqui um else if para o caso do usuario escrever um numero da conta que não exista
				
				}

				}
		
		}
						
			}
			
		}
		
	}
	
	// ----> 9
	
	
	//MÉTODOS
	public void encerrarSistema (Scanner leitor) {
		System.out.println("Sistema Finalizado");
	}
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public double getSaldoLimite() {
		return saldoLimite;
	}

	public void setSaldoLimite(double saldoLimite) {
		this.saldoLimite = saldoLimite;
	}
	
	
	
	

}


	
	


