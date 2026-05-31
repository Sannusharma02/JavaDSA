package course;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,7,10};
        missingNumbers(arr);
    }

//    private static void missingNumbers(int[] arr) {
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]!=arr[i+1]-1){
//                System.out.println(arr[i]+1);
//            }
//        }
//    }

    private static void missingNumbers(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j = arr[i]+1; j < arr[i+1]; j++){
                    System.out.println(j);
            }

        }
    }

}
