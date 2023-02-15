//package misael_cuadrado;
////
////public class Main {
////    public static void main(String[] args) {
////        // the program starts executing here
////        System.out.print("Hello world!\n");
////        System.out.print("Hello World");
////    }
////}
//
////
////public class HelloWorld {
////    public static void main(String[] args) {
////        System.out.print("Hello, ");
////        System.out.print("World!");
//    }
////
//
//
//public class Main {
//    public static void main(String[] args) {
//        int myFavoriteNumber = 7;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "This is a string";
//        System.out.println(myString);
//
//        myString = 'C';
//        System.out.println(myString);
//
//        myString = "3.14159";
//        System.out.println(myString);
//
//        long myNumber;
//        //System.out.println(myNumber); //This will not compile as myNumber is not initialized
//
//        //myNumber = 3.14; //This will not compile as 3.14 is a float and myNumber is a long
//        myNumber = 123L;
//        System.out.println(myNumber);
//
//        myNumber = 123;
//        System.out.println(myNumber);
//
//        //The reason 3.14 will not compile is because a long can only store whole numbers, not decimals.
//        //An integer can store whole numbers, so 123 will compile.
//
//        float myFloat = 3.14f; //This will compile, but you need to add 'f' at the end to indicate that it is a float.
//        //Another way to fix it is to change the data type of myNumber to double.
//
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
//        //The first code block outputs 5, 6 because x++ increments the value of x after it is printed.
//        //The second code block outputs 6, 6 because ++x increments the value of x before it is printed.
//
//        //class is a reserved keyword in Java and cannot be used as a variable name.
//
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        //int three = (int) o; //This will not compile as the object o is of type String, not int.
//        //It will give a ClassCastException.
//
//        //The first example is different from the second example as the first example is trying to cast a
//        //String object to an int, which is not possible. The second example is trying to cast a string literal
//        //to an int, which is not possible either. The first example results in a ClassCastException, while
//        //the second example results in a Compile Time Error.
//
//        int x1 = 4;
//        x1 += 5;
//        System.out.println(x1);
//
//        int x2 = 3;
//        int y2 = 4;
//        y2 *= x2;
//        System.out.println(y2);
//
//        int x3 = 10;
//        int y3 = 2;2
//        x3 /= y3;
//        y3 -= x3;
//        System.out.println(x3);
//        System.out.println(y3);
//
//        //If a value is assigned to a numerical variable that is larger than the type can hold,
//        //the value will be truncated to fit within the range of the type.
//        //If a numeric variable is incremented past the type's capacity, it will "wrap around" to the
//        //minimum value for the type. For example, if an int variable is assigned the
