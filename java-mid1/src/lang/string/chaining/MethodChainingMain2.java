package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 = adder.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        System.out.println("result = " + adder);
        System.out.println("result = " + adder1);
        System.out.println("result = " + adder2);
        System.out.println("result = " + adder3);
        /*
        같은 값을 참조하고 있음.
        result = lang.string.chaining.ValueAdder@7291c18f
        result = lang.string.chaining.ValueAdder@7291c18f
        result = lang.string.chaining.ValueAdder@7291c18f
        result = lang.string.chaining.ValueAdder@7291c18f
         */
    }
}
