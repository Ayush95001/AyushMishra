class Main {

    void print(int a) {

        if (a <= 0)
            return;

        for (int i = 1; i <= a; i++) {

            System.out.print(2 * i - 1);
            if (i < a)
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
    }
}
