public class Main {
    public static void main(String[] args) {
        Randoms randoms = new Randoms(100, 90);
        //     randoms.forEach(System.out::println);  // print the infinite sequence

        for (int r : randoms) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
