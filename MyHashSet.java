class MyHashSet {
    ArrayList<Integer> arr;

    public MyHashSet() {
        arr = new ArrayList<>();
    }
    
    public void add(int key) {
        for (int i = 0; i < (int) arr.size(); i++) {
            if (arr.get(i) == key) {
                return;
            }
        }
        arr.add(key);
    }
    
    public void remove(int key) {
        int index = -1;
        for (int i = 0; i < (int) arr.size(); i++) {
            if (arr.get(i) == key) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return;
        }
        arr.remove(index);
    }
    
    public boolean contains(int key) {
        for (int x : arr) {
            if (x == key) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
