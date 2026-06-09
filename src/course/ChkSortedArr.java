public  class ChkSortedArr{
    public static void main(String[] args){
        int[] arrasc = {1,2,3,4,5,6,7,8,9,10};
        int[] arrdesc = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(chkSortedArr(arrdesc));
    }

  static boolean chkSortedArr(int[] arr){
    boolean asc =true;
    boolean desc = true;
    
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]>arr[i+1])
        asc = false;
      if (arr[i+1]>arr[i])
        desc = false;
    }
    
  return desc || asc;
  }
  
}