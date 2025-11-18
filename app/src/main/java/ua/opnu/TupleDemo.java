package ua.opnu;

public class TupleDemo {
    public static void main(String[] args) {

        GenericTwoTuple<String, Integer> person = new GenericTwoTuple<>("Alice", 25);
        System.out.println("TwoTuple: " + person);


        GenericThreeTuple<String, Double, Boolean> product =
                new GenericThreeTuple<>("Laptop", 999.99, true);

        System.out.println("ThreeTuple: " + product);


        System.out.println("Назва товару: " + product.twoTuple.first);
    }
}