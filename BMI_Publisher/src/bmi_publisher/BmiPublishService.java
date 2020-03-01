package bmi_publisher;

public interface BmiPublishService {

	public void testRun();
	public double calculateBMI(double weight, double height);
	public void suggestHealthTips(double bmi);
	
}

