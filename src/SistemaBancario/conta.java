package SistemaBancario;

public class conta implements Iconta {
	
	private int agencia;
	private int numeroConta;
	private double saldo;
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor, conta contadestino) {
		// TODO Auto-generated method stub
		
	}

}
