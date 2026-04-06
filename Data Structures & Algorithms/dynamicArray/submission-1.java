class DynamicArray {
    private int[] arr;
    private int length;
    private int capacity;


    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(length == capacity){
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        if(length > 0){
            length--;
        }
        return arr[length];
    }

    private void resize() {
        int[] arr2 = new int[length * 2];
        capacity *= 2;
        for(int i = 0; i < length;i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    public int getSize() {
        return length;
        
    }

    public int getCapacity() {
        return capacity;
    }
}
