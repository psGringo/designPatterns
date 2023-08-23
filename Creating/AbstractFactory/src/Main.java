public class Main {
    public static void main(String[] args) {
        boolean isFabricOne = true;
        Client client = new Client(isFabricOne);
        client.getProductA().doStuff();
        client.getProductB().doStuff();
    }
}

