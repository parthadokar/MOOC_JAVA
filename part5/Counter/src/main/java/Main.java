public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter1 = new Counter();
        counter.increase();
        counter.increase();

        System.out.println(counter);
        System.out.println(counter1);
        counter1.increase(5);
        System.out.println(counter1);
        counter1.decrease(6);
        System.out.println(counter1);
    }
}
