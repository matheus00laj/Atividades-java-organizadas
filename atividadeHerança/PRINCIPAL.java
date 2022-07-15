package atividadeHerança;

public class PRINCIPAL {

	public static void main(String[] args) {
		CAVALO spirit = new CAVALO();
		doguinho caramelo = new doguinho();
		preguica donaPreguica = new preguica();
		
		
		spirit.peso = 200;
		spirit.pelo = true;
		spirit.altura = 1.80;
		spirit.pena = false;
		spirit.bico = false;
		spirit.calda =  true;
		spirit.unhas = false;
		spirit.nome = "pé de pano";
		spirit.prints("cavalo");
		spirit.som("C A V A L O");
		spirit.andar();
		System.out.println("\n\n");
		
		
		caramelo.peso = 12;
		caramelo.pelo = true;
		caramelo.altura = 0.60;
		caramelo.pena = false;
		caramelo.bico = false;
		caramelo.calda =  true;
		caramelo.unhas = true;
		caramelo.nome = "dossola";
		caramelo.prints("Cachorro");
		caramelo.som("VESTE A CALÇA CENTROPEITO");
		caramelo.andar();
		System.out.println("\n\n");
		
		
		donaPreguica.peso = 60;
		donaPreguica.pelo = true;
		donaPreguica.altura = 1.80;
		donaPreguica.pena = false;
		donaPreguica.bico = false;
		donaPreguica.calda =  true;
		donaPreguica.unhas = true;
		donaPreguica.nome = "Matheus";
		donaPreguica.prints("preguiça");
		donaPreguica.som("EU QUERO DORMIR");
		donaPreguica.andar();
		

	}

}
