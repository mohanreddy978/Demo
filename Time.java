import java.util.Scanner;

public class Time {
    int hours;
    int minutes;
    int seconds;

    void getTime() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hours");
        hours = input.nextInt();
        System.out.println("Enter minutes");
        minutes = input.nextInt();
        System.out.println("enter seconds");
    }

    void setTime() {
        System.out.println(hours + ":" + minutes + ":" + seconds + ":");
    }

    public static void main(String[] args) {
        Time t = new Time();
        t.getTime();
        t.setTime();
    }

}