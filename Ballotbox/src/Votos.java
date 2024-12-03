public class Votos {
	
// Declara��o de vavi�veis do Tipo int.

	private int voto;
	private int votoV;
	
// M�todo construtor
	
	public Votos (int voto, int votoV) {	
		this.voto = voto;
		this.votoV = votoV;
	} // end Votos

	public Votos() {
		
	} // end Votos
	
// M�todos Get e Set 
	
	public int getVoto() {
		return voto;
	} // end getVoto()
	
	public void setVoto(int voto) {
		this.voto = voto;	
	} // end setVoto()
	
	public int getVotoV() {
		return votoV;
	} // end getVotoV()

	public void setVotoV(int votoV) {	
		this.votoV = votoV;
	} // end setVotoV()
} // end Votos