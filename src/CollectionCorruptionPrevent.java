import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionCorruptionPrevent {
    Map<Product, Integer> map = new HashMap<>();
    Set<Product> set = new TreeSet<>();
    Map<Product, Integer> syncMap = Collections.synchronizedMap(map);
    Set<Product> readOnlySet = Collections.unmodifiableSet(set);
    List<Product> copyOnWriteList = new CopyOnWriteArrayList<>();
}
