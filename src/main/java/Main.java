public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        int d = calc.multiply.apply(4, 5);
        int e = calc.abs.apply(-6);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(d);
        calc.println.accept(e);

    }
}

@FunctionalInterface
interface Supplier<C> {
    Calculator get();
}