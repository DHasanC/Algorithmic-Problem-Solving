class LRUCache {
    LinkedHashMap<Integer, Integer> map;
    int CAPACITY;
    //Map<Integer, Integer> map;
    public LRUCache(int capacity) {
        map = new LinkedHashMap<>();
        CAPACITY = capacity;
    }
    
    public int get(int key) {
        
        //for(int i : map.keySet()){
            if(map.containsKey(key)) {
                int val = map.get(key);
                map.remove(key);
                map.put(key, val);
                return val;
            }
            return -1;
        
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)) {
        map.remove(key);
    }else if(map.size() == CAPACITY) {
        map.remove(map.keySet().iterator().next());
    }
    map.put(key, value);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
