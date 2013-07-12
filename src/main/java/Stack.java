public class Stack {
    private int size = 0;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public Integer getSize() {
        return size;
    }

    public void push(int element) {
        if(size == capacity)
            throw new Overflow();
        size++;
    }

    public int pop() {
        size--;
        return 0;
    }

    public static Stack make(int capacity) {
        return new Stack(capacity);
    }

    public class Overflow extends RuntimeException {
    }
}
