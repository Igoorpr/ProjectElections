public class CelulaUrna {

	CandidatosUrna itemCandidatos; // item da lista de CandidatosUrna
	EleitoresUrna itemEleitores; // item da lista de EleitoresUrna
	Votos voto; // item da lista de Votos
	CelulaUrna proximo; // Usado em todas as listas
	
	CelulaUrna() {
		itemCandidatos = new CandidatosUrna(); // item da lista de CandidatosUrna
		itemEleitores = new EleitoresUrna(); // item da lista de EleitoresUrna
		voto = new Votos(); // item da lista de Votos
		proximo = null; // Usado em todas as listas
	} // end CelulaUrna
} // end class CelulaUrna