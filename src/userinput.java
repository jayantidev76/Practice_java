import java.util.Scanner; // import scanner class
public class userinput {
    public static void main(String[] args) {
        int a , b , sum;
        Scanner myObj = new Scanner(System.in);// create a scanner
        System.out.println("Type a number");
        a = myObj.nextInt(); //read user input
        System.out.println("Type another number");
        b = myObj.nextInt();   //read user input

        sum = a + b;  // calculate the sum of a + b
        System.out.println("Sum is :"+ sum); // print the sum



    }
}
