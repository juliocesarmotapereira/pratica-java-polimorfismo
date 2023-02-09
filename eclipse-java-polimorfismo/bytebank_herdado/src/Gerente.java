
// Gerente e um funcionário
// Gerente herda da class Funcionario
// Assina o contrato Autenticável
// E um Autenticável

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoGeral autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoGeral();
	}

	// métodos:
	// super referencia a class mãe
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
