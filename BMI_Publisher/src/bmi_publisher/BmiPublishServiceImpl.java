package bmi_publisher;

public class BmiPublishServiceImpl implements BmiPublishService {

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
		System.out.println("Your BMI value is : " + bmi);
		
		if(bmi > 0 && bmi <= 18.5) {
			System.out.println("############### Under weight ###############");
			System.out.println("############### diet plan ###############");
			System.out.println("Add healthy calories\n" + 
					"Go nutrient dense\n" + 
					"Snack away\n" + 
					"Eat mini-meals\n" + 
					"Bulk up.\n\n");
			
			System.out.println("############### Exercise plan ###############");
			System.out.println("You’re probably eating back more calories than you burned in the first place\n" + 
					"Having a high body fat percentage means you’re more likely to feel starving after a workout\n" + 
					"Bench presses help build shoulder, tricep, and chest muscles.\n" +
					"This is a good exercise for bulking up. The more weight you can bench, the more muscle you'll build.\n\n");
		}
		else if(bmi > 18.5 && bmi <= 25) {
			System.out.println("############### Normal weight ###############");
			System.out.println("############### diet plan ###############");
			System.out.println("Emphasizes fruits, vegetables, whole grains, and fat-free or low-fat milk and milk products.\n" + 
					"Includes lean meats, poultry, fish, beans, eggs, and nuts.\n" + 
					"Is low in saturated fats, trans fats, cholesterol, salt (sodium), and added sugars.\n" + 
					"Stays within your daily calorie needs.\n\n");
			
			System.out.println("############### Exercise plan ###############");
			System.out.println("You’re probably eating back more calories than you burned in the first place\n" + 
					"Having a high body fat percentage means you’re more likely to feel starving after a workout\n" + 
					"Bench presses help build shoulder, tricep, and chest muscles.\n" +
					"This is a good exercise for bulking up. The more weight you can bench, the more muscle you'll build.\n\n");
		}
		else if(bmi > 30 && bmi <= 40) {
			System.out.println("############### Over weight ###############");
			System.out.println("############### diet plan ###############");
			System.out.println("Eat a high-protein breakfast.\n" + 
					"Avoid sugary drinks and fruit juice.\n" + 
					"Drink water a half hour before meals.\n" + 
					"Choose weight loss-friendly foods (see list).\n" + 
					"Eat soluble fiber.\n" + 
					"Drink coffee or tea.\n" + 
					"Eat mostly whole, unprocessed foods.\n" + 
					"Eat your food slowly.\n\n");
			
			System.out.println("############### Exercise plan ###############");
			System.out.println("You’re probably eating back more calories than you burned in the first place\n" + 
					"Having a high body fat percentage means you’re more likely to feel starving after a workout\n" + 
					"Bench presses help build shoulder, tricep, and chest muscles.\n" +
					"This is a good exercise for bulking up. The more weight you can bench, the more muscle you'll build.\n\n");
		}
		else {
			System.out.println("Invalid Input\n\n");
		}
		
	}

	@Override
	public void testRun() {
		// TODO Auto-generated method stub
		System.out.println("Publisher => test run");
	}

}
