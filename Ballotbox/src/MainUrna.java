import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
 
public class MainUrna {

// variavel controle
	static int ContaLinha = 1;

// Método Armazena Candidatos
	
	public static void ArmazenaCand(String secao, ListaUrna listCand) {
		CandidatosUrna candidatos;
		String[] dadosLidos;
		String strLine = "", nome, municipio, sigla_partido;
		int numero;
		char cargo;
		
		try {
			File arquivo1 = new File (secao + "_Candidatos.txt");
		
			// Verifica se os arquivos ja existem
			if (arquivo1.exists()) {
				// Pega os dados do arquivo e coloca na lista
				FileInputStream learquivo1 = new FileInputStream(arquivo1);
				BufferedReader br1 = new BufferedReader(new InputStreamReader(learquivo1));
			
					while ((strLine = br1.readLine()) != null) {
						dadosLidos = strLine.split(";");
						nome = dadosLidos[0];
						numero = Integer.parseInt(dadosLidos[1]);
						municipio = dadosLidos[2];
						sigla_partido = dadosLidos[3];
						cargo = dadosLidos[4].charAt(0);
		
						candidatos = new CandidatosUrna (nome, numero, municipio, sigla_partido, cargo);
						listCand.inserirFinalCandidatosUrna(candidatos);
					} // end while	
					learquivo1.close();	
					System.out.println("Arquivos lidos e dados armazenados com sucesso.");
			} else {
				System.out.println("A sessao digitada não existe.");
			} // end else
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("pao");
		} // end catch
	} // end ArmazenaCand
	
// Método BuscaEleitor no arquivo lista
	
	public static void BuscaEleitor(String titulo,EleitoresUrna el,ListaUrna ele, ListaUrna votos, Votos vt,String secao,ListaUrna listCand) {	
		String path = secao + "_Titulos.txt";	
		String hostID = "";
		
		try {
			FileInputStream fstream = new FileInputStream(path);				
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));	
			String strLine = "";				
			String city;
				
			while ((strLine = br.readLine()) != null)   {
				// Print the content on the console
				String[] test = strLine.split(";");
				hostID = test[0];
				city = test[1];
				el = new EleitoresUrna(hostID,city);
				ele.inserirFinalEleitores(el);
			} // end while
						
			//Close the input stream
			fstream.close();
			// Le arquivo UrnasEletronicas
			String verificaZonaUrna= "UrnasEletronicas.txt";
			FileInputStream f2stream = new FileInputStream(verificaZonaUrna);
			int ch = 0;
			ch = lineCount(verificaZonaUrna);
			System.out.println(ch);
			BufferedReader br3 = new BufferedReader(new InputStreamReader(f2stream));
			String strLine2 = "";

			int x2 = 0;
			String[] city3 = new String[ch];
			while ((strLine2 = br3.readLine()) != null)   {
				// Print the content on the console
				String[] test = strLine2.split(";");
				city3[x2] = test[2];
				x2++;
			} // end while
			
			f2stream.close();
			int voto;
			int votoV;
					
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

			for (int i = 0; i < city3.length; i++) {
				if(!ele.VeriEleitores(titulo,city3[i])) { 
					if(!JaVt(titulo)) {
						System.out.println("Ja votou");
						break;
					} else {
						System.out.println("Digite seu voto:");
						voto = Integer.parseInt(entrada.readLine());
						System.out.println("Digite seu voto para vereador:");
						votoV = Integer.parseInt(entrada.readLine());
						vt = new Votos(voto,votoV);
						votos.inserirVoto(vt);	
						SEle(titulo);	
					} // end else
				} else { 
					System.out.println("estado invalido, voto justificado"); //voto justificado;
					Just(titulo);
					break;}
			} // end for	
		} catch(Exception e) {
			System.out.println("erroasd:" +e);
		} // end catch
	} // end BuscaEleitor
	
// Método EscVoto na lista
	
	public static void EscVoto(Integer candx,int qtde,String municipio,String sesao) {
			
		try {
			// Arquivo para TRE
			BufferedWriter writer = new BufferedWriter(new FileWriter(municipio + "_" + sesao + "_resultado.txt",true));
			//writer.append(';');
			writer.append(candx+ ":" + qtde + "\n");
			writer.close();
			
		} catch (IOException e) {
				
		} // end catch	
	} // end EscVoto
	
// Método Somar Recursivo AllIndexesRecursive
	
	public Integer[] AllIndexesRecursive(Integer input[],Integer x, Integer start) {  
		if (start == input.length) { 
			Integer[] ans = new Integer[0];  
			return ans; 
		} // end if

		Integer[] smallIndex = AllIndexesRecursive(input, x, start + 1); 
 
		if (input[start] == x) { 
			Integer[] myAns = new Integer[smallIndex.length + 1]; 
			
			myAns[0] = start; 
			for (int i = 0; i < smallIndex.length; i++) { 
				myAns[i + 1] = smallIndex[i]; 
			} // end if 
			return myAns; 
		} else { 
			return smallIndex; 
		} // end else
	} // end AllIndexesRecursive
		
// Método  Integer[] AllIndexes
		
	public Integer[] AllIndexes(Integer input[], Integer x) { 
		return AllIndexesRecursive(input, x, 0); 
	} // end Integer[] AllIndexes
	
	
// Método Contar Votos
		
	public static void ContaVotos(Integer[] cand,Integer[] cands) {	
		// Pega do arquivo urna
		String path = "votos.txt";
		
		try {
			FileInputStream fstream = new FileInputStream(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine = "";
		
			while ((strLine = br.readLine()) != null)   {
				// Print the content on the console
				String[] test = strLine.split(";");
			
				for(int p=0;p<test.length;p++) {
					cands[p] = Integer.parseInt(test[p]);	
				} // end for						
			} // end for
			fstream.close();
		} catch(Exception e) {
						
		} // end catch
	} // end ContaVotos
		
// Método Candidatos
		
	public static void Cand(Integer[] cand,String sesao) {	
		String path = sesao + "_Candidatos.txt";
			
		try {
			FileInputStream fstream = new FileInputStream(path);	
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine = "";

			int x = 0;
			
			while ((strLine = br.readLine()) != null)   {
				// Print the content on the console
				String[] test = strLine.split(";");
					
				cand[x] = Integer.parseInt(test[1]);
				x++;					
			} // end while
			fstream.close();
		} catch(Exception e) {
						
		} // end catch	
	} // end Cand
		
// Método Eleit que inicia a votação
		
	public static void Eleit(Votos vt, ListaUrna votos,String sesao,ListaUrna listCand) {	
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String titulo;
		EleitoresUrna el = new EleitoresUrna();
		ListaUrna ele = new ListaUrna();
		
		try {
			System.out.println("Digite seu titulo de eleitor: ");
			titulo = entrada.readLine();
			BuscaEleitor(titulo,el,ele,votos,vt,sesao,listCand);
		} catch(Exception e) {
			System.out.println("asdff : "+e);
		} // end catch
	} // end Eleit
		
// Método Contar Linhas

	public static int lineCount(String arquivo) {
		int linha=0;
		try {
			List<String> lines = Files.readAllLines(Paths.get(arquivo));
			// pega a contidade de linhas
			
			linha = lines.size();
			return linha;
		} catch(Exception e) {
			
		} // end catch
		return linha;
	} // end lineCount
			
// Método SEle Imprime os arquivos dos votos dos titulos de eleitor
		
	public static void SEle(String titulo) {
			
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("eleitTituVoted.txt",true));
				
			writer.append(titulo + ";");
			writer.close();
			
		} catch (IOException e) {
				
		} // end catch	
	} // end SEle
		
// Método Just Imprimir a Justificativa no arquivo
		
	public static void Just(String titulo) {	
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("eleitTituJustificado.txt",true));
					
			writer.append(titulo + " - " + "Estado invalido. Titulo não cadastrado na urna"+";" + "\n");
			writer.close();
			
		} catch (IOException e) {
				
		} // end catch	
	} // end Just
		
// Método boolean JaVT Verificar se ja votou
		
	public static boolean JaVt(String titulo) {
		//se ja votou
		String path = "eleitTituVoted.txt";
		String city="";
		
		try {
			FileInputStream fstream = new FileInputStream(path);
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine = "";
			int x =0;
					
			while ((strLine = br.readLine()) != null)   {
				String[] test = strLine.split(";");
				//String roomID = test[0];
				for(int i=0;i<test.length;i++) {
					if(titulo.equals(test[x])) {
						return false;
					} else {
						 x++;
						 city += test[x] + ";";
					 } // end else
					} // end for
				} // end while
				fstream.close();
				System.out.println( city +" ");
				return true;			
			} catch (Exception e) {
				
			} // end catch
			return true;
		} // end JaVt
		
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int op = 0;
		
		Votos vt = new Votos();
		ListaUrna votos = new ListaUrna();
		ListaUrna listCand = new ListaUrna();
			
		System.out.println("Modulo Urna Eleitoral: ");
			
		System.out.println("Digite o municipio:");
			String municipio = entrada.readLine();
			
		System.out.println("Digite a secao:");
			String secao = entrada.readLine();
			
		ArmazenaCand(secao,listCand);
			
		do {
			System.out.println("Digite sua opcao:\n2 - Eleitores");
			System.out.println("Digite 22 para sair do programa.");
			op = Integer.parseInt(entrada.readLine());
				
			if(op == 2) {
				Eleit(vt,votos,secao,listCand);	
			} // end if
		} while(op != 22);
		
		int j = lineCount(secao + "_Candidatos.txt");
		int jx = lineCount(secao + "_Titulos.txt");
		
		
		Integer[] cand = new Integer[j];
		Integer[] cands = new Integer[jx];
		votos.CriarArquivoVoto();
		Cand(cand,secao);
		for(int i=0;i<cand.length;i++) {
			System.out.println(cand[i]);
		}
		ContaVotos(cand,cands);
		MainUrna ex = new MainUrna();
			Integer candx =0;
	        // Printing the output array 
	        for (int i = 0; i < jx; i++) {
	        	candx = cand[i];
	        	Integer output[] = ex.AllIndexes(cands, candx); 

	        	System.out.println( candx+":"+ output.length ); 
	        	EscVoto(candx,output.length,municipio,secao); 
	        } // end for
	        System.out.println(jx);
	} // end main
} // end class MainUrna