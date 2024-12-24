public class labEx2 {
    public static void main(String[] args) {
        // Example IP address
        String ipAddress = "192.168.1.1";

        // Split the IP address into octets
        String[] IP = ipAddress.split("\\.");

        // Print each octet
        for (String Ip : IP) {
            System.out.println(Ip);
        }
    }
}
