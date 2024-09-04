package Creational_Patterns.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Client client = new Client();

        Product_1 product_1 = new Product_1();
        product_1.doSomething();
        client.set_its_prototype(product_1);
        Product_1 cloned_product_1 = (Product_1) client.clone_prototype();
        cloned_product_1.doSomething();

        Product_2 product_2 = new Product_2();
        product_2.doSomething();
        client.set_its_prototype(product_2);
        Product_2 cloned_product_2 = (Product_2) client.clone_prototype();
        cloned_product_2.doSomething();
    }
}
