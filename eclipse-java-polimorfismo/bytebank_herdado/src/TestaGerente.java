
public class TestaGerente {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Fulano1");
		g1.setCpf("222333666-00");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(4242);
		boolean autenticou = g1.autentica(4242);
		System.out.println(autenticou);
	}

}
