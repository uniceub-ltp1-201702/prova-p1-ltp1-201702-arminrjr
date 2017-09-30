import java.time.LocalDate;

public class Cliente {

	//Atributos
	private String nome;
	private String cpf;
	private LocalDate nascimento;
	private String numero;
	private String cidade;
	private String uf;
	
	//Get and Set
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
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	//Construtor
	public Cliente(String nome, String cpf, LocalDate nascimento, String numero, String cidade, String uf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.numero = numero;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	
}

