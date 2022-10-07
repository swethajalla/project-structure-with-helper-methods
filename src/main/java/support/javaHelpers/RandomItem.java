package support.javaHelpers;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public final class RandomItem {

    public static final RandomItem INSTANCE;

    public static final Object from(List items){
        if(items.isEmpty()){
            throw(new IndexOutOfBoundsException("Empty list received as a parameter"));
        }else {
            int itemIdx= ThreadLocalRandom.current().nextInt(items.size());
            return items.get(itemIdx);
        }
    }

    private RandomItem(){}

    static {
        RandomItem var0=new RandomItem();
       INSTANCE = var0;

        }
    }


