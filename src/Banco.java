import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void adicionaConta(Conta c) {
		this.contas.add(c);
	}
	
	public List<Conta> encontrarContas(Cliente c){
		return contas.stream()
				.filter(cliente -> cliente.cliente.equals(c))
				.collect(Collectors.toList());
	}

}
