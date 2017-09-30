import java.time.LocalDateTime;

public class Ligacao {

	//Atributos
	private int codigo;
	private String numeroD;
	private LocalDateTime linicio;
	private LocalDateTime lfinal;
	private String cidadeD;
	private String ufD;
	private Cliente cliente;
	
	
	public Ligacao(int codigo, String numeroD, LocalDateTime linicio, LocalDateTime lfinal, String cidadeD, String ufD,
			Cliente cliente) {
		super();
		this.codigo = codigo;
		this.numeroD = numeroD;
		this.linicio = linicio;
		this.lfinal = lfinal;
		this.cidadeD = cidadeD;
		this.ufD = ufD;
		this.cliente = cliente;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumeroD() {
		return numeroD;
	}
	public void setNumeroD(String numeroD) {
		this.numeroD = numeroD;
	}
	public LocalDateTime getLinicio() {
		return linicio;
	}
	public void setLinicio(LocalDateTime linicio) {
		this.linicio = linicio;
	}
	public LocalDateTime getLfinal() {
		return lfinal;
	}
	public void setLfinal(LocalDateTime lfinal) {
		this.lfinal = lfinal;
	}
	public String getCidadeD() {
		return cidadeD;
	}
	public void setCidadeD(String cidadeD) {
		this.cidadeD = cidadeD;
	}
	public String getUfD() {
		return ufD;
	}
	public void setUfD(String ufD) {
		this.ufD = ufD;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
	