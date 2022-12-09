package Computer;


public class TestComputer {
    public TestComputer(){
        Shop shop = new Shop();
        Computer comp = new Computer("p1", "p2", "p3");
        shop.add(comp);
        shop.find(1);
    }
}
