package bmi_publisher;

public class BmiPublishServiceImpl implements BmiPublishService {

	//Conversion of other weight units to Kilograms for (BMI)metric calculation
	@Override
	public double standardizedWeight(double weight, String unit) {
		// TODO Auto-generated method stub
		double convertedValue = 0;
		
		if(unit.equalsIgnoreCase("Kg")) {
			convertedValue = weight;
		}
		else if(unit.equalsIgnoreCase("g")) {
			convertedValue = weight / 1000;
		}
		else if(unit.equalsIgnoreCase("lb")) {
			convertedValue = weight / 2.2046;
		}
		else if(unit.equalsIgnoreCase("t")) {
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
		double convertedValue = 0;
		
		if(unit.equalsIgnoreCase("m")) {
			convertedValue = height;
		}
		else if(unit.equalsIgnoreCase("cm")) {
			convertedValue = height / 100;
		}
		else if(unit.equalsIgnoreCase("inches")) {
			convertedValue = height * 2.54;
		}
		else if(unit.equalsIgnoreCase("km")) {
			convertedValue = height * 1000;
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

	//Function to calculate BMI
	@Override
	public double calculateBMI(double weight, double height) {
		// TODO Auto-generated method stub
		double value = 0;
		
		value = weight / (height * height);
		
		return value;
	}

	//Function to provide health tips based of calculated bmi
	@Override
	public void suggestHealthTips(double bmi) {
		// TODO Auto-generated method stub
		System.out.println("Suggest Health Tips");
		System.out.println("Your BMI value is : " + bmi);
	}

	@Override
	public void testRun() {
		// TODO Auto-generated method stub
		System.out.println("Publisher => test run");
	}

}
