package lab3.fab;

abstract class Creator {
    public abstract Product factoryMethod();

    public String someOperation() {
        Product product = factoryMethod();
        return product.car_product();
    }
}
