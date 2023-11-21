package app;

import java.time.Instant;
import java.time.LocalDate;

public class CalculoDataHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalDate d04 = LocalDate.parse("2023-11-18");
		LocalDate d05 = LocalDate.parse("2023-11-18");
		Instant d06 = Instant.parse("2023-11-18T15:53:22Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
	}

}
