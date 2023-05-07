//1.
// public class main {
//    public static void main(String[] args) {
//        try {
//
//        }catch (Exception e){
//
//        System.out.println(e.getMessage());
//    }
//        System.out.println("Hello world!");
//    }
//}

//2.
//public class main {
//    public static void main(String[] args) {
//        String combinedString = null;
//        try {
//        }catch (Exception e){
//            String string1 = "Hello ";
//            String string2 = "World!";
//
//            System.out.println((String)null);
//        }
//    }
//    public static String combineStrings(String string1, String string2){
//        return string1 + string2;
//
//}}

//3.
//public class main {
//    public static void main(String[] args) throws Exception {
//        int num1 = 25;
//        int num2 = 10;
//        int num3 = 30;
//        int result = findGreatestNumber(num1, num2, num3);
//        try {
//
//        System.out.println("The greatest number is: " + result);
//        }catch (Exception e){
//            System.out.println("The greatest number is:"  + result);
//        }
//    }
//    public static <greatestNumber> int findGreatestNumber(int num1, int num2, int num3)throws Exception {
//        int greatestNumber;
//        if (num1 >= num2 && num1 >= num3) {
//            throw new Exception(String.valueOf(num1));
//        } else if (num2 >= num1 && num2 >= num3) {
//            greatestNumber = num2;
//
//        } else {
//            greatestNumber = num3;
//        }
//        return greatestNumber;
//    }}

//4.
public class main {
    public static void main(String[] args)throws Exception {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum = findSum(num1, num2, num3);
        double average = findAverage(num1, num2, num3);
        try {
            throw new Exception("  ");
        }catch (Exception e) {
            System.out.println("The sum is: " + sum);
        }finally {
            System.out.println("The average is: " + average);
        }
    }

    public static int findSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;}


    public static double findAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}


//5.
//
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) throws Exception {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        double num1 = input.nextDouble();
//        System.out.print("Enter the second number: ");
//        double num2 = input.nextDouble();
//        System.out.print("Enter the operation (+, -, , /): ");
//        char operation = input.next().charAt(0);
//        double result = calculate(num1, num2, operation);
//        try {
//
//        }catch (Exception e){e.getMessage();
//        }
//
//        System.out.println("The result is: " + result);
//    }
//
//    public static double calculate(double num1, double num2, char operation)throws Exception {
//        double result = 0;
//        switch (operation) {
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                try {
//
//                } catch (Exception e) {
//                    throw new RuntimeException(e);
//                }
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + operation);}
//        return result;
//    }}


//<<Challenge>>
//Challenge 1:

//public class main {
//     public static void main(String[] args)throws Exception {
//         try {
//
//
//          int [] numbers = {1, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 9};
//          printUniqueNumbers(numbers);   } catch (Exception e) {
//             throw new RuntimeException(e);
//         }
//     }
//     public static void printUniqueNumbers(int[] arr) throws Exception{
//          for(int i = 0; i < arr.length; i++) {
//               boolean isUnique = true;
//               for(int j = 0; j < arr.length; j++) {
//                    if(i != j && arr[i] == arr[j]) {
//                        isUnique = false;
//                         break;         }       }
//               try {
//
//               } catch (Exception e) {
//
//               if(isUnique) {
//        System.out.print( arr[i]+ " ");
//}     }   } }}

//Challenge 2:

//public class main {
//    public static int countVowels(String str) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            switch (str.toLowerCase().charAt(i)) {
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                    count++;
//                    break;
//            }       }
//        return count;    }
//    public static void main(String[] args) {
//        String str = "A programmer does not reinvent the wheel";
//        int vowels = countVowels(str);
//        try {
//
//        }catch (Exception e){
//        System.out.println("Total vowels: " + vowels);
//        }finally {
//            System.out.println("Total vowels: " + vowels);
//        }
//    }}

//Challenge 3:

//public class main {
//    public static void splitAndPrint(String input) {
//        String[] words = input.split(" ");
//        for (String word : words) {
//                System.out.println(word);
//            }
//        }
//
//
//    public static void main(String[] args) throws Exception{
//try {
//
//}catch (Exception e){
//             String input = "Hello, world! This is a test.";
//    }
//}}





