package patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();

        System.out.println(firstSingleton == secondSingleton);
        
        SingletonEnum firstSingletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum secondSingletonEnum = SingletonEnum.INSTANCE;

        System.out.println(firstSingletonEnum == secondSingletonEnum);
    }
}
