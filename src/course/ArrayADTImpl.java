package course;

public class ArrayADTImpl implements ArrayADTInter {

    private int[] array;
    private int size;
    private int index;

    public ArrayADTImpl(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.index = 0;
    }

    @Override
    public void insert(int value) {
        if(index==size){
            System.out.println("Array is full");
            return;
        }
        array[index++]=value;
    }

    @Override
    public void delete(int deleteIndex) {
        if(deleteIndex < 0 || deleteIndex >= index){
            System.out.println("Invalid Index");
            return;
        }

        for(int i = deleteIndex; i < index-1; i++){
            array[i] = array[i+1];
        }
        index--;
    }

    @Override
    public int search(int value) {
        int indexResult =-1;
        for(int i=0;i<index;i++){
            if(array[i]==value){
                indexResult=i;
                break;
            }
        }
        return indexResult;
    }

    @Override
    public int get(int getIndex) {
        if(getIndex < 0 || getIndex >= this.index){
            System.out.println("Invalid Index");
            return -1;
        }
        return array[getIndex];
    }

    @Override
    public void traverse() {
        for(int i=0;i<index;i++){
            System.out.print(array[i]+" ");
        }
    }

    @Override
    public void update(int updateIndex, int value) {
        if(updateIndex < 0 || updateIndex >= this.index){
            System.out.println("Invalid Index");
        }
        array[updateIndex]=value;
    }

    @Override
    public int getSize() {
        return this.index;
    }
}
