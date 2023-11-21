package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2023-11-18");
		LocalDate d05 = LocalDate.parse("2023-11-18");
		Instant d06 = Instant.parse("2023-11-18T15:53:22Z");
		Instant d07 = Instant.parse("2023-11-18T15:53:22-00:05");
		LocalDate d08 = LocalDate.parse("18/11/2023",fmt1);
		LocalDateTime d09 = LocalDateTime.parse("18/11/2023 16:13",fmt2);
		
		
		
		
		System.out.println("D01="+d01);
		System.out.println("D02="+d02);
		System.out.println("D03="+d03);
		System.out.println("D04="+d04);
		System.out.println("D05="+d05);
		System.out.println("D06="+d06);
		System.out.println("D07="+d07);
		System.out.println("D07="+d08);
		System.out.println("D07="+d09);
	}

}
