package moduloTRE;

import java.io.*;

public class ListaTRE {
	
	private CelulaTRE primeiro; // refer�ncia � primeira c�lula da lista 
	private CelulaTRE ultimo;   // refer�ncia � �ltima c�lula da lista 

// construtor que inicializa a lista.
	
	public ListaTRE() {
		// Primeiro elemento de uma lista.
		primeiro = new CelulaTRE();

		// quando a lista encadeada � criada, indica o �ltimo item da lista.
		ultimo = primeiro;
	} // end ListaTRE()
	
// Parte I 
// insere novo item na listas de Partidos Politicos
	
	public void inserirFinalPartidosPolitico (PartidosPoliticos pp) {
		CelulaTRE aux = new CelulaTRE();
		
		// inser��o de uma nova c�lula ao final da lista.
		ultimo.proximo = aux;
		
		// inser��o da PartidosPoliticos, passada como par�metro para esse m�todo, no final da lista.
		aux.itemPartidos = pp;
				
		// atualiza��o do ponteiro de controle "ultimo" para a �ltima c�lula da lista.
		ultimo = ultimo.proximo;
	} // end inserirFinalPartidosPolitico
	
// Cria uma arquivo (PartidosPoliticos) com os dados da lista de Partidos Politicos.
	
    public void CriarArquivoPartidosPoliticos() {
       CelulaTRE aux;
        
        try {		       	
        	FileWriter arquivo = new FileWriter (new File ("PartidosPoliticos.txt"));
        	
			// o ponteiro aux ser� utilizado para percorrermos a lista encadeada.
			aux = primeiro.proximo;

			if (aux == null) {
				System.out.println("A lista de Partidos Politicos est� vazia.");
			} else {
            	// enquanto o ponteiro aux n�o tiver percorrido toda a lista encadeada...
				while (aux != null) {
					// imprimi os dados apontada pelo ponteiro aux.
					arquivo.write (aux.itemPartidos.getnome() + ";" + aux.itemPartidos.getsigla() + "\n");
					// avan�amos na lista encadeada.
					aux = aux.proximo;
				} // end while
			} // end else
			
			arquivo.close();
			System.out.println ("Arquivo PartidosPoliticos criado com sucesso.");
		} catch(Exception e) {
	
		} // end catch
    } // end CriarArquivoPartidosPoliticos
    
// insere novo item na listas de Municipios
	
    public void inserirFinalMunicipios (Municipios cm) {
  		CelulaTRE aux = new CelulaTRE();
  		
  		// inser��o de uma nova c�lula ao final da lista.
  		ultimo.proximo = aux;
  		
  		// inser��o da Municipios, passada como par�metro para esse m�todo, no final da lista encadeada.
  		aux.itemMunicipios = cm;
  				
  		// atualiza��o do ponteiro de controle "ultimo" para a �ltima c�lula da lista encadeada.
  		ultimo = ultimo.proximo;
  	} // end inserirFinalMunicipios
     
 // Cria uma arquivo (Municipios) com os dados da lista de Municipios.
  
    public void CriarArquivoMunicipios() {
    	CelulaTRE aux;
       
        try {		
        	FileWriter arquivo = new FileWriter (new File ("Municipios.txt"));

 			// o ponteiro aux ser� utilizado para percorrermos a lista encadeada.
 			aux = primeiro.proximo;

 			if (aux == null) {
 				System.out.println("A lista de municipios est� vazia.");
 			} else {
             	// enquanto o ponteiro aux n�o tiver percorrido toda a lista encadeada...
 				while (aux != null) {
 					// imprimi os dados da conta-corrente apontada pelo ponteiro aux.
 					arquivo.write(aux.itemMunicipios.getnome() + ";" + aux.itemMunicipios.getestado() + ";" 
 							+ aux.itemMunicipios.getquant_habitantes() + ";" + aux.itemMunicipios.getvagas_Vereador() + "\n");            
 					// avan�amos na lista encadeada.
 					aux = aux.proximo;
 				} // end while
 			} // end else
 			
 			arquivo.close();
 			System.out.println ("Arquivo Municipios criado com sucesso.");
 		} catch(Exception e) {
 	
 		} // end catch     
     } // end CriarArquivoMunicipios()
    
// insere novo item na listas de Candidatos
 	
     public void inserirFinalCandidatos (Candidatos c) {
    	 CelulaTRE aux = new CelulaTRE();
   		
   		// inser��o de uma nova c�lula ao final da lista.
   		ultimo.proximo = aux;
   		
   		// inser��o da Candidatos, passada como par�metro para esse m�todo, no final da lista encadeada.
   		aux.itemCandidatos = c;
   				
   		// atualiza��o do ponteiro de controle "ultimo" para a �ltima c�lula da lista encadeada.
   		ultimo = ultimo.proximo;
   	} // end inserirFinalCandidatos
      
// Cria uma arquivo (Candidatos) com os dados da lista de Candidatos.
  	
     public void CriarArquivoCandidatos() {
          CelulaTRE aux;
        
          try {		
          	FileWriter arquivo = new FileWriter (new File ("Candidatos.txt"));

  			// o ponteiro aux ser� utilizado para percorrermos a lista encadeada.
  			aux = primeiro.proximo;

  			if (aux == null) {
  				System.out.println("A lista de candidatos est� vazia.");
  			} else {
              	// enquanto o ponteiro aux n�o tiver percorrido toda a lista encadeada...
  				while (aux != null) {
  					// imprimi os dados apontada pelo ponteiro aux.
  					arquivo.write(aux.itemCandidatos.getNome() + ";" + aux.itemCandidatos.getNumero() + ";" 
  							+ aux.itemCandidatos.getNome_Municipio() + ";" + aux.itemCandidatos.getSigla_partido() + ";"
  							+ aux.itemCandidatos.getCargo_se_candidatando() + "\n");            
  					// avan�amos na lista encadeada.
  					aux = aux.proximo;
  				} // end while
  			} // end else
  			
  			arquivo.close();
  			System.out.println ("Arquivo Candidatos criado com sucesso.");
  		} catch(Exception e) {
  	
  		} // end catch     
      } // end CriarArquivoCandidatos()    
         
// insere novo item na listas de Eleitores
   	
    public void inserirFinalEleitores (Eleitores e) {
     	CelulaTRE aux = new CelulaTRE();
     		
     	// inser��o de uma nova c�lula ao final da lista.
     	ultimo.proximo = aux;
     		
     	// inser��o de Eleitores, passada como par�metro para esse m�todo, no final da lista encadeada.
     	aux.itemEleitores = e;
     				
     	// atualiza��o do ponteiro de controle "ultimo" para a �ltima c�lula da lista encadeada.
     	ultimo = ultimo.proximo;
     } // end inserirFinalEleitores
        
// Cria uma arquivo (Eleitores) com os dados da lista de Eleitores.
    	
    public void CriarArquivoEleitores() {
    	CelulaTRE aux;
          
    	 try {		
    		 FileWriter arquivo = new FileWriter (new File ("Eleitores.txt"));

    		// o ponteiro aux ser� utilizado para percorrermos a lista encadeada.
    		aux = primeiro.proximo;

    		if (aux == null) {
    			System.out.println("A lista de eleitores est� vazia.");
    		} else {
                // enquanto o ponteiro aux n�o tiver percorrido toda a lista encadeada...
    			while (aux != null) {
    				// imprimi os dados apontada pelo ponteiro aux.
    				arquivo.write(aux.itemEleitores.getNome() + ";" + aux.itemEleitores.getNumero_titulo_eleitoral() + ";" 
    						+ aux.itemEleitores.getNome_Municipio_eleitoral() + ";" + aux.itemEleitores.getZona_eleitoral() + ";"
    						+ aux.itemEleitores.getSecao_eleitoral() + "\n");            
    				// avan�amos na lista encadeada.
    				aux = aux.proximo;
    			} // end while
    		} // end else
    			
    		arquivo.close();
    		System.out.println ("Arquivo Eleitores criado com sucesso.");
    	} catch(Exception e) {
    	
    	} // end catch     
     } // end CriarArquivoEleitores()
    	
// insere novo item na listas de UrnasEletronicas
   	 	
    public void inserirFinalUrnasEletronicas (UrnasEletronicas ul) {
     	CelulaTRE aux = new CelulaTRE();
     		
     	// inser��o de uma nova c�lula ao final da lista.
     	ultimo.proximo = aux;
     		
     	// inser��o da UrnasEletronicas, passada como par�metro para esse m�todo, no final da lista encadeada.
     	aux.itemUrnasEletronicas = ul;
     				
     	// atualiza��o do ponteiro de controle "ultimo" para a �ltima c�lula da lista encadeada.
     	ultimo = ultimo.proximo;
     } // end inserirFinalUrnasEletronicas
        
// Cria uma arquivo (UrnasEletronicas) com os dados da lista de Urnas Eletronicas.
    	  	
    public void CriarArquivoUrnasEletronicas() {
    	CelulaTRE aux;
    	
        try {		
        	FileWriter arquivo = new FileWriter (new File ("UrnasEletronicas.txt"));
        	FileWriter arquivo1 = new FileWriter (new File ("C:..\\Urna\\" + "UrnasEletronicas.txt"));

    		// o ponteiro aux ser� utilizado para percorrermos a lista encadeada.
    		aux = primeiro.proximo;

    		if (aux == null) {
    			System.out.println("A lista de Urnas Eletronicas est� vazia.");
    		} else {
                // enquanto o ponteiro aux n�o tiver percorrido toda a lista encadeada...
    			while (aux != null) {
    				// imprimi os dados apontada pelo ponteiro aux.
    				arquivo.write(aux.itemUrnasEletronicas.getNome_municipio() + ";" + aux.itemUrnasEletronicas.getZona_eleitoral() + ";" 
    						+ aux.itemUrnasEletronicas.getSecao_eleitoral() + "\n");    
    	
    				arquivo1.write(aux.itemUrnasEletronicas.getNome_municipio() + ";" + aux.itemUrnasEletronicas.getZona_eleitoral() + ";" 
    						+ aux.itemUrnasEletronicas.getSecao_eleitoral() + "\n"); 
    				// avan�amos na lista encadeada.
    				aux = aux.proximo;
    			} // end while
    		} // end else
    		arquivo.close();
    		arquivo1.close();
    		System.out.println ("Arquivo UrnasEletronicas criado com sucesso.");
    	} catch(Exception e) {
    	
    	} // end catch     
    } // end CriarArquivoUrnasEletronicas() 
 
// Cria uma arquivo (nome do municio, zona eleitoral e secao eleitoral) com os dados que ir�o para urna.
  	
    public void CriaArquivoParaUrnasEletronicas (ListaTRE eleitores, ListaTRE candidatos) {
    	CelulaTRE aux, aux1, aux2;
    	    	
    	try {	   		
    		aux = primeiro.proximo;
    		aux1 = eleitores.primeiro.proximo;
    		aux2 = candidatos.primeiro.proximo;
    		     		    		
    		while (aux != null) {	
    			// Cria os arquivos que ir�o ser lidos pela Urna
    			FileWriter arquivo = new FileWriter (new File ("C:..\\Urna\\" + aux.itemUrnasEletronicas.getSecao_eleitoral() + "_Titulos.txt"));
    			FileWriter arquivo1 = new FileWriter (new File ("C:..\\Urna\\" + aux.itemUrnasEletronicas.getSecao_eleitoral() + "_Candidatos.txt"));
    		
    			// Arquivo de Titulos de Eleitores
    			aux1 = eleitores.primeiro.proximo;
    			while (aux1 != null) {
    				if (aux.itemUrnasEletronicas.getSecao_eleitoral() == aux1.itemEleitores.getSecao_eleitoral()) {
    					arquivo.write(aux1.itemEleitores.getNumero_titulo_eleitoral() + ";" + aux.itemUrnasEletronicas.getSecao_eleitoral() + "\n");
    				} // end if
    				aux1 = aux1.proximo;
    			} // end while
    			
    			// Arquivo de Candidatos
    			aux2 = candidatos.primeiro.proximo;
    			while (aux2 != null) {
    				if (aux.itemUrnasEletronicas.getNome_municipio().equals(aux2.itemCandidatos.getNome_Municipio())) {
    					arquivo1.write(aux2.itemCandidatos.getNome() + ";" + aux2.itemCandidatos.getNumero() + ";" 
  							+ aux2.itemCandidatos.getNome_Municipio() + ";" + aux2.itemCandidatos.getSigla_partido() + ";"
  							+ aux2.itemCandidatos.getCargo_se_candidatando() + "\n");
    				} // and if   				
    				aux2 = aux2.proximo;
    			} // end while
    			
    			// Fecha os arquivos
    			arquivo.close();
    			arquivo1.close();
    			// avan�amos na lista encadeada.
				aux = aux.proximo;
    		} // end while
  			System.out.println ("Arquivos para as Urnas Eletronicas criados com sucesso.");
  		} catch(Exception e) {
  			System.out.println (e.getMessage());
  		} // end catch    
   	} // end CriaArquivoParaUrnasEletronicas()
    
// Parte 3 Depois das elei��es
    
 // Parte 3 Depois da Elei�ao
	
 // M�todo que le os arquivos dos votos 
 	
     public void leArquivosGeradosUrna (ListaTRE candidatos) {
     	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
 		String[] dadosLidos;
 		CelulaTRE aux;
    	
    	aux = primeiro.proximo;
 		
 		String strLine = "", municipio;
 		int secao, votos;
 							
 		try {
 			System.out.println("Digite o nome do municipio: ");
 				municipio = entrada.readLine();
 				
 			System.out.println("Digite secao: ");
 				secao = Integer.parseInt(entrada.readLine());
 		
 			File arquivo = new File("C:..\\Urna\\" + municipio + "_" + secao + "_resultado.txt");
 			
 			FileInputStream fstream = new FileInputStream(arquivo);
 			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
 			
 			System.out.println ("Contagem dos votos foram: ");
 			while ((strLine = br.readLine()) != null) {
 				dadosLidos = strLine.split(";");	
 				votos = Integer.parseInt(dadosLidos[1]);
 				
 				System.out.println ("Nome: " + aux.itemCandidatos.getNome() + " com o numero: " + aux.itemCandidatos.getNumero() 
    			+ " recebeu: " +  votos + " votos.");
 				aux = aux.proximo;	
 			} // end while
 			br.close();
 		} catch (Exception e) {
 			System.out.println("");
 		} // end catch
 	} // end leArquivosGeradosUrna()   
} // end ListaTRE