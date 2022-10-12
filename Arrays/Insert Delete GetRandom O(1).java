class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private Random random;

    public RandomizedSet() { //Initializing the structure
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false; //if val there then false
        map.put(val,list.size()); //add val and index(got by size) in the map
        list.add(val); //add in list
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false; //if val not there then false
        int index = map.get(val); //find index of val to remove
        int lastEle = list.get(list.size() - 1); //find last element in Arraylist to copy that element
        list.set(index, lastEle); //add last element on to that index
        map.put(lastEle, index); //put lastele and index in map
        map.remove(val); // remove the value
        list.remove(list.size() - 1); // remove the element as it is added at the end
        return true;
        
    }
    
    public int getRandom() {
        int index = random.nextInt(list.size()); // this gives random element with everyone having same probability
        return list.get(index); //return that element
    }
}

