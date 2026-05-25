package course;

import java.util.Scanner;

class LargestEleArr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array");
    int n = sc.nextInt();
    int[] nums = new int[n];

    System.out.println("Enter the elements in the array");
    for(int i=0;i<n;i++){
      nums[i] = sc.nextInt();
    }
    largestEle(nums);
  }

  static void largestEle(int[] arr){
    int max = arr[0];
    for (int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    System.out.println("THe max number is "+ max);
  }

}
