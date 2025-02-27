package nested.local;

import java.lang.reflect.Field;
import java.util.SortedMap;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(final int paramVar){
        int localVar = 1;   // 지역 변수는 스택이 종료되는 순간 함께 제거됨.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }


        LocalPrinter localPrinter = new LocalPrinter();
         //localPrinter.print();
         // 실행하지 않고 Printer 인스턴스만 반환한다.
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer = localOuterV1.process(2);
        // printer.print를 나중에 실행한다.  process()의 스택 프레임이 사라진 이후에 실행.
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field: " + field);
        }
    }
}