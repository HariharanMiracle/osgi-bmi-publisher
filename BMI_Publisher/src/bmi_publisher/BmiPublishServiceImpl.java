package bmi_publisher;

public class BmiPublishServiceImpl implements BmiPublishService {

	//Conversion of other weight units to Kilograms for (BMI)metric calculation
	@Override
	public double standardizedWeight(double weight, String unit) {
		// TODO Auto-generated method stub
		double convertedValue = 0;
		
		if(unit.equals("Kg")) {
			convertedValue = weight;
		}
		else if(unit.equals("g")) {
			convertedValue = weight / 1000;
		}
		else if(unit.equals("lb")) {
			convertedValue = weight / 2.2046;
		}
		else if(unit.equals("t")) {
			convertedValue = weight * 1000;
		}
		else {
			//invalid unit
			return -1;
		}
		
		if(convertedValue <= 0) {
			//invalid input
			return -2;
		}
		
		return convertedValue;
	}

	//Conversion of other length units to Meters for (BMI)metric calculation
	@Override
	public double standardizedHeight(double height, String unit) {
		// TODO Auto-generated method stub
		return 0;
	}

	//Function to calculate BMI
	@Override
	public double calculateBMI(double weight, double height) {
		// TODO Auto-generated method stub
		return 0;
	}

	//Function to provide health tips based of calculated bmi
	@Override
	public String suggestHealthTips(double bmi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void testRun() {
		// TODO Auto-generated method stub
		System.out.println("Publisher => test run");
	}

}
