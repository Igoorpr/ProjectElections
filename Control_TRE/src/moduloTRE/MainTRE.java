package moduloTRE;

import java.io.*;

public class MainTRE {
	
// M�todo que verifica se o arquivo Partidos Politicos ja existe.
	
	public static void ArquivoPartidosPoliticos (ListaTRE partidos) {
		PartidosPoliticos pp;
		String[] dadosLidos;
		String strLine = "", nome, sigla;
	
		try {
			File arquivo = new File ("PartidosPoliticos.txt");
			
			// Verifica se o arquivo existe
			if (arquivo.exists()) {
				// Pega os dados do arquivo e coloca na lista
				FileInputStream fstream = new FileInputStream(arquivo);
				BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			
				while ((strLine = br.readLine()) != null) {
					 dadosLidos = strLine.split(";");
					 nome = dadosLidos[0];
					 sigla = dadosLidos[1];
					 
					 pp = new PartidosPoliticos(nome, sigla);
					 partidos.inserirFinalPartidosPolitico(pp);
				} // end while
				arquivo.delete();
				fstream.close();
			} else {
				System.out.println("Arquivo PartidosPoliticos n�o encontrado, ser� criado assim que inserir alguma informa��o.");
			} // end else
		} catch (Exception e) {
			System.out.println("");
		} // end catch
	} // end ArquivoPartidosPoliticos()
	
// Cadastro de Partidos Politicos.
	
	public static void CadastroPartidosPoliticos(ListaTRE partidos) {
		PartidosPoliticos pp;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String nome, sigla;
	
		try {
			System.out.println("Cadastra Partidos Politicos!");
			
			System.out.println("Digite quantos partidos serao cadastrados: ");
				int contador = Integer.parseInt(entrada.readLine());

			while (contador != 0) {
				System.out.println("Digite o nome do partido: ");
					nome = entrada.readLine();

				System.out.println("Digite a sigla do partido: ");
					sigla = entrada.readLine();

				pp = new PartidosPoliticos(nome, sigla);
				partidos.inserirFinalPartidosPolitico(pp);
				contador--;
			} // end while
				
			System.out.println("Partidos Cadastrados com sucesso.");
			System.out.println("");
			
		} catch (Exception e) {
			System.out.println("Argumento Invalido.");
			System.out.println("");
		} // end catch
	} // end CadastroPartidosPoliticos()
	
// M�todo que verifica se o arquivo Municipios ja existe.
	
	public static void ArquivoMunicipios (ListaTRE Municipios) {
		Municipios cm;
		String[] dadosLidos;
		String strLine = "", nome, estados;
		int quant_habitantes, vagas_vereador;
		
		try {
			File arquivo = new File ("Municipios.txt");
				
			// Verifica se o arquivo existe
			if (arquivo.exists()) {
				// Pega os dados do arquivo e coloca na lista
				FileInputStream fstream = new FileInputStream(arquivo);
				BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
				
				while ((strLine = br.readLine()) != null) {
					dadosLidos = strLine.split(";");
					nome = dadosLidos[0];
					estados = dadosLidos[1];
					quant_habitantes = Integer.parseInt(dadosLidos[2]);
					vagas_vereador = Integer.parseInt(dadosLidos[3]);
		
					cm = new Municipios(nome, estados, quant_habitantes, vagas_vereador);
					Municipios.inserirFinalMunicipios(cm);
				} // end while
				arquivo.delete();
				fstream.close();
			} else {
				System.out.println("Arquivo Municipios n�o encontrado, ser� criado assim que inserir alguma informa��o.");
			} // end else
		} catch (Exception e) {
			System.out.println("");
		} // end catch
	} // end ArquivoMunicipios()	
	
// Cadastro de Municipios.	

	public static void CadastroMunicipios(ListaTRE municipios) {
		Municipios cm;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String nome, estados;
		int quant_habitantes, vagas_vereador;

		try {
			System.out.println("Cadastro de Municipios!");
			System.out.println("Digite quantos municipios serao cadastrados: ");
			int contador = Integer.parseInt(entrada.readLine());

			while (contador != 0) {
				System.out.println("Digite o nome do Municipio: ");
					nome = entrada.readLine();

				System.out.println("Digite o estado: ");
					estados = entrada.readLine();

				System.out.println("Digite a quantidade de habitantes: ");
					quant_habitantes = Integer.parseInt(entrada.readLine());

				System.out.println("Digite o numero de vagas de vereador: ");
					vagas_vereador = Integer.parseInt(entrada.readLine());

				cm = new Municipios(nome, estados, quant_habitantes, vagas_vereador);
				municipios.inserirFinalMunicipios(cm);
				contador--;
			} // end while
			
			System.out.println("Municipios Cadastrados com sucesso.");
			System.out.println("");
		} catch (Exception e) {
			System.out.println("Argumento Invalido.");
			System.out.println("");
		} // end catch
	} // end CadastroMunicipios()
	
// M�todo que verifica se o arquivo de Candidatos ja existe.
	
	public static void ArquivoCandidatos (ListaTRE candidatos) {
		Candidatos c;
		String[] dadosLidos;
		String strLine = "", nome, municipio, sigla_partido;
		char cargo;
		int numero;
		
		try {
			File arquivo = new File ("Candidatos.txt");
					
			// Verifica se o arquivo existe
			if (arquivo.exists()) {
				// Pega os dados do arquivo e coloca na lista
				FileInputStream fstream = new FileInputStream(arquivo);
				BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
					
				while ((strLine = br.readLine()) != null) {
					dadosLidos = strLine.split(";");
					nome = dadosLidos[0];
					numero = Integer.parseInt(dadosLidos[1]);
					municipio = dadosLidos[2];
					sigla_partido = dadosLidos[3];
					cargo = dadosLidos[4].charAt(0);
			
					c = new Candidatos(nome, numero, municipio, sigla_partido, cargo);
					candidatos.inserirFinalCandidatos(c);
				} // end while
				arquivo.delete();
				fstream.close();
			} else {
				System.out.println("Arquivo Candidatos n�o encontrado, ser� criado assim que inserir alguma informa��o.");
			} // end else
		} catch (Exception e) {
			System.out.println("");
		} // end catch
	} // end ArquivoCandidatos()	
	
// Cadastro de Candidatos.	

	public static void CadastroCandidatos(ListaTRE candidatos) {
		Candidatos c;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String nome, municipio, sigla_partido;
		char cargo;
		int numero;

		try {
			System.out.println("Cadastro de Candidatos!");
			System.out.println("Digite quantos Candidatos serao cadastrados: ");
			int contador = Integer.parseInt(entrada.readLine());

			while (contador != 0) {
				System.out.println("Digite o nome do candidato: ");
					nome = entrada.readLine();

				System.out.println("Digite o numero do candidato: ");
					numero = Integer.parseInt(entrada.readLine());

				System.out.println("Digite o nome do municipio: ");
					municipio = entrada.readLine();

				System.out.println("Digite a sigla do partido: ");
					sigla_partido = entrada.readLine();

				System.out.println("Digite o cargo do cadidato (�P� para prefeito e �V� para vereador):");
					cargo = entrada.readLine().charAt(0);

				if (cargo == 'P' || cargo == 'V') {
					c = new Candidatos(nome, numero, municipio, sigla_partido, cargo);
					candidatos.inserirFinalCandidatos(c);
					System.out.println("");
				} else {
					System.out.println("Caracter digitado invalido.");
				} // end else				
				contador--;
			} // end while
			
			System.out.println("Candidatos Cadastrados com sucesso.");
			System.out.println("");		
		} catch (Exception e) {
				System.out.println("Argumento Invalido.");
				System.out.println("");
		} // end catch
	} // end CadastroCandidatos
		
// M�todo que verifica se o arquivo de Eleitores ja existe
	
	public static void ArquivoEleitores (ListaTRE eleitores) {
		Eleitores elei;
		String[] dadosLidos;
		String strLine = "", nome, nome_Municipio_eleitoral;
		int numero_titulo_eleitoral, zona_eleitoral, secao_eleitoral;
			
		try {
			File arquivo = new File ("Eleitores.txt");
						
			// Verifica se o arquivo existe
			if (arquivo.exists()) {
				// Pega os dados do arquivo e coloca na lista
				FileInputStream fstream = new FileInputStream(arquivo);
				BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
						
				while ((strLine = br.readLine()) != null) {
					dadosLidos = strLine.split(";");
					nome = dadosLidos[0];
					numero_titulo_eleitoral = Integer.parseInt(dadosLidos[1]);
					nome_Municipio_eleitoral = dadosLidos[2];
					zona_eleitoral = Integer.parseInt(dadosLidos[3]);
					secao_eleitoral = Integer.parseInt(dadosLidos[4]);
				
					elei = new Eleitores(nome, numero_titulo_eleitoral, nome_Municipio_eleitoral, zona_eleitoral, secao_eleitoral);
					eleitores.inserirFinalEleitores(elei);
				} // end while
				arquivo.delete();
				fstream.close();
			} else {
				System.out.println("Arquivo Eleitores n�o encontrado, ser� criado assim que inserir alguma informa��o.");
				} // end else
		} catch (Exception e) {
			System.out.println("");
		} // end catch
	} // end ArquivoEleitores()
	
// Cadastro de Eleitores.	

	public static void CadastroEleitores(ListaTRE eleitores) {
		Eleitores eleito;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String nome, nome_Municipio_eleitoral;
		int numero_titulo_eleitoral, zona_eleitoral, secao_eleitoral;

		try {
			System.out.println("Cadastro de Eleitores!");
			System.out.println("Digite quantos Eleitores serao cadastrados: ");
			int contador = Integer.parseInt(entrada.readLine());

			while (contador != 0) {
				System.out.println("Digite o nome do eleitor: ");
					nome = entrada.readLine();

				System.out.println("Digite o numero do titulo eleitoral: ");
					numero_titulo_eleitoral = Integer.parseInt(entrada.readLine());

				System.out.println("Digite o nome do municipio eleitoral: ");
					nome_Municipio_eleitoral = entrada.readLine();

				System.out.println("Digite o numero da zona eleitoral: ");
					zona_eleitoral = Integer.parseInt(entrada.readLine());

				System.out.println("Digite o numero da secao eleitoral:");
					secao_eleitoral = Integer.parseInt(entrada.readLine());

				eleito = new Eleitores(nome, numero_titulo_eleitoral, nome_Municipio_eleitoral, zona_eleitoral, secao_eleitoral);
				eleitores.inserirFinalEleitores(eleito);
				contador--;
			} // end while

			System.out.println("Eleitores Cadastrados com sucesso.");
			System.out.println("");	
		} catch (Exception e) {
			System.out.println("Argumento Invalido.");
			System.out.println("");
		} // end catch
	} // end CadastroEleitores()
		
// M�todo que verifica se o arquivo de Urnas Eletronicas ja existe
	
	public static void ArquivoUrnasEletronicas (ListaTRE urnaseletronicas) {
		UrnasEletronicas ul;
		String[] dadosLidos;
		String strLine = "", nome_municipio;
		int zona_eleitoral, secao_eleitoral;
				
		try {
			File arquivo = new File ("UrnasEletronicas.txt");
							
			// Verifica se o arquivo existe
			if (arquivo.exists()) {
				// Pega os dados do arquivo e coloca na lista
				FileInputStream fstream = new FileInputStream(arquivo);
				BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
							
				while ((strLine = br.readLine()) != null) {
					dadosLidos = strLine.split(";");
					nome_municipio = dadosLidos[0];
					zona_eleitoral = Integer.parseInt(dadosLidos[1]);
					secao_eleitoral = Integer.parseInt(dadosLidos[2]);
					
					ul = new UrnasEletronicas(nome_municipio, zona_eleitoral, secao_eleitoral);
					urnaseletronicas.inserirFinalUrnasEletronicas(ul);
				} // end while
				arquivo.delete();
				fstream.close();
			} else {
				System.out.println("Arquivo UrnasEletronicas n�o encontrado, ser� criado assim que inserir alguma informa��o.");
				} // end else
		} catch (Exception e) {
			System.out.println("");
		} // end catch
	} // end ArquivoUrnasEletronicas()
		
// Cadastro de Urnas Eletronicas.	

	public static void CadastroUrnasEletronicas(ListaTRE UrnasEletronicas) {
		UrnasEletronicas ul;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String nome_municipio;
		int zona_eleitoral, secao_eleitoral;

		try {
			System.out.println("Cadastro de Urnas Eletronicas!");
			System.out.println("Digite quantas Urnas Eletronicas serao cadastradas: ");
			int contador = Integer.parseInt(entrada.readLine());

			while (contador != 0) {
				System.out.println("Digite o nome do municipio: ");
					nome_municipio = entrada.readLine();

				System.out.println("Digite o numero da zona eleitoral: ");
					zona_eleitoral = Integer.parseInt(entrada.readLine());

				System.out.println("Digite o numero da secao eleitoral:");
					secao_eleitoral = Integer.parseInt(entrada.readLine());

				ul = new UrnasEletronicas(nome_municipio, zona_eleitoral, secao_eleitoral);
				UrnasEletronicas.inserirFinalUrnasEletronicas(ul);
				contador--;
			} // end while
			
			System.out.println("Urnas Eletronicas Cadastradas com sucesso.");
			System.out.println("");			
		} catch (Exception e) {
			System.out.println("Argumento Invalido.");
			System.out.println("");
		} // end catch
	} // end CadastroUrnasEletronicas	
	
// Metodo que exibe o Menu
	
	public static void Menu () {
		System.out.println ("Digite: ");
		System.out.println ("1- Cadastrar Partidos Politicos: ");
		System.out.println ("2- Cadastrar Municipios: ");
		System.out.println ("3- Cadastrar Candidatos: ");
		System.out.println ("4- Cadastrar Eleitores: ");
		System.out.println ("5- Cadastrar Urnas Eletronicas: ");
		System.out.println ("6- Exportar Dados para as urnas: ");
		System.out.println ("7- Contabilizar Votos urnas depois das elei��es: ");
		System.out.println ("8- Fechar o programa: ");
	} // end Menu
	
// M�todo Principal

	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		ListaTRE partidos = new ListaTRE(); // Lista de Partidos Politicos
		ListaTRE municipios = new ListaTRE(); // Lista de Municipios
		ListaTRE candidatos = new ListaTRE(); // Lista de Candidatos
		ListaTRE eleitores = new ListaTRE(); // Lista de Eleitores
		ListaTRE urnaseletronicas = new ListaTRE(); // Listas de Urnas Eletronicas
		
		int op = 0;
		
		System.out.println("Tribunal Regional Eleitoral v1.0");
		
		// Retorna se os arquivos existem ou n�o
		ArquivoPartidosPoliticos(partidos);
		ArquivoMunicipios(municipios);
		ArquivoCandidatos(candidatos);
		ArquivoEleitores(eleitores);
		ArquivoUrnasEletronicas(urnaseletronicas);
		
		do {
			System.out.println ("");
			
			// M�todo Menu
			Menu();
			op = Integer.parseInt(entrada.readLine());
  
			switch (op) {
				case 1:
					CadastroPartidosPoliticos(partidos);
				break;

					case 2:
						CadastroMunicipios(municipios);	
					break;

						case 3:
							CadastroCandidatos(candidatos);
						break;

							case 4:
								CadastroEleitores(eleitores);
							break;

								case 5:
									CadastroUrnasEletronicas(urnaseletronicas);
								break;

									case 6:
										urnaseletronicas.CriaArquivoParaUrnasEletronicas(eleitores, candidatos);
									break;

										case 7: 
											System.out.println("Contabilizar votos da urna: ");
											
											// chama os aquivos gerados pela urna 
											candidatos.leArquivosGeradosUrna(candidatos);
										break;
										
											case 8: 
												// Atualiza os dados dos arquivos
												partidos.CriarArquivoPartidosPoliticos();
												municipios.CriarArquivoMunicipios();
												candidatos.CriarArquivoCandidatos();
												eleitores.CriarArquivoEleitores();
												urnaseletronicas.CriarArquivoUrnasEletronicas();
												
												System.out.println("Obrigado por utilizar o programa!");
												System.exit(0);
											break;
 
											default:
												System.out.println("Digite uma op��o valida.");
											break;
			} // end switch
		} while (op >= 1 || op <= 7); // end while
	} // end main
} // end class MainTRE