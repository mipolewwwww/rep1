package lab3.fab;

abstract class ConcretePorsche extends Creator{
    public Product factorymethod() {
        return new Porsche();
    }
}
