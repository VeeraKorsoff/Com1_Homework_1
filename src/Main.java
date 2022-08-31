public class Main {
    public static void main(String[] args) {

        // HW 2
        int a = 5, b = 3;
        if (a == b)
            System.out.println("value of (a+b)^2 = " + ((a + b) * (a + b)));

        else System.out.println("value of a + b = " + (a + b));

        // HW 3.1
        int i = 10;
        while (i <= 37) {
            System.out.println(i);
            i = i + 3;


        // HW 3.2
            i = i + 3;
            int i = 998;
            while (i >= 900) {
                System.out.println(i);
                i = i - 1;

        // HW 3.3
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
                System.out.println(1);
                    }
            else {
                System.out.println(-1);

        // HW 3.4
       int i = 7;
       int b = 1;
       while (b < 21) {
           System.out.println(i);
           System.out.println(i);
           System.out.println(i + 2);
           b++;

       //HW 4
       int t = 18;
       if (t < 17)
           System.out.println("the dealer must hit");
       else if(t <= 21)
           System.out.println("the dealer must stay");
       else
           System.out.println("th dealer must bust");

       // HW 5
           int a = 100, b = 50;
           {if (a>=100 && b <= 50)
               System.out.println(1);
               else
                   System.out.println(0);}

       // HW 6
       int w = 11; {
       int price;
       if (w <= 2) {
           price = 3;
           System.out.println("the price is " + price);
                                }
       else if (w <= 5) {
           price = 3 + 2*(w-2);
           System.out.println("the price is " + price);
                                }
       else {
           price = 9 + 3 * (w - 5);
           System.out.println("the price is " + price);}

       // HW 7
       int n = 0;
       boolean smallest_found = false;
       while (!smallest_found) {
           if ((n * n * n + 91) % 47 == 0) {
               smallest_found = true;
                                    }
           else{
               n++;
                                    }
                                }
       System.out.println(n);

       // HW 8.1
       int a = 7;
       int result = 1;
       for (int i = 0; i < a; i++) {
           result *= 3;
           System.out.println(result);

       // HW 8.2
       int a =3; int b =6; {
       int result = 1;
                                    }
       for(int i=0; i<a; i++) {
           result *= b;
           System.out.println(result);

       // HW 9
        {
            int t = 1;
            int time = 1;
            int highest = 0;
            while (t >= 0 && t <= 100) {
                int diff = t * (t - 20) * (t - 100) + 120000 - (t - 1) * (t - 21) * (t - 101) + 120000;
                if (diff > highest) {
                    highest = diff;
                } else {
                    highest = diff;
                    time = t;}
                t = t + 1;
            }
            System.out.println("time was " + time);
            System.out.println("difference was " + highest);
        }

       // HW 10
       boolean n = false;
       int a = 200;
       int b = 15;

       while (n == false) {

           int r = a % b;
           if (r == 0) {
               n = true;
               System.out.println(b);
                                            }
           else
           {
               a = b;
               b = r;
            }
                                        
