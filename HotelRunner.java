public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		HotelDetails hotel = new HotelDetails();
		hotel.setRegId(10);
		hotel.setName("Raddison");
		hotel.setLocation("Delhi");
		hotel.setNoOfRooms(300);
		hotel.setRatings(5);
		hotel.setHasSwimmingPool(true);
		
		HotelDetails hotel2 = new HotelDetails();
		hotel2.setRegId(11);
		hotel2.setName("Taj Hotel");
		hotel2.setLocation("Mumbai");
		hotel2.setNoOfRooms(500);
		hotel2.setRatings(7);
		hotel2.setHasSwimmingPool(true);
		
		HotelDetails hotel3 = new HotelDetails();
		hotel3.setRegId(12);
		hotel3.setName("Leela Palace");
		hotel3.setLocation("Bengaluru");
		hotel3.setNoOfRooms(250);
		hotel3.setRatings(5);
		hotel3.setHasSwimmingPool(true);
		
		HotelDetails hotel4 = new HotelDetails();
		hotel4.setRegId(13);
		hotel4.setName("Hotel Shubham");
		hotel4.setLocation("Hyderabad");
		hotel4.setNoOfRooms(50);
		hotel4.setRatings(3.2);
		hotel4.setHasSwimmingPool(false);
		
		HotelDetails hotel5 = new HotelDetails();
		hotel5.setRegId(14);
		hotel5.setName("Paramount");
		hotel5.setLocation("Chennai");
		hotel5.setNoOfRooms(100);
		hotel5.setRatings(4.1);
		hotel5.setHasSwimmingPool(false);
		
		HotelOperation ops = new HotelOperation();
		ops.saveHotelOperation(hotel);
		ops.saveHotelOperation(hotel2);
		ops.saveHotelOperation(hotel3);
		ops.saveHotelOperation(hotel4);
		ops.saveHotelOperation(hotel5);
		
		System.out.println("\n---Read----\n");
		ops.readHotelOperation();
		
		System.out.println("\n---Delete----\n");
		ops.deleteHotelLogs(13);
		
		System.out.println("\n---Read----\n");
		ops.readHotelOperation();
		
		System.out.println("\n---Update----\n");
		HotelDetails updateHotel = new HotelDetails();
		updateHotel.setRegId(14);
		updateHotel.setName("The Oberoi");
		updateHotel.setLocation("Mumbai");
		updateHotel.setNoOfRooms(100);
		updateHotel.setRatings(4.1);
		updateHotel.setHasSwimmingPool(false);
		
		ops.updateHotelLogs(updateHotel);
		
		System.out.println("\n---Read----\n");
		ops.readHotelOperation();
		
		System.out.println("\n---search----\n");
		ops.searchByLocation();
	}
}