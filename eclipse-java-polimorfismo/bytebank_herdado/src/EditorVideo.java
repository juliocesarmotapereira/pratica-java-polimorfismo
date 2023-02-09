
// extends Gerente herda da class Funcionario 
public class EditorVideo extends Funcionario {

	// métodos:
	// super referencia a class mãe
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Editor de Vídeo");
		return 100.00;
	}
}
