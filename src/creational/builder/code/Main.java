package creational.builder.code;

public class Main {

    public static void main(String[] args) {

        Product product = new Product.Builder()
                .price(14000)
                .name("Phone")
                .category("Electronics")
                .build();

        System.out.println(product);
    }
}
