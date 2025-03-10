package utils;

public class Converter {
	public static double cotacao;
	public static double dollar;
	
	public static double currencyConverter() {
		double converter = dollar * cotacao;
		double aux = converter * 0.06;
		return converter + aux;
	}
}
