public class TestDog {
    public TestDog(){
        Dog dog1 = new Dog(7, 7.5, "Шарик");
        Dog dog2 = new Dog(6, 5.3);
        Dog dog3 = new Dog(2);
        Dog dog4 = new Dog();
        dog2.SetName("Тузик");
        dog3.SetWeight(6.9);
        dog4.SetAge(5);
        dog4.SetHunger(true);
        System.out.println(dog1.toString());
    }
}
