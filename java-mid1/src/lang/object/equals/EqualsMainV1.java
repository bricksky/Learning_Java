package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {

        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-200");

        System.out.println("identity = "  + (user1 == user2));
        System.out.println("equality = "  + (user1.equals(user2)));

        /*
        기본으로 제공하는 equals는 결국 동등성으로 비교!
            public boolean equals(Object obj) {
        return (this == obj);
    }

        따라서!!
        동등성 메소드로 사용하고 싶다면, 재정의를 해야한다.
         */
    }
}
