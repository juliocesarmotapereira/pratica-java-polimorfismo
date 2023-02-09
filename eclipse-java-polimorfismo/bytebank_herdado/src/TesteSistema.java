
public class TesteSistema {
	
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(1212);
		
		Administrador adm = new Administrador();
		adm.setSenha(1313);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(1414);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
	}
}
