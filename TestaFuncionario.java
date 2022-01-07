public class TestaFuncionario {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente luna = new Gerente();
		luna.setNome("Luna Maryane");
		luna.setCpf("223355646-9");
		luna.setSalario(2590.80);

		System.out.println(luna.getNome());
		System.out.println(luna.getBonificacao());

	}
}
