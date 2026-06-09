public class Move0ToLast{
    public static void main(String[] args){
        int arr[] = {1,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9,0,10,0};//,0,11
        move0ToLast(arr);
      for(int n:arr){
         System.out.print(n+" ");
      }
    }

    static void move0ToLast(int[] arr){
        int len=arr.length;
      for(int i=0;i<len;i++){ 
        if(arr[i]==0 ){
        while(len>i && arr[len-1]==0){
          len--;
        }
        if(len>i ){
          int temp = arr[len-1];
          arr[len-1]=arr[i];
          arr[i]=temp;
          len--;
        }
        }
      }
    }
  
}