import java.util.Scanner;

public class If_else {


    public static void main(String[] args) {


//     Məsələ 1:
//     İstifadəçidən iki ədəd alın və bu ədədlərin bir-birinə bərabər olub-olmamasını yoxlayın.
//     Əgər bərabərsə, "Ədədlər bərabərdir" mesajını, əks halda "Ədədlər bərabər deyil" mesajını yazdırın.
//

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        double a = sc.nextDouble();
//        System.out.println("Enter the second number: ");
//        double b = sc.nextDouble();
//        if (a == b)
//            System.out.println("The numbers are equal");
//        else System.out.println("The numbers are not equal");


//
//        Məsələ 2:
//        Bir ədəd alın və həmin ədədin sadə,
//        ya da mürəkkəb olduğunu yoxlayan bir proqram yazın.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if (a <= 1) {
            System.out.println("Complex number");
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println("Complex number");
                break;

            }
        }
        System.out.println("Simple number");


//        Məsələ 3:
//        Bir ədəd alın və həmin ədədin tək, ya da cüt olduğunu yoxlayan bir proqram yazın.


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int a = sc.nextInt();
//
//        if (a % 2 == 0) {
//            System.out.println(a +" is even number");
//        }
//        else {System.out.println(a +" is odd number");
//        }


//        Məsələ 4:
//        İstifadəçidən iki ədəd və bir əməliyyat işarəsi (+, -, *, /) alın.
//        Bu əməliyyatı yerinə yetirin və nəticəni yazdırın.
//        Əgər istifadəçi səhv əməliyyat işarəsi daxil edərsə, "Yanlış əməliyyat" mesajını yazdırın.


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        double a = sc.nextDouble();
//        System.out.println("Enter the second number: ");
//        double b = sc.nextDouble();
//        System.out.println("Choose an operator: ");
//        char t = sc.next().charAt(0);
//        double result;
//        if (t == '+') {
//            result = a + b;
//            System.out.println("Result is: " + result);
//            return;
//        }
//        if (t == '-') {
//            result = a - b;
//            System.out.println("Result is: " + result);
//            return;
//        }
//        if (t == '*') {
//            result = a * b;
//            System.out.println("Result is: " + result);
//            return;
//        }
//        if (t == '/' && b !=0) {
//            result = a / b;
//            System.out.println("Result is: " + result);
//            return;
//        }
//        if (t == '/' && b ==0){
//            System.out.println("Sifira bolme yoxudr");
//            return;
//        }
//        else  {
//            System.out.println("Invalid operator");
//        }


    }


}
