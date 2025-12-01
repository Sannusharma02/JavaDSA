package AlgorithmsAndDataStructuresBeginners;

public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] data = {0,1,2,3,4,5,6,7,8,9,10};
        int key = 7;
        System.out.print(binarySearch(data,key,0,data.length-1));
    }

    public static int binarySearch(int[] input,int target, int start, int end){
        if(start>=end){
            return -1;
        } else {
            int mid = start + (end - start)/2;
            if (input[mid] == target){
                return mid;
            } else if (input[mid] > target){
                return binarySearch(input,target, start, mid-1);
            } else if (input[mid] < target){
                return binarySearch(input,target, mid+1, end);
            }else {
                return  mid;
            }
        }
    }
}
