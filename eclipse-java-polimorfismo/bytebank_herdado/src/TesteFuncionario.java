
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente nico = new Gerente();
		// referencia:
		nico.setNome("Nico Steppat");
		nico.setCpf("111444999-10");
		nico.setSalario(2600.00);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

//		nico.salario = 300.00;

	}
}
