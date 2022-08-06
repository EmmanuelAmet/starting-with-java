import java.util.Locale;

public class Main {
    //Method overloading
    static void computeSum(int a, int b){
        int sum = a + b;
        System.out.println("Sum by int: " + sum);
    }

    static void computeSum(double a, double b){
        double sum = a + b;
        System.out.println("Sum by Double: " + sum);
    }
    //Methods
    static void myMethod(){
        System.out.println("This is my first method in Java");
    }

    static void getName(String fName, String lName, int age){
        System.out.println("My name is: " + fName + " " + lName + " with " + age + " years of age.");
        if(age > 18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }

    static int getAge(int age){
        return age + 10;
    }

    static int sum(int k){
        if(k > 0){
            return k + sum(k-1);
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        computeSum(2,6.3);
        computeSum(2,6);
        myMethod();
        System.out.println("Sum: " + sum(10));

        getName("Emmanuel", "Emma", 20);
        System.out.println("His age is: " + getAge(20));

        System.out.println("Hello world!");
        int number = 22 +7;
        String name = "Emmanuel Emma";
        float price = 12.45f;
        double amount = 30.5;
        boolean isLogin = false;
        char grade = 'A';
        System.out.println("Int: " + number);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Double: " + amount);
        System.out.println("Boolean: " + isLogin);
        System.out.println("Char: " + grade);

        int x, y, z;
        x = y = 10;
        z = 40;
        int sum = x + y + z;
        System.out.println("Sum: " + sum);

        double myDouble = 44.54;
        int myInt = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt);

        //Operator
        int age = 20;
        int myAge = age += 4;
        int ans = 30 % 2;
        System.out.println(myAge);
        System.out.println(ans);

        //Strings
        String alpha = "ASDFGHJKLQWERTYUIOPZXCVBNM";
        String upperCase = alpha.toUpperCase();
        String lowerCase = alpha.toLowerCase();
        int totalLength = alpha.length();
        System.out.println(upperCase + "\n" + lowerCase);
        System.out.println("Length: " + totalLength);

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));
        System.out.println(txt.concat(alpha));

        String asd = "20";
        int club = 30;
        System.out.println(asd+club);
        System.out.println("\\");
        System.out.println("Tab: " + "\t");
        System.out.println("Return Cartridge: " + "\r");
        System.out.println("Backspace: " + "\b");
        System.out.println("Feed: " + "\f");

        // Java Math
        //Maximum
        int max = Math.max(22, -33);
        System.out.println("Maximum: " + max);
        
        //Minimum
        int min = Math.min(234, -35);
        System.out.println("Minimum: " + min);

        //Square root
        double sqrt = Math.sqrt(64);
        System.out.println("Square Root: " + sqrt);

        //Absolute value
        double abs = Math.abs(-3342.42);
        System.out.println("Absolute value: " + abs);

        //Random number
        System.out.println("Random number: " + Math.random());
        int randomNumber = (int) (Math.random() * 101);
        System.out.println("Random: " + randomNumber);

        //Boolean
        int num1 = 10;
        int num2 = 20;
        System.out.println((num1 < num2));

        //If else statement
        int input = 90;
        if(input == 10){
            System.out.println("Good");
        }else if(input < 10){
            System.out.println("Bad");
        } else if (input > 80) {
            System.out.println("Excellent");
        }else {
            System.out.println("Unknown input");
        }

        int mark = -30;
        String result = (mark > 0)? "Mark is a positive integer" : "Mark is a negative integer";
        System.out.println(result);

        //Switch statement
        int day = 43;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }

        //While statement
        int counter = 0;
        while (counter < 5){
            System.out.println("The counter is: " + counter);
            counter++;
        }

        //Do While statement
        int i = 22;
        do{
            System.out.println("The value if i: " + i);
            i++;
        }while (i < 6);

        //For loop
        for(int j = 0; j <= 10; j++){
            System.out.println("The value of j is: " + j);
        }

        //Foreach
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String k : cars){
            System.out.println("Foreach item: " + k);
        }

        //Break and continue
        for(int v = 0; v <= 10; v++){
            if(v == 5)
                break;
            System.out.println("The value of v is:" + v );
        }

        for(int u = 0; u <= 10; u++){
            if(u == 5)
                continue;
            System.out.println("The value of u is:" + u );
        }

        //Array
        int[] marks = {12, 43, 453, 34};
        System.out.println("Mark " + marks[0]);
        for(int c = 0; c < marks.length; c++){
            System.out.println(marks[c]);
        }

        for(int cc = 0; cc < cars.length; cc++){
            System.out.println("Car name is: " + cars[cc]);
        }

        //Multidimensional Array
        int[][] myNumbers = {{2, 4, 6, 8, 10}, {1, 3, 5, 7, 9}};
        for(int a = 0; a < myNumbers.length; a++){
            for(int b = 0; b < myNumbers[a].length; b++){
                System.out.println(myNumbers[a][b]);
            }
        }
    }
}