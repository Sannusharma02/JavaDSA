import java.util.Scanner;
public class CountTargetArray {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array");
      int size = sc.nextInt();

      int arr[] = new int[size];
      System.out.println("Enter the elements of array");
      for (int i = 0; i < size; i++)
        arr[i] = sc.nextInt();

      System.out.println("Enter the target element");
      int target = sc.nextInt();

      int count = countTargetElement(arr, target);
      System.out.println("The target element " + target + " appears " + count + " time(s) in the array");
    }

    public static int countTargetElement(int[] arr, int target){
      int count = 0;
      for (int i = 0; i < arr.length; i++){
        if (arr[i] == target)
          count++;
      }
      return count;
    }
}
