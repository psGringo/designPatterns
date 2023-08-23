public class Main {
    public static void main(String[] args) {
        boolean isNeedProduceProductA = true;
        Client client = new Client(isNeedProduceProductA);
        client.getProduct().doStuff();
    }
}

