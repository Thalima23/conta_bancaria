package conta_bancaria.model;

public class ContaPoupanca extends Conta{
	
	private int aniversario;
	
	//Construtor
	
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}	
	 // Getter
		public int getAniversario() {
			return aniversario;
		}
		
	// Setter
		public void setAniversario (int aniversario) {
			this.aniversario = aniversario;
		}
		
		@Override
		public void visualizar () {
			super.visualizar(); // mostrar dados comuns da Conta
			System.out.println("Aniversário da conta: " + this.aniversario);
}
}