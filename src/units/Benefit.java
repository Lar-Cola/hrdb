package units;

public class Benefit {
	private String benefitName = null;
	private int benefitID = -1;
	
	public Benefit(String name, int ID) {
		this.benefitName = name;
		this.benefitID = ID;
	}
	
	public void setBenefitName(String name) {
		this.benefitName = name;
	}
	
	public void setBenefitID(int ID) {
		this.benefitID = ID;
	}
	
	public String getBenefitName() {
		return this.benefitName;
	}
	
	public long getBenefitID() {
		return this.benefitID;
	}
}
