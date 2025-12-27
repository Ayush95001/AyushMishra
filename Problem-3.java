class Main {

    void print(int a) {
        if (a <= 0)
            return;

        int count = (a % 2 == 0) ? a - 1 : a;

        for (int i = 1; i <= count; i++) {
            System.out.print(2 * i - 1);
            if (i < count)
                System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main obj = new Main();

        obj.print(1);
        obj.print(2);
        obj.print(3);
        obj.print(4);
        obj.print(5);
        obj.print(6);
    }
}
