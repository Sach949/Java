public class Servers_Runner{
    public static void main(String [] args){
        Servers server = new Servers();

        Servers server1 = new Servers(250);

        Servers server2 = new Servers("Dell");

        Servers server3 = new Servers("HP", 100);

        Servers server4 = new Servers(20, "Seagate");

        server.serverName = "Dell EMC";
        server.noOfHDD = 80;

        System.out.println(server.serverName);
        System.out.println(server.noOfHDD);

        server1.processorsName = "Intel";
        server1.noOfComponents = 1000;

        System.out.println(server1.processorsName);
        System.out.println(server1.noOfComponents);

        server2.serverName = "Tyrone";
        server2.noOfHDD = 800;

        System.out.println( server2.serverName);
        System.out.println(server2.noOfHDD);

        server3.processorsName = "AMD";
        server3.noOfComponents = 2000;

        System.out.println(server3.processorsName);
        System.out.println(server3.noOfComponents);

        server4.serverName = "Amazon Web Servers";
        server4.noOfComponents = 350;
        System.out.println(server4.serverName);
        System.out.println(server4.noOfComponents);

    }
}