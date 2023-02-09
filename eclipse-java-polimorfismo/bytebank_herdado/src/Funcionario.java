
// não pode instanciar dessa classe, porque é abstrata:
public abstract class Funcionario {

	// atributos:
	private String nome;
	private String cpf;
	private double salario;

	// construtor:
	public Funcionario() {

	}

	// métodos não há implementação:
	public abstract double getBonificacao();

	// métodos:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
