package bmi_publisher;

public interface BmiPublishService {

	public void testRun();
	public double standardizedWeight(double weight, String unit);
	public double standardizedHeight(double height, String unit);
	public double calculateBMI(double weight, double height);
	public String suggestHealthTips(double bmi);
	
}
