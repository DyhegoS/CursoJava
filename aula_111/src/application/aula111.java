package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class aula111 {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2018-08-01");
		LocalDateTime d05 = LocalDateTime.parse("2018-08-01T04:00:00");
		Instant d06 = Instant.parse("2018-08-01T15:26:38Z");
		Instant d07 = Instant.parse("2018-08-01T15:26:38-03:00");
		
		LocalDate d08 = LocalDate.parse("01/08/2023", fmt1);
		//LocalDate d08 = LocalDate.parse("01/08/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")); -> pode ser feito assim também
		LocalDateTime d09 = LocalDateTime.parse("15/09/2015 13:26", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 12, 12);
		LocalDateTime d11 = LocalDateTime.of(2022, 12, 12, 8, 30);
		
		System.out.println("LocalDate usando .now: " + d01.toString());//esse .toString() não é necessario, pois ele é implicito em LocalDate, 
																		//LocalDateTime e Instant
		System.out.println("LocalDateTime usando .now: " + d02);
		System.out.println("Instant usando .now: " + d03);
		System.out.println("LocalDate usando .parse: " + d04);
		System.out.println("LocalDateTime usando .parse: " + d05);
		System.out.println("Instant usando .parse: " + d06);
		System.out.println("Instant usando .parse com fuso horario: " + d07);
		System.out.println("LocalDate usando .parse customizado: " + d08);
		System.out.println("LocalDateTime usando .parse customizado: " + d09);
		System.out.println("LocalDate usado o .of = " + d10);
		System.out.println("LocalDateTime usado o .of = " + d11);
		
	}

}
