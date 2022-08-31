public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("TA");
        Auction leilao = new Auction();
        leilao.enterLot("Item raro");
        leilao.makeABid(1, p1, 10000);
    }
}
