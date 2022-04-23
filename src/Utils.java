import java.util.List;

public class Utils {
    public static void showList(List<Product> list){
        list.forEach(c->{
            System.out.println(c.getName());
        });
    }

}
