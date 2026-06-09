package course;

public interface ArrayADTInter {
    void insert(int value);

    void delete(int deleteIndex);

    int search(int value);

    int get(int getIndex);

    void traverse();

    void update(int updateIndex, int value);

    int getSize();
}
