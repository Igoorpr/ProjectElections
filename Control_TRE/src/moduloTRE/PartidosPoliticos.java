package moduloTRE;

public class PartidosPoliticos {
	
// Declara��o de vavi�veis do Tipo String
	
	private String nome;
	private String sigla;
	
// M�todo construtor	

	public PartidosPoliticos (String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	} // end construtor	
	
	public PartidosPoliticos() {
	    nome = "";
	    sigla = "";
	} // end PartidosPoliticos
	
// M�todos Get e Set 
	
	public String getnome() {
		return nome;
	} // end getnome()
			
	public void setnome (String nome) {
		this.nome = nome;
	} // end setnome
	
	public String getsigla() {
		return sigla;
	} // end getsigla()
			
	public void setsigla (String sigla) {
		this.sigla = sigla;
	} // end setsigla
} // end class PartidosPoliticos