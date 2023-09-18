package p2;

public class Main {

    public static void main(String[] args) {

       Operationable operation;
        operation = (x, y) -> x + y;

        int result = operation.calculate(10,20);

        System.out.println(result);

        operation = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x+y;
            }
        };

        int z = operation.calculate(20, 10);
        System.out.println(z);

        Operationable operation1 = (int x, int y)->x*y;
        Operationable operation2 = (int x, int y)->x-y;


    }

}

interface Operationable{
    int calculate(int x, int y);
}