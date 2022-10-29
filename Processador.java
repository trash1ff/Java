
public class Processador {
	String marca;
	String modelo;
	double velocidade;
	int numNucleos;
	
	Processador(String marca, String modelo, double velocidade, int numNucleos){
	this.modelo = modelo;
	this.marca = marca;
	this.velocidade =  velocidade;
	this.numNucleos = numNucleos;
	}
	
	double getVelocidadeParalela(){
		return numNucleos*velocidade;
	}
	String getDescricao(){
		return "Processador: marca="
				+this.marca+",modelo="+this.modelo
				+",velocidade="+this.velocidade
				+"Ghz, numNucleos="+this.numNucleos
				+",tamanhoTotal="+this.getVelocidadeParalela()
				+"Ghz";
	}
}

	
