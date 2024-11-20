package nested;

public class SdowingMain {
    public int value = 1;

    class Inner{
        public int value = 2;

        void go(){
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("SdowingMain.value = " + SdowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        SdowingMain main = new SdowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}