import java.util.*;


public class CollectionsClass {
    public static void main(String[] args) {

        Product p2 = new Drink("tea");
        Product p1 = new Food("cake");
        List<Product> menu = new ArrayList<>();
        Product p3 = null;
        Set<Product> set1 = new HashSet<>();
        Product[] a = new Product[2];
        set1.add(p1);
        set1.add(p2);
        List<Product> list1 = new ArrayList<>();
        List<Product> list2 = new ArrayList<>(20);
        List<Product> list3 = new ArrayList<>(set1);
        List<Product> list4 = Arrays.asList(a);
        List<Product> list5 = List.of(p1);
//        System.out.println(list4.size());
//        System.out.println(list5.size());
//second part
        menu.add(p1);
        menu.add(p2);
        menu.add(2, null);
        menu.add(3, p1);
        menu.add(2, p1);
        menu.set(0, p2);
        menu.add(4, null);
        int index = menu.indexOf(p2);

//        System.out.println("position 1 "+menu.get(0));
//        System.out.println("position 2 "+menu.get(2));
//Deque

        Product dp1 = new Food("Cake");
        Product dp2 = new Food("Tea");
        Product dp3 = new Food("Cookie");

        Deque<Product> dmenu = new ArrayDeque<>();
        Product nullProduct = dmenu.pollFirst();
        System.out.println("null product  " + nullProduct);
        dmenu.offerFirst(dp1);
        dmenu.offerLast(new Product("jansel"));
        dmenu.offerFirst(dp2);
        Product tea = dmenu.pollFirst();
        Product cake1 = dmenu.pollFirst();
        dmenu.offerLast(dp3);
        dmenu.offerLast(dp1);

//        maps
        Product mp1 = new Product("Cake");
        Product mp2 = new Product("Tea");
        Map<Product, Integer> items = new HashMap<>();
        items.put(mp1, Integer.valueOf(2));
        items.put(mp2, Integer.valueOf(2));
        Integer n1 = items.put(mp1, Integer.valueOf(5));
        Integer n2 = items.remove(mp1);
        boolean hasTea = items.containsKey(mp2);
        boolean hasTwo = items.containsValue(Integer.valueOf(2));
        Integer quantity = items.get(mp2);
        System.out.println("valor devuelto map " + quantity);
        Iterator<Product> iterator = dmenu.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
//****************************************************Other collection behavior*************************************
        //forma 1
        List<Product> omenu = new ArrayList<>();
        omenu.add(new Food("Cake"));
        omenu.add(new Drink("Tea"));
        omenu.add(new Food("Cookie"));
        omenu.add(new Food("Ania"));
//        Product[] arrray = new Product[2];
//        arrray = omenu.toArray(arrray);
//        System.out.println("array dimension "+arrray.length);
//        omenu.removeIf(new RemoveLongProductsName());
//        System.out.println("dimension despues de usar predicate should be 1 "+omenu.size());

        //*******************************************************Collection Clases *****************************************
        //de la forma 1 si agregas omnu no funciona
        System.out.println("sorted Elements");
        Collections.sort(omenu);
        Utils.showList(omenu);
        System.out.println("reversed elements");
        Collections.reverse(omenu);
        Utils.showList(omenu);
        System.out.println("Shuffle Elements");
        Collections.shuffle(omenu);
        Utils.showList(omenu);
        System.out.println("Fill Collection");
        Collections.fill(omenu,new Product("jansel"));
        Utils.showList(omenu);
    }


}
