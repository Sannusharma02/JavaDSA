class LargestEleArr {
  public static void main(String[] args) {
    int nums[] = {1,2,3,4,5};
    largestEle(nums);
  }

  static void largestEle(int[] arr){
    int max = arr[0];
    for (int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    System.out.println(max);
  }

}
