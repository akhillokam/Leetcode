class OrderedStream {
    int ptr = 0;
    String[] strs;
    public OrderedStream(int n) {
        strs = new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList();
        strs[idKey - 1] = value; //since idkey starts from 1 and we need 0th place value
        while(ptr < strs.length && strs[ptr]!=null){
            list.add(strs[ptr]);
            ptr++;
        }
        return list;
    }
}