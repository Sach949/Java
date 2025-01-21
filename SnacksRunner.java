public class SnacksRunner {

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		SnacksDetails snacks = new SnacksDetails();
		snacks.setSnacksId(1);
		snacks.setSnacksName("Chips");
		snacks.setType("French");
		snacks.setPrice(10);
		snacks.setQuantity(50);
		snacks.setHealthy(false);
		
		SnacksDetails snacks2 = new SnacksDetails();
		snacks2.setSnacksId(2);
		snacks2.setSnacksName("Samosa");
		snacks2.setType("Indian");
		snacks2.setPrice(15);
		snacks2.setQuantity(100);
		snacks2.setHealthy(false);
		
		SnacksDetails snacks3 = new SnacksDetails();
		snacks3.setSnacksId(3);
		snacks3.setSnacksName("Biscuits");
		snacks3.setType("British");
		snacks3.setPrice(5);
		snacks3.setQuantity(15);
		snacks3.setHealthy(true);
		
		SnacksDetails snacks4 = new SnacksDetails();
		snacks4.setSnacksId(4);
		snacks4.setSnacksName("Noodles");
		snacks4.setType("Chinese");
		snacks4.setPrice(100);
		snacks4.setQuantity(3);
		snacks4.setHealthy(false);
		
		SnacksDetails snacks5 = new SnacksDetails();
		snacks5.setSnacksId(5);
		snacks5.setSnacksName("Uddin vada");
		snacks5.setType("Indian");
		snacks5.setPrice(20);
		snacks5.setQuantity(2);
		snacks5.setHealthy(true);
		
		SnacksDetails snacks6 = new SnacksDetails();
		snacks6.setSnacksId(6);
		snacks6.setSnacksName("Pizza");
		snacks6.setType("Italian");
		snacks6.setPrice(100);
		snacks6.setQuantity(1);
		snacks6.setHealthy(false);
		
		SnacksLogs logs = new SnacksLogs();
		logs.saveSnakcsLogs(snacks);
		logs.saveSnakcsLogs(snacks2);
		logs.saveSnakcsLogs(snacks3);
		logs.saveSnakcsLogs(snacks4);
		logs.saveSnakcsLogs(snacks5);
		logs.saveSnakcsLogs(snacks6);
		
		System.out.println("]\n----Read---\n");
		logs.readsnacksLogs();
		
		System.out.println("\n---Delete----\n");
		logs.deleteSnacksLogs(3);
		
		System.out.println("\n---Read----\n");
		logs.readsnacksLogs();
		
		System.out.println("\n---Update----\n");
		SnacksDetails updateSnacks = new SnacksDetails();
		updateSnacks.setSnacksId(4);
		updateSnacks.setSnacksName("Wheat Burger");
		updateSnacks.setType("USA");
		updateSnacks.setPrice(65);
		updateSnacks.setQuantity(1);
		updateSnacks.setHealthy(true);
		
		logs.updateSnacksLogs(updateSnacks);
		
		System.out.println("\n---Read----\n");
		logs.readsnacksLogs();
		
		System.out.println("\n---search----\n");
		logs.searchSnacksLogs(5);
		
		
		
	}
}