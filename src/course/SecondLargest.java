`public class SecondLargest{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 9,8,17,30,41,19,16,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40};
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest element is: " + secondLargest);
    }
  public static int findSecondLargest(int[] arr){
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for(int num : arr){
      if(num>largest){
        secondLargest = largest;
        largest = num;
      } else if(num>secondLargest && num != largest){
         secondLargest = num;
      }
    }return secondLargest;
  }
}