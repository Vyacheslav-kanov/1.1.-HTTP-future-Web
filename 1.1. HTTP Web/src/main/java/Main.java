import java.io.DataOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Server server = new Server();
        server.start();

        server.addHandler("GET", "/messages", new Handler() {
            @Override
            public void handle(Request request, DataOutputStream out) {
                try {
                    System.out.println("3");
                    out.writeUTF("HTTP/1.1 102 OK" + "\r\n" + "\r\n" + "\r\n" + "\r\n");
                    out.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("handler Created!"); //!!!
    }
}
