package support.javaHelpers;

import java.util.Collection;
import java.util.Map;

public class PrintHelpers {
    /***
     * Return a string representation of a Collection,one element per line
     * @param items - a collection instance
     * @return multiline string
     */
    public static String lineByline(Collection<?> items){

        StringBuilder sb = new StringBuilder();

        items.forEach((it) -> sb.append(it.toString()).append("\n"));

        return sb.toString();
    }

    /***
     * Return a string representation of a Map,one element per line in key:value format
     * @param items - a Map instance
     * @return multiline string
     */
    public static String lineByline(Map<?, ?> items){

        StringBuilder sb = new StringBuilder();

        items.forEach(
                (key, val) -> sb
                        .append("\"").append(key.toString()).append("\": ")
                        .append(val.toString())
                        .append("\n")
        );

        return sb.toString();
    }
}
