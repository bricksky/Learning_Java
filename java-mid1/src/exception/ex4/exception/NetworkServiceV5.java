package exception.ex4.exception;

public class NetworkServiceV5 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); // 추가

        try(NetworkClientV5 clientV5 = new NetworkClientV5(address)) {
            clientV5.initError(data);
            client.connect();
            client.send(data);
        }
        catch(Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}