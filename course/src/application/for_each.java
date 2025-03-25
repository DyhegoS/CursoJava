package application;

public class for_each {

	public static void main(String[] args) {
		String[] vect = new String[] {"Jailson", "Neymar", "Carlinhos"};//cria o vetor e já adiciona elementos nele
		
		//forma já conhecida
		for(int i = 0; i < vect.length;i++) {
			System.out.println(vect[i]);
			/* Jailson
			 * Neymar
			 * Carlinhos
			 * */
		}
		System.out.println("=============================================");
		//usando o for each
		//tipo apelido : coleção
		//leitura: para cada objeto obj contido em vect, faça:
		for(String obj : vect) {
			System.out.println(obj);
		}

	}

}
