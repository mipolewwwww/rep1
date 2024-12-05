package lab3.fab;

abstract class Creator {
    public abstract Product factoryMethod();

    public void someOperation(String message) {
        Product product = factoryMethod();
        product.car_product(message);
    }
}
