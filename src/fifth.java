import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
       Scanner user = new Scanner(System.in);
       int first = Integer.valueOf(user.nextInt());
       int second = Integer.valueOf(user.nextInt());
       int third = Integer.valueOf(user.nextInt());
       float solution = first * second / third;

        System.out.println("Answer is " +solution);
        System.out.println("your inputs were"+first+ "and" +second+ "and" +third);

    }
}
