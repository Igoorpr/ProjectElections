public class EleitoresUrna {
	
// Declara��o de vavi�veis do Tipo String.
	
	String titulo;
	String zona;
	
// M�todo construtor	
	
	public EleitoresUrna (String titulo,String zona) {
		this.titulo = titulo;
		this.zona = zona;
	} // end EleitoresUrna
	
	public EleitoresUrna() {
			
	} // end EleitoresUrna
	
	public String getTitulo() {
		return titulo;
	} // end getTitulo()

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	} // end setTitulo
	
	public String getZona() {
		return zona;
	} // end getZona()

	public void setZona(String zona) {
		this.zona = zona;
	} // end setZona() 	
} // end class EleitoresUrna