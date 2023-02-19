import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
       double fahrenheitTemp = 0;
       double celsiusTemp = 0;
       String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        if(in.hasNextDouble())
        {
            celsiusTemp = in.nextDouble();
            in.nextLine(); // clears the buffer
            fahrenheitTemp = celsiusTemp * 9/5 + 32;
            System.out.println("The equivalent temperature in Fahrenheit is " + fahrenheitTemp + "degrees");
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Must enter a valid number for Celsius temperature: " + trash);
        }

    }
}
