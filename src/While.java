import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {


//        Məsələ 1:
//        İstifadəçidən bir ədəd alın və bu ədədin asal olub olmadığını yoxlayın.
//        Əgər asal ədədirsə, "Asal ədəddir", əks halda "Asal ədəd deyil" mesajını yazdırın.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        if (n <= 1)
//            System.out.println("Complex number");
//
//        int i = 2;
//        boolean flag = true;
//        while (i <= Math.sqrt(n)) {
//
//            if (n % i == 0) {
//                System.out.println("Complex number");
//                flag = false;
//                break;
//            }
//            i++;
//        }
//        if (flag){
//            System.out.println("Simple number");
//        }
//   }

//    Məsələ 2:
//    İstifadəçidən bir ədəd alın və bu ədədə qədər olan bütün müsbət tam
//    ədədlərin cəmini hesablayın. (0 daxil edilənə qədər davam etsin.)

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//        int i = 1;
//        int sum = 0;
//        if(num<=0)
//            System.out.println("Invalid number");
//        while (i <= num) {
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);

//        Məsələ 3:
//        Kullanıcıdan bir ədəd alın və bu ədədin daxilindəki rəqəmlərin cəmini tapın.
//        (Məsələn: 567 daxil edilərsə, 5+6+7 = 18 olacaq.)

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        String s = Integer.toString(n);
//        int i = 1;
//        int sum = 0;
//        while (i <= s.length()) {
//            sum = sum + Integer.parseInt(String.valueOf(s.charAt(i -1)));
//            i++;
//        }
//        System.out.println(sum);

//        Məsələ 4:
//        Bir neçə ədəd daxil edin və bu ədədlərin cəmindən sonra onların
//        ortalamasını hesablayan bir proqram yazın. İstifadəçi sıfır daxil edərək prosesi sonlandırsın.

//        Scanner sc = new Scanner(System.in);
//
//        int sum = 0;
//        int counter = 0;
//        System.out.println("Enter a number");
//        while (true) {
//            int n = sc.nextInt();
//            if (n == 0) {
//                break;
//            }
//            sum = sum + n;
//            counter++;
//        }
//        if (counter == 0) {
//            System.out.println("No numbers entered");
//        } else {
//            double avarage = (double) sum / counter;
//            System.out.println(sum);
//            System.out.println(avarage);
//        }


    }
}