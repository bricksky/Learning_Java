class VarEx1 {
    public static void main(String[] args) {
        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

        year = age + 2000; // 변수 age의 값에 2000을 더해 변수 year에 저장한다.
        age = age + 1; // 변수 age에 저장된 값에 1을 더한다.

        System.out.println(year);
        System.out.println(age);
    }
}

/*
 * 1. 글자를 출력하려면 println을 사용한다.
 * 2. 변수에 저장된 값을 사용하려면 변수의 이름만 적으면 된다.
 * 3. 두 변수간의 값을 교환하기 위해서는 새로운 임시 저장소인 tmp 변수를 활용하면 된다.
 */