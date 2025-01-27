public class T20Runner {

	public static void main(String[] args) {
		System.out.println("Main method");
		
		T20CricketDto t20Cricket = new T20CricketDto();
		t20Cricket.setMatchNumber(1);
		t20Cricket.setSeriesName("Nihadas Trophy");
		t20Cricket.setSponsorName("Paytm");
		t20Cricket.setPlayedBtw("India and Bangladesh");
		t20Cricket.setTotalOversInAnInnings(20);
		t20Cricket.setNoOfOversBowlerCanBowl(4);
		t20Cricket.setOversInPowerPlay(0);
		
		System.out.println("T20 cricket rules are: "+t20Cricket);
		
		T20Service t20Service = new T20ServiceImpl();
		t20Service.validateAndSave(t20Cricket);
	}
}