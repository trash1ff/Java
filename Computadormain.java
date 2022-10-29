
public class Computadormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processador p1 = new Processador("Intel","I7",1.7,8);
		System.out.println(p1.getDescricao());
		
		Processador p2 = new Processador("AMD","Ryzen 5",1.4,5);
		System.out.println(p2.getDescricao());
		
		Memoria m1 = new Memoria("Kingston","DDR4",8.0,3.2,4);
		System.out.println(m1.getDescricao());
		
		Disco d1 = new Disco("Western Digital", "HDD",4000.0,9600);
		System.out.println(d1.getDescricao());
		
		Computador c1 = new Computador("Delll", p1, m1, d1);
		System.out.println(c1.getDescricao());

	}

}
