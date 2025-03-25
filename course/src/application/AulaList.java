package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AulaList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();//não usar tipos primitivos, apenas a wrapper class do tipo
		//adicionando elementos na lista
		list.add("Neymar");
		list.add("Robinho");
		list.add("Robinho Jr.");
		list.add("Ricardo Oliveira");
		list.add("Tiquinho");
		list.add("Chermont");
		list.add("Schmidt");
		list.add("Cazares");
		list.add(3, "Rollheiser");
		
		
		
		
		
		System.out.println(list.size());
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("=============================================");
		//removendo elemento da lista
				list.remove("Ricardo Oliveira");
				list.remove(1);
				
		//removendo elementos por predicado
		list.removeIf(x -> x.charAt(0) == 'C');//função lambda
		for(String x : list) {
			System.out.println(x);
		}
		
		//procurando um elemento na lista
		System.out.println("=============================================");
		System.out.println("Index of Rollheiser: " + list.indexOf("Rollheiser"));
		System.out.println("Index of Pelé: " + list.indexOf("Pelé"));//quando não encontra o elemento retorna o valor -1
		
		//selecionar apenas elemento que contiver um caracter especifico
		System.out.println("=============================================");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
		//primeiro converte para stream, faz a operação lambda usando o filter e depois converte novamente para list
		for(String x : result) {
			System.out.println(x);
		}
		
		//retornar o primeiro elemento selecionado
		System.out.println("=============================================");
		String name = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse(null);
		System.out.println(name);

	}

}
