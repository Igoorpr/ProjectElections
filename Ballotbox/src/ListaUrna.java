import java.io.*;

public class ListaUrna {
	
	private CelulaUrna primeiro; // refer�ncia � primeira c�lula da lista 
	private CelulaUrna ultimo;   // refer�ncia � �ltima c�lula da lista 

// construtor que inicializa a lista.
	
	public ListaUrna() {
		// Primeiro elemento de uma lista.
		primeiro = new CelulaUrna();

		// quando a lista encadeada � criada, indica o �ltimo item da lista.
		ultimo = primeiro;
	} // end ListaUrna()

// insere novo item na listas de Eleitores
	
   	public void inserirFinalEleitores (EleitoresUrna e) {
   		CelulaUrna aux = new CelulaUrna();
   		
   		// inser��o de uma nova c�lula ao final da lista.
   		ultimo.proximo = aux;
   		
   		// inser��o de Eleitores, passada como par�metro para esse m�todo, no final da lista encadeada.
   		aux.itemEleitores = e;
   				
   		// atualiza��o do ponteiro de controle "ultimo" para a �ltima c�lula da lista encadeada.
   		ultimo = ultimo.proximo;
   	} // end inserirFinalEleitores
   	
// M�todo que VeriEleitores algum dado na lista de Eleitores (boolean)
	
	public boolean VeriEleitores (String titulo, String zona) {
        CelulaUrna aux = new CelulaUrna();
   
        try {		
    		// o ponteiro aux ser� utilizado para percorrermos a lista encadeada.
			aux = primeiro.proximo;

			if (aux == null) {
				System.out.println("A lista de eleitores est� vazia.");
			} else {
            	// enquanto o ponteiro aux n�o tiver percorrido toda a lista encadeada...
				while (aux != null) {
					if(aux.itemEleitores.getTitulo().equals(titulo) && aux.itemEleitores.getZona().equals(zona) ) {
						System.out.println(aux.itemEleitores.getTitulo());
						return false;
					}	// end if
					// avan�amos na lista encadeada.
					aux = aux.proximo;
				} // end while
			} // end else		
        } catch (Exception e) {
	
		} // end catch
        return true;
	} // end VeriEleitores()
	
// insere novo item na listas de Votos
	
	public void inserirVoto (Votos voto) {
   		CelulaUrna aux = new CelulaUrna();
   		
   		// inser��o de uma nova c�lula ao final da lista.
   		ultimo.proximo = aux;
   		
   		// inser��o de Eleitores, passada como par�metro para esse m�todo, no final da lista encadeada.
   		aux.voto = voto;
   				
   		// atualiza��o do ponteiro de controle "ultimo" para a �ltima c�lula da lista encadeada.
   		ultimo = ultimo.proximo;
   	} // end inserirVoto
	   
// Cria uma arquivo votos com os dados da lista de Votos.
  	
   	public void CriarArquivoVoto() {
          CelulaUrna aux;
        
          try {		
          	FileWriter arquivo = new FileWriter (new File ("votos.txt"));

  			// o ponteiro aux ser� utilizado para percorrermos a lista encadeada.
  			aux = primeiro.proximo;

  			if (aux == null) {
  				System.out.println("A lista de eleitores est� vazia.");
  			} else {
              	// enquanto o ponteiro aux n�o tiver percorrido toda a lista encadeada...
  				while (aux != null) {
  					// imprimi os dados apontada pelo ponteiro aux.
  					arquivo.write(aux.voto.getVoto() + ";" + aux.voto.getVotoV() + ";");       
  					// avan�amos na lista encadeada.
  					aux = aux.proximo;
  				} // end while
  			} // end else
  			
  			arquivo.close();
  			// grava voto no arquivo para n�o encher a memoria quando tiver muitos votos
  			System.out.println ("Voto computado com sucesso");
  		} catch(Exception e) {
  	
  		} // end catch     
      } // end CriarArquivoVoto()
   	
// insere novo item na listas de Candidatos Urna	
   	
   	public void inserirFinalCandidatosUrna(CandidatosUrna c) {
   		CelulaUrna aux = new CelulaUrna();
  		
  		// inser��o de uma nova c�lula ao final da lista.
  		ultimo.proximo = aux;
  		
  		// inser��o da Candidatos, passada como par�metro para esse m�todo, no final da lista encadeada.
  		aux.itemCandidatos = c;
  				
  		// atualiza��o do ponteiro de controle "ultimo" para a �ltima c�lula da lista encadeada.
  		ultimo = ultimo.proximo;
  	} // end inserirFinalCandidatosUrna()
   
// M�todo que VeriCand algum dado na lista de Candidatos (boolean)
   	
   	public boolean VeriCand (Integer voto) {
        CelulaUrna aux = new CelulaUrna();

        try {		
			// o ponteiro aux ser� utilizado para percorrermos a lista encadeada.
			aux = primeiro.proximo;

			if (aux == null) {
				System.out.println("A lista de Candidatos Urna est� vazia.");
			} else {
            	// enquanto o ponteiro aux n�o tiver percorrido toda a lista encadeada...
				while (aux != null) {					
					if(aux.itemCandidatos.getNumero().equals(voto) && aux.itemCandidatos.getCargo_se_candidatando() == 'P') {
						return false;
					} // end if 
					// avan�amos na lista encadeada.
					aux = aux.proximo;
				} // end while
			} // end else			
        } catch(Exception e) {
	
		} // end catch
        return true;
   	} // end VeriCand()   	
} // end ListaUrna