
// extends Gerente herda da class Funcionario 
public class Designer extends Funcionario {

	// métodos:
	// super referencia a class mãe
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Designer");
		return 200;
	}
}
