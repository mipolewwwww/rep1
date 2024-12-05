package lab4.resp_chain;

public interface Handler {
    void handleRequest(Request request);
    void setNextHandler(Handler nextHandler);
}
