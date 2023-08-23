public class Client {

    private IProduct product;

    private IProduct Produce(Factory factory) {
        return factory.createProduct();
    }

    public IProduct getProduct() {
        return product;
    }

    public Client(boolean needProductA) {
        if (needProductA)
            product = Produce(new FactoryA());
        else
            product = Produce(new FactoryB());
    }
}
