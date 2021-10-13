package datatypes;

import java.util.ArrayList;
import java.util.Arrays;

public class LearnDataTypes {

    public static void main(String[] args) {

        /**
         *      * Data Types *
         *
         *      A variable MUST be a specified data type
         *
         *      Primitive data types
         *      Non-primitive data types        **/

        //Primitive Data Types - total of 8
        System.out.println(returnAByte());
        System.out.println(returnAShort());
        System.out.println(returnAnInt());
        System.out.println(returnALong());
        System.out.println(returnAFloat());
        System.out.println(returnADouble());
        System.out.println(returnABoolean());
        System.out.println(returnAChar());

        //Non-Primitive Data Types - created and are not predefined. Referred to
        //as objects, can be assigned to null, must start with an uppercase letter ex. 'String, Arrays, Classes'
        System.out.println(returnAString());

        Integer[] arrayOfIntegers = {1,2,3,4,5};
        System.out.println(returnAnIntegerArray(arrayOfIntegers));

        Double aDouble = 2.0;
        //double nulldouble = null;
        Double nullDouble = null;
        System.out.println("Double: " + aDouble);
        System.out.println("Non-primitives can be " + nullDouble);

        //references the address of the memory location where the object is stored (heap)
        LearnDataTypes aReferenceVariable = new LearnDataTypes(); // object/instance/reference of a class
        System.out.println("Reference variable address: " + aReferenceVariable);

        //Cow reference variables/objects
        Cow cow1 = new Cow("Cow #1", 9);
        Cow cow2 = new Cow("Cow #2", 11);
        Cow cow3 = new Cow("Cow #3", 7);

        //ArrayList - a resizable array, dynamic
        //ArrayList of Cows
        ArrayList<Cow> cows = new ArrayList<>();
        cows.add(cow1);
        cows.add(cow2);
        cows.add(cow3);

        System.out.println(" ");
        System.out.print("Memory address of each Cow in the ArrayList: ");
        System.out.println(cows); //will only output where the objects are located in memory
        cows.forEach( (cow -> System.out.println("Name: " + cow.getName() + ": Age " + cow.getAge())) );
        cow1.animalSound(); //returns void (nothing)
        cow1.getAge(); //returns an int
        cow1.getName(); //returns a String
    }


    public static byte returnAByte(){
        byte byteSize = 127; //Stores whole numbers from -128 to 127
        return byteSize;
    }

    public static short returnAShort(){
        short shortNum = 32767; //Stores whole numbers from -32,768 to 32,767
        return shortNum;
    }

    public static int returnAnInt(){
        int num = 5; //Stores whole numbers from -2,147,483,648 to 2,147,483,647
        return num;
    }

    public static long returnALong(){
        long longNum = 99999999; //Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        return longNum;
    }

    public static float returnAFloat(){
        float floatNum = 5.99f; //  Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        return floatNum;
    }

    public static double returnADouble(){
        double doubleNum = 2.0;  //Stores fractional numbers. Sufficient for storing 15 decimal digits
        return doubleNum;
    }

    public static boolean returnABoolean(){
        boolean isABooleanType = true; //Stores true or false values
        return isABooleanType;
    }

    public static char returnAChar(){
        char letter = 'S';
        return letter;
    }

    public static String returnAString(){
        String someText = "Wello Horld";
        return someText;
    }

    public static Integer[] returnAnIntegerArray(Integer[] array){
        System.out.println("Array address location: " + array);
        for (Integer integer : array) {
            System.out.print("Integer: " + integer +"\n");
        }
        return array;
    }

}
