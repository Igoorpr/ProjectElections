package moduloTRE;

public class CelulaTRE {
	
	PartidosPoliticos itemPartidos; // item da lista de PartidosPoliticos
	Municipios itemMunicipios; // item da lista de Municipios
	Candidatos itemCandidatos; // item da lista de Municipios
	Eleitores itemEleitores; // item da lista de Eleitores
	UrnasEletronicas itemUrnasEletronicas; // item da lista UrnasEletronicas
	CelulaTRE proximo; // Usado em todas as listas
	
	CelulaTRE() {
		itemPartidos = new PartidosPoliticos(); // item da lista de PartidosPoliticos
		itemMunicipios = new Municipios(); // item da lista de Municipios
		itemCandidatos = new Candidatos(); // item da lista de Candidatos
		itemEleitores = new Eleitores(); // item da lista de Eleitores
		itemUrnasEletronicas = new UrnasEletronicas(); // item da lista UrnasEletronicas
		proximo = null; // Usado em todas as listas
	} // end CelulaTRE
} // end class CelulaTRE