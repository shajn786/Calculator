import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int num1,num2,result,val;
    static String operator =null;
    static boolean flag;
    public static void main(String[] args) {


        while(true) {
            System.out.println("enter the operator");
            System.out.println("+ : To addition\n- : subtraction\n * : To multiplication\n / : To division\n enter 0 to exit ");
            operator = sc.next();
            System.out.println("enter the first number");
            num1 = sc.nextInt();
            System.out.println("enter the Second number");
            num2 = sc.nextInt();
            System.out.println();





            switch (operator) {
                case "+":

                    result = num1 + num2;
                    System.out.println("Result is" + result);

                case "-":

                    result = num1 - num2;
                    System.out.println("Result is" + result);

                case "*":

                    result = num1  * num2;
                    System.out.println("Result is" + result);

                case "/":

                    result = num1  / num2;
                    System.out.println("Result is" + result);

            }


        }



    }
}