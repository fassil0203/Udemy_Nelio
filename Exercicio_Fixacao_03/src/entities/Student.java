package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;

	}

	public double missingPoints() {
		if (finalGrade() < 8.5) {
			return 8.5 - finalGrade();
		} else {
			return 0.0;
		}
	}

}