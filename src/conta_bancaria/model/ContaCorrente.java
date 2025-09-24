package conta_bancaria.model;

public class ContaCorrente extends Conta{

private float limite; // o que é específico de conta corrente

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite= limite;	// atributo especifico da classe conta corrente
		
	} // não precisa colocar todos os gets sets porque eles já estão no arquivo da conta bancaria
	public float getLimite() {
		return limite;
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo()+ this.getLimite() < valor){
			System.out.println("\nSaldo Insuficiente! ");
			return false;
		}
		
		this.setSaldo( this.getSaldo() - valor);
		
		return true;
	}
	
	@Override
	public void visualizar( ) {
		super.visualizar(); 
		System.out.printf("Limite da Conta: R$ %.2f%n", this.limite);
	}
}
