public class FitnessRunner {

	public static void main(String[] args) {
		System.out.println("Main method");
		
		FitnessCenterDto center = new FitnessCenterDto();
		center.setRegId(1001);
		center.setName("CultFit");
		center.setLocation("Indiranagar");
		center.setIsJumbaAvailable("Yes");
		center.setTotalMemberships(9);
		
		System.out.println("Fitness Center details are: "+center);
		
		FitnessService fitnessService = new FitnessSeriveImpl();
		fitnessService.validateAndSave(center);
	}
}