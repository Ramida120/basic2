import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        double a = 5.52;
//        int i;
//        i = (int)a;
//        final float PI = 3.1416f;
//        final  double Latitude, Lontitude;
//        Latitude = 100.1254;
//        Lontitude = 99.1564;
//
//
//        System.out.println("Value\t \"PI\"=" + PI +"\n");
//        System.out.println(Latitude);
//        System.out.println(Lontitude);

//        String s;
//        Scanner scan = new Scanner (System.in);
//        System.out.println("Enter Name:");
//        s = scan.next();
//        System.out.println(s);
        // value (0-1)

//        int dice1 = (int) (Math.random()*6)+1;
//        int dice2 = (int) (Math.random()*6)+1;
//        int dice3 = (int) (Math.random()*6)+1;
//        System.out.println(ลูกที่1: "dece1");
//        System.out.println(ลูกที่2: "dece2");
//        System.out.println(ลูกที่3: "dece3");

//        String s = "15";
//        int d = Integer.parseInt(s);
//        System.out.println("Covert string to int = " +d*2);
//        s = Integer.toString(d);
//        System.out.println("Covert string to String = " +s);
//        System.out.println("Covert string to base 16 ="
//                + Integer.toHexString(10));
//        System.out.println("Covert string to base 8 ="
//                + Integer.toOctalString(10));
//        System.out.println("Covert string to base 2 ="
//                + Integer.toBinaryString(10));

//        String login = "admin";
//        boolean b = login.equals("admin");
//        System.out.println(b);
//        b = !(1>2) && (3>4);
//        System.out.println(b);

//        boolean x;
//        String s1 = "จริง";
//        String s2 = "ไม่จริง";
//        String s3;
//        s3 = (1>5)? true : false;
//        System.out.println(s3);

//        boolean x;
//        x = (1>0)? true : false; // xเป็น true
//        String s = (x%2 == 0) ?"Even":"Odd";

        Scanner scan = new Scanner(System.in);
        int withdraw;
        System.out.println("จำนวนเงินถอน");
        withdraw = scan.nextInt();

        int b1000 = (int)(withdraw/1000);
        int remain = withdraw%1000;

        int b500 = (int)(remain/500);
        remain = remain%500;

        int b100 = (int)(remain/100);

        System.out.println("ธนบัตรที่ได้รับ");
        System.out.println("B1000: " + b1000);
        System.out.println("B500: " + b500);
        System.out.println("B100: " + b100);


//

    }
}
