import java.util.LinkedHashMap;

public final class SessionDataStore {

    private static final LinkedHashMap<String,Object> store;

    public static final SessionDataStore INSTANCE;

    //static block to intialize final instance variables
    static {
        SessionDataStore dataStore = new SessionDataStore();

        INSTANCE = dataStore;
        store = new LinkedHashMap<>();
    }

    //constructor
    private SessionDataStore(){}

    public static final void addData(String key,Object data){
        store.put(key,data);
    }

    public static final Object fetchData(String key){
        if(store.keySet().contains(key)){
            return store.get(key);
        }else {
            throw new IndexOutOfBoundsException("Non existent key: "+key);
        }

    }


}
