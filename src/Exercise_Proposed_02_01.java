public class Exercise_Proposed_02_01 {
    public static void main(String[] args) {
        int dni = 32916098;
        String [] letterDNI={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int letterPosition = dni%23;
        System.out.println("Your full DNI is: "+dni+letterDNI[letterPosition]);
    }
}
