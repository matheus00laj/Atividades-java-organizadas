package atividadeHerança;

public abstract class Animal {
	double peso;
	boolean pelo;
	double altura;
	boolean pena;
	boolean bico;
	boolean calda;
	boolean unhas;
	String nome;
	
	
	void andar() {
		System.out.println(nome+" Está andando");
	}
	abstract void som(String sons);
	
	void prints(String grupo) {
		System.out.println("nome:"+nome);
		System.out.println("altura:"+altura);
		System.out.println("peso:"+peso);
		System.out.println("pelo:"+pelo);
		System.out.println("pena:"+pena);
		System.out.println("bico:"+bico);
		System.out.println("unhas:"+unhas);
		System.out.println("calda:"+calda);
		System.out.println("classe:"+grupo);
	}
}
	