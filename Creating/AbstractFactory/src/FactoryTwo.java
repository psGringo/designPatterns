public class FactoryTwo implements IAbstractFactory {
    @Override
    public IProductA createProductA() {
        return new ProductATwo();
    }

    @Override
    public IProductB createProductB() {
        return new ProductBTwo();
    }
}
