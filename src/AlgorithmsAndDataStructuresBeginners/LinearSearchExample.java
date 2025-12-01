package AlgorithmsAndDataStructuresBeginners;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] data = {0,1,2,3,4,5,6,7,8,9,10};
        int key = 7;
        System.out.print(linearSearch(data,key));
    }

    public static int linearSearch(int[] data, int key) {
        for (int i = 0; i< data.length; i++){
            if (data[i] == key)
                return  i;
        }
        return -1;
    }
}
