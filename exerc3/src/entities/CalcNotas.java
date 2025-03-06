package entities;

public class CalcNotas {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public double missing = 60;
	
	public double sumGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public boolean verifyGrade() {
		if(this.sumGrade() > 60) {
			return true;
		}else {
			missing -= sumGrade();
			return false;
		}

	}
}


