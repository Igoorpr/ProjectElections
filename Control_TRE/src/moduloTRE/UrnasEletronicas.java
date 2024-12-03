package moduloTRE;

public class UrnasEletronicas {
	
// Declara��o de vavi�veis do Tipo String e Int

	private String nome_municipio;
	private int zona_eleitoral;
	private int secao_eleitoral;
	
// M�todo construtor
	
	public UrnasEletronicas(String nome_municipio, int zona_eleitoral, int secao_eleitoral) {
		this.nome_municipio = nome_municipio;
		this.zona_eleitoral = zona_eleitoral;
		this.secao_eleitoral = secao_eleitoral;
	} // end UrnasEletronicas
	
	public UrnasEletronicas () {
		nome_municipio = "";
		zona_eleitoral = 0;
		secao_eleitoral = 0;
	} // end UrnasEletronicas
	
// M�todos Get e Set 
	
	public String getNome_municipio() {
		return nome_municipio;
	} // end getNome_municipio

	public void setNome_municipio(String nome_municipio) {
		this.nome_municipio = nome_municipio;
	} // end setNome_municipio

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
} // end class UrnasEletronicas