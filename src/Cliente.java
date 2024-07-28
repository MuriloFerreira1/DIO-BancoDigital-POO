
public class Cliente {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean equals(Cliente cli) {
		return this.nome.equals(cli.nome);
	}

}
