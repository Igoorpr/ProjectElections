package moduloTRE;

public class Eleitores {
	
// Declara��o de vavi�veis do Tipo String e Int
	
	private String nome;
	private int numero_titulo_eleitoral;
	private String nome_Municipio_eleitoral;
	private int zona_eleitoral;
	private int secao_eleitoral;
	
// M�todo construtor	
	
	public Eleitores(String nome, int numero_titulo_eleitoral, String nome_Municipio_eleitoral, int zona_eleitoral,
			int secao_eleitoral) {
		this.nome = nome;
		this.numero_titulo_eleitoral = numero_titulo_eleitoral;
		this.nome_Municipio_eleitoral = nome_Municipio_eleitoral;
		this.zona_eleitoral = zona_eleitoral;
		this.secao_eleitoral = secao_eleitoral;
	} // end Eleitores
	
	public Eleitores() {
		nome = "";
		numero_titulo_eleitoral = 0;
		nome_Municipio_eleitoral = "";
		zona_eleitoral = 0;
		secao_eleitoral = 0;
	} // end Eleitores
	
// M�todos Get e Set 
	
	public String getNome() {
		return nome;
	} // end getNome

	public void setNome(String nome) {
		this.nome = nome;
	} // end setNome

	public int getNumero_titulo_eleitoral() {
		return numero_titulo_eleitoral;
	} // end getNumero_titulo_eleitoral

	public void setNumero_titulo_eleitoral(int numero_titulo_eleitoral) {
		this.numero_titulo_eleitoral = numero_titulo_eleitoral;
	} // end setNumero_titulo_eleitoral

	public String getNome_Municipio_eleitoral() {
		return nome_Municipio_eleitoral;
	} // end getNome_Municipio_eleitoral

	public void setNome_Municipio_eleitoral(String nome_Municipio_eleitoral) {
		this.nome_Municipio_eleitoral = nome_Municipio_eleitoral;
	} // end setNome_Municipio_eleitoral

	public int getZona_eleitoral() {
		return zona_eleitoral;
	} // end getZona_eleitoral

	public void setZona_eleitoral(int zona_eleitoral) {
		this.zona_eleitoral = zona_eleitoral;
	} // end setZona_eleitoral

	public int getSecao_eleitoral() {
		return secao_eleitoral;
	} // end getSecao_eleitoral

	public void setSecao_eleitoral(int secao_eleitoral) {
		this.secao_eleitoral = secao_eleitoral;
	} // end setSecao_eleitoral
} // end class Eleitores