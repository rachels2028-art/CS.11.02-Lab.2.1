import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // 1. Add
        //System.out.print("Enter First Number");
        //int firstNumber = sc.nextInt();
        //System.out.print("Enter Second Number");
        //int secondNumber = sc.nextInt();
        //System.out.println (add(1, 2, 3, 4));
        //System.out.println ( morningGreeting("Toby"));
        //System.out.println (afternoonGreeting("Rachel"));
        //System.out.println (triple("wow"));
        //System.out.println (half(15));
        //System.out.println (roundPositiveValueToNearestInteger(8.49));
        //System.out.println (roundNegativeValueToNearestInteger(-7.8));



    }

    // 1. add   add(3,8) → 11
    public static int add( int num1, int num2 ) {
        return num1 + num2 ;
    }



        // 2. add       add(3,8,4,9) → 24
        public static int add( int num1, int num2 , int num3, int num4 ) {
            int a = add(num1, num2);
            int b = add(num3, num4) ;
            return  add(a, b) ;
        }

        // 3. morningGreeting   morningGreeting(“Toby Fox”) → 早上好, Toby Fox!

        public static String morningGreeting (String name ) {
            return " 早上好, " +  name + "!" ;

        }


        // 4. afternoonGreeting
        public static String afternoonGreeting (String name2) {
            return "下午好," + name2 + "!" ;
        }

        // 5. triple
        public static String triple (String word) {
            return word + word + word ;
        }
        // 6. half      half(17) → 8.5
        public static double half( int num1) {
            return num1 / 2.0 ;
        }

        // 7. roundPositiveValueToNearestInteger roundPositiveValueToNearestInteger(8.49) → 8
            public static int roundPositiveValueToNearestInteger(double num) {
                return (int) Math.round(num) ;
         }
        // 8. roundNegativeValueToNearestInteger
            public static int roundNegativeValueToNearestInteger(double num) {
            int y = (int) Math.round(num);
            return (int) y * -1  ; }




    }