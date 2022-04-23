import java.util.function.Predicate;

public class RemoveLongProductsName implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getName().length()>=3;
    }
}
