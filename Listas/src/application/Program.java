package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Rafael");
		list.add("Lara");
		list.add("Fernanda");
		list.add("Rayza");
		list.add("Alana");
		list.add("Alba Celia");
		list.add(2,"Samuel");// Adiciona na Posicao 2
		

		System.out.println("O tamanho da Lista é :"+list.size()+" elementos");
		
		for (String x : list) {
			System.out.println(x);

		}
		System.out.println("**************************************************");
		list.remove("Lara");
		list.remove(0);
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("**************************************************");
		System.out.println("Index of Bob :"+ list.indexOf("Bob"));
		System.out.println("Index of Rafael :"+ list.indexOf("Rafael"));
		System.out.println("----------------------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A')
				.collect(Collectors.toList());		// Converte do Lambda /List
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("#######################################################");
		String name = list.stream().filter(x-> x.charAt(0)=='R').findFirst().orElse(null);
		System.out.println(name);

	}
}
