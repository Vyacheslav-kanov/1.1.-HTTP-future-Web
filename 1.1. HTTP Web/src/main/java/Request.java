public class Request {

    public enum Method{
        GET,POST,PUT,DELETE
    }

    private String method;
    private String messages;
    private String protocolVersion;

    public Request(Method method, String messages) {
        this.method = method.toString();
        this.messages = messages;
        this.protocolVersion = "HTTP/1.1";
    }

    public static Request convert(String request){
        String[] elements = request.split(" ");
        return new Request(Method.valueOf(elements[0]), elements[1]);
    }

    @Override
    public String toString() {
        return method + "\r\n" + messages + "\r\n" + protocolVersion + "\r\n" + "\r\n" + "\r\n";
    }
}
