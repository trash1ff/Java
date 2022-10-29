
public class Computador {
	String fabricante;
	Processador Processador;
	Memoria Memoria;
	Disco Disco;
	
	Computador(String fabricante, Processador Processador, Memoria Memoria, Disco Disco){
		this.fabricante = fabricante;
		this.Processador = Processador;
		this.Memoria = Memoria;
		this.Disco = Disco;
	}
	
	String getDescricao(){
		return "Computador: fabricante="
				+this.fabricante+",processador="+this.Processador.getDescricao()
				+",memoria="+this.Memoria.getDescricao()
				+",disco="+this.Disco.getDescricao();
	}

}
