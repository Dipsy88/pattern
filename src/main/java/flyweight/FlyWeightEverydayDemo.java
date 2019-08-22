package flyweight;

public class FlyWeightEverydayDemo {

    public static void main(String[] args) {
        Integer firstInt = Integer.valueOf(5);
        Integer secondInt = Integer.valueOf(12);
        Integer thirdInt = Integer.valueOf(5);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));

    }
}
