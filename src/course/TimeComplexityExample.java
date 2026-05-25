package course;

public class TimeComplexityExample {
    public static void main() {
        print();
    }

    //  O(1)
    static int print() {
        System.out.println("hello");//  O(1)
        int a = 10;//  O(1)
        int b = 20;//  O(1)
        System.out.println("Sum of " + a + b);//  O(1)
        return a + b;//  O(1)
    }

    //  O(n)
    int sumArray(int[] arr) {
        int sum = 0;//  O(1)
        for (int j : arr) {   //  O(n)
            sum += j;//  O(1)
        }
        return sum;
    }

    //  O(n)
    int doubleLoop(int n) {
        for (int i = 0; i < n; i++) //  O(n)
            for (int j = 0; j < 100; j++) { //  O(1)
                // some logic
            }
        return n;
    }

    //  O(1)
    void half(int n) {
        for (int i = 0; i < n/2; i++) { //  O(1)
            System.out.println("value1"); //  O(1)
            System.out.println("value2"); //  O(1)
        }
    }

    //  O(n^2) -> n=m   or  0(n) * O(m) -> n!=m
    void dualNature(int n,int m) {
        for (int i = 0; i < n; i++){
            for (int j = i; j < m; j--) {
                // Code
            }
        }
    }

    //  O(n)
    void halfDoubleLoop(int n) {
        for (int i = 0, j = n; i<j ; i++ ,j--){ //  O(n)
            // some log i c//  O(1)
        }
    }
    //  O(n^2) -> O(n) * O(n)
    void bubbleSort(int[] arr){

        int n = arr.length;
        for(int i = 0; i < n - 1; i++){ //  O(n)
            for(int j = 0; j < n -1 -i; j++){   //  O(n)

                int temp =arr[i];   //  O(1)
                arr[i] = arr[j + 1];    //  O(1)
                arr[j + 1] = temp;  //  O(1)
            }
        }
    }

    // O(n log(n))   -> Masters Theorem
    void mergeSort(int[] arr, int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);   // O(log(n))
            mergeSort(arr, mid+1, high);    // O(log(n))
            merge(arr,low,mid,high);    // O(n)
        }
    }

    private void merge(int[] arr, int low, int mid, int high) {
    }

}