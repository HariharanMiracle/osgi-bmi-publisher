package model;

//This is an assumption, this model is created to make the task more easier
public class BMI {

	//User inputs
	private double weight;
	private double height;
	private String weightUnit;
	private String heightUnit;
	
	//Converted inputs
	private double weightInKG;
	private double heightInM;
	
	//BMI value
	private double bmiValue;
	private String suggestion;
	
	public BMI() {}

	public BMI(double weight, double height, String weightUnit, String heightUnit, double weightInKG, double heightInM,
			double bmiValue, String suggestion) {
		super();
		this.weight = weight;
		this.height = height;
		this.weightUnit = weightUnit;
		this.heightUnit = heightUnit;
		this.weightInKG = weightInKG;
		this.heightInM = heightInM;
		this.bmiValue = bmiValue;
		this.suggestion = suggestion;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public String getHeightUnit() {
		return heightUnit;
	}

	public void setHeightUnit(String heightUnit) {
		this.heightUnit = heightUnit;
	}

	public double getWeightInKG() {
		return weightInKG;
	}

	public void setWeightInKG(double weightInKG) {
		this.weightInKG = weightInKG;
	}

	public double getHeightInM() {
		return heightInM;
	}

	public void setHeightInM(double heightInM) {
		this.heightInM = heightInM;
	}

	public double getBmiValue() {
		return bmiValue;
	}

	public void setBmiValue(double bmiValue) {
		this.bmiValue = bmiValue;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	};
	
}
