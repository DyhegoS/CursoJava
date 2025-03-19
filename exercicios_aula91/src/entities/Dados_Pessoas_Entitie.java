package entities;

public class Dados_Pessoas_Entitie {
	private char gender;
	private double height;
	
	public Dados_Pessoas_Entitie(char gender, double height) {
		this.gender = gender;
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char sex) {
		this.gender = sex;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
