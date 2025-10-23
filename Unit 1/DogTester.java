public class DogTester {
    public static void main(String[] args) {
        Dog c = new Dog("al", "WOL", 5, 123);
        System.out.println(PawesomeUtils.validateDogId(c.getDogId()));
        System.out.println(c.getDogId());
    }
}
