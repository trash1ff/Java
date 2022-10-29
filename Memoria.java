
public class Memoria {
	String marca;
	String tipo;
	double tamanho;
	double velocidade;
	int numPentes;

Memoria(String marca, String tipo,double tamanho, double velocidade, int numPentes){
	this.marca = marca;
	this.tipo = tipo;
	this.tamanho = tamanho;
	this.velocidade =  velocidade;
	this.numPentes = numPentes;
}

double getTamanhoTotal(){
	return numPentes*tamanho;
}

double getVelocidadeParalela(){
	return numPentes*velocidade;
}

String getDescricao(){
	return "Memoria: marca="
			+this.marca+",tipo="+this.tipo
			+"tamanho="+this.tamanho
			+"velocidade="+this.velocidade
			+"Ghz, numPentes="+this.numPentes
			+",Tamanho Total="+this.getTamanhoTotal()+"Ghz"
			+",Velocidade Paralela="+this.getVelocidadeParalela();
}

}