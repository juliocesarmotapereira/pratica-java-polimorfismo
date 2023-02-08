
// extends Gerente herda da class Funcionario 
public class Gerente extends Funcionario {

	// atributos:
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	// método expecifico do Gerente
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	// métodos:
	// super referencia a class mãe
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Gerente");
		return super.getBonificacao() + super.getSalario();
	}
}
