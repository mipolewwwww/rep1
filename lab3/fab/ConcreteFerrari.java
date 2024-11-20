package lab3.fab;

abstract class ConcreteFerrari extends Creator {
    public Product factorymethod(){
        return new Ferrari();
    }
}
