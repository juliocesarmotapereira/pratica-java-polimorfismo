
public abstract class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Fulano2");
		g1.setSalario(5000.00);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.00);
		
		Designer d = new Designer();
		d.setSalario(2700.00);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);

		System.out.println(controle.getSoma());
	}
}
