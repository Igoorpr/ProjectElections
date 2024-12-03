public class CandidatosUrna {
	
// Declara��o de vavi�veis do Tipo String, int, char.
	
	private String nome;
	private int numero;
	private String nome_Municipio;
	private String sigla_partido;
	private char cargo_se_candidatando;
		
// M�todo construtor	

	public CandidatosUrna (String nome, int numero, String nome_Municipio, String sigla_partido, char cargo_se_candidatando) {
		this.nome = nome;
		this.numero = numero;
		this.nome_Municipio = nome_Municipio;
		this.sigla_partido = sigla_partido;
		this.cargo_se_candidatando = cargo_se_candidatando;
	} // end construtor	
	
	public CandidatosUrna() {
	    nome = "";
	    numero = 0;
	    nome_Municipio = "";
	    sigla_partido = "";
	} // end Candidatos
		
// M�todos Get e Set 
		
	public String getNome() {
		return nome;
	} // end getNome

	public void setNome(String nome) {
		this.nome = nome;
	} // end setNome

	public Integer getNumero() {
		return numero;
	} // end getNumero

	public void setNumero(int numero) {
		this.numero = numero;
	} // endsetNumero

	public String getNome_Municipio() {
		return nome_Municipio;
	} // end getNome_Municipio

	public void setNome_Municipio(String nome_Municipio) {
		this.nome_Municipio = nome_Municipio;
	} // end setgetNome_Municipio

	public String getSigla_partido() {
		return sigla_partido;
	} // end getSigla_partido

	public void setSigla_partido(String sigla_partido) {
		this.sigla_partido = sigla_partido;
	} // end setSigla_partido

	public char getCargo_se_candidatando() {
		return cargo_se_candidatando;
	} // end getCargo_se_candidatando

	public void setCargo_se_candidatando(char cargo_se_candidatando) {
		this.cargo_se_candidatando = cargo_se_candidatando;
	} // end setCargo_se_candidatando
} // end class CandidatosUrna