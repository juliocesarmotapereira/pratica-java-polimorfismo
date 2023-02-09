
// Gerente e um funcionário
// Gerente herda da class Funcionario
// Assina o contrato Autenticável
// E um Autenticável

public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	// métodos:
	// super referencia a class mãe
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
