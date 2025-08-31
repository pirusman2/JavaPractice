import java.util.Scanner;
public class fourth {
    static String a = "Speeding Ticket";
    public static void main(String[] args) {
        int userinput;
        System.out.println("Enter your input");
        Scanner scanner = new Scanner(System.in);
        userinput = scanner.nextInt();
        if (userinput>120){
            System.out.println(a);
        }
        else {
            System.out.println("speed is in limit");
        }

    }
}
