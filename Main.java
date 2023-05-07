import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) throws Exception{
    Scanner scanner = new Scanner(System.in);
    int option;
    int[] arr = null;
    do {
      System.out.print("Enter your option: ");
      try {
        option = scanner.nextInt();
        switch (option) {
          case 1:
            arr = acceptArray(scanner);
            break;
            case 2:
              displayArray(arr);
              break;
              case 3:
                searchArray(arr, scanner);
                break;
                case 4:
                  sortArray(arr);
                  break;
                  case 5:
                    System.out.println("Exiting program...");
                    break;
                    default:
                      System.out.println("Invalid option, please try again.");
        }
      } catch (InputMismatchException e) {
        System.out.println("Invalid option, please try again.");
        scanner.next();
        option = -1;             } catch (Exception e) {
        throw new RuntimeException(e);
      }
    } while (option != 5);     }
  public static int[] acceptArray(Scanner sc) throws Exception{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
      try {
        System.out.print("Element " + i + ": ");
        arr[i] = scanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Invalid input, please try again.");
        scanner.next();
        i--;             } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    System.out.println("Array accepted.");
    return arr;     }
  public static void displayArray(int[] arr) {
    if (arr == null) {
      System.out.println("Array is empty, nothing to display!");
      return;         }
    System.out.print("Elements of the array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");         }
    System.out.println();     }
  public static void searchArray(int[] arr, Scanner sca) throws Exception{
    Scanner scanner = new Scanner(System.in);
    if (arr == null) {
      System.out.println("Array is empty, nothing to search!");
      return;         }
    System.out.print("Enter the element to search: ");
    try {

      int element = scanner.nextInt();
      boolean found = false;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == element) {
          System.out.println("Element found at index " + i);
          found = true;
          break;
        }             }
      if (!found) {
        System.out.println("Element not found in the array.");
      }         throw new Exception("");
    } catch (InputMismatchException e) {
      System.out.println("Invalid input, please try again.");
      scanner.next();         }     }
  public static void sortArray(int[] arr) {
    if (arr == null) {

      System.out.println("Array is empty, nothing to sort!");
      return;         }
    Arrays.sort(arr);
    System.out.println("Array sorted.");     } }