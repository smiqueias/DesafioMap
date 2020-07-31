package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Function <Integer,String> converterNumeroParaBinario = num -> num.toBinaryString(num);
		
		numeros.stream().map(converterNumeroParaBinario).forEach(print);
		
		Function <String,String> inverterString = s -> new StringBuilder(s).reverse().toString();
		
		System.out.println("INVERTENDO OS BINÁRIOS");
		
		numeros.stream().map(converterNumeroParaBinario).map(inverterString).forEach(print);
		
		Function <String,Integer> deVoltaParaInteiro = s -> Integer.parseInt(s, 2);
		
		System.out.println("DE VOLTA PARA INTEIRO");
		Consumer<Integer> print1 = System.out::println;
		
		numeros.stream().map(converterNumeroParaBinario).map(inverterString).map(deVoltaParaInteiro).forEach(print1);
	}

}
