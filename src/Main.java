public class Main {
    public static void main(String[] args) {

        String[] commands = {"Sidet", "Lejat"};

        Shelter shelter = new Shelter("Peace", "Lenina 1");
        Shelter shelter1 = new Shelter("Pets", "Aitmatova 7");

        Dog dog = new Dog("Rex", "Ovcharka", commands,
                ColorEnum.BROWN, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Rex");

        Dog dog1 = new Dog("Han", "Alabai", ColorEnum.WHITE, shelter1);
        System.out.println(dog1.getInfo());
    }
}