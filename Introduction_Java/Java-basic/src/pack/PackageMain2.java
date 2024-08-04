package pack;

// import를 활용해서 이전의 불필요한 코드를 대체할 수 있음.
//import pack.a.User;
//import pack.a.User2;

// 위의 코드를 대체할 수 있는 하나의 코드!
import pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
    }
}
