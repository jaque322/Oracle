public class Product implements Comparable<Product>{
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Product o) {
        return getName().compareTo(o.getName());
    }
}
