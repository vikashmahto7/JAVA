public class Multiplication {
    public static void main(String[] arg)
    {
        int x=10;
        int y=5;
        System.out.println("Multiplication of " + x +" and " + y + " is "+ (x*y));

         //data conversion --> lower to higher
        byte b = 10;
        int i = b; // implicit type casting
        System.out.println("The value of i is: " + i);

        //type casting --> higher to lower
        int x = 100;// If value of x is greater than 127, then value of y will become x%256
        byte y = (byte) x; // explicit type casting
        System.out.println("The value of y is: " + y);
    }
}

