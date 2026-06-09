package course;

public class ArrayOperation {

    public static void main(String[] args) {
        ArrayADTImpl adt = new ArrayADTImpl(10);

        adt.insert(20);
        adt.insert(30);
        adt.insert(40);
        adt.insert(50);
        adt.insert(60);

        System.out.println("Array Size : " + adt.getSize());

        adt.traverse();
        adt.update(1,25);

        System.out.println("\nIndex Searched Array: "+adt.search(25));
    }
}
