package moduloTRE;

public class Municipios {
	
// Declara��o de vavi�veis do Tipo String e Inteiro
	
	private String nome;
	private String estado;
	private int quant_habitantes;
	private int vagas_Vereador;
	
// M�todo construtor	

	public Municipios (String nome, String estado, int quant_habitantes, int vagas_Vereador) {
		this.nome = nome;
		this.estado = estado;
		this.quant_habitantes = quant_habitantes;
		this.vagas_Vereador = vagas_Vereador;
	} // end construtor	
	
	public Municipios() {
	    nome = "";
	    estado = "";
	    quant_habitantes = 0;
	    vagas_Vereador = 0;
	} // end PartidosPoliticos
	
// M�todos Get e Set 
	
	public String getnome() {
		return nome;
	} // end getnome()
			
	public void setnome (String nome) {
		this.nome = nome;
	} // end setnome
	
	public String getestado() {
		return estado;
	} // end getestado()
			
	public void setestado (String estado) {
		this.estado = estado;
	} // end setestado
	
	public int getquant_habitantes() {
		return quant_habitantes;
	} // end getquant_habitantes()
			
	public void setquant_habitantes (int quant_habitantes) {
		this.quant_habitantes = quant_habitantes;
	} // end setquant_habitantes
	
	public int getvagas_Vereador() {
		return vagas_Vereador;
	} // end getvagas_Vereador()
			
	public void setvagas_Vereador (int vagas_Vereador) {
		this.vagas_Vereador = vagas_Vereador;
	} // end setvagas_Vereador
} // end class Municipios