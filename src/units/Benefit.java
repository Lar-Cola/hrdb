package units;


public class Benefit {
	//necessary variables
	private String benefitName = null;
	private int benefitID = -1;
	private String benefitType = null;
	
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
	
	public void setBenefitType(String type) {
		this.benefitType = type;
	}
	
	public String getBenefitName() {
		return this.benefitName;
	}
	
	public int getBenefitID() {
		return this.benefitID;
	}
	
	public String getBenefitType() {
		return this.benefitType;
	}
}
