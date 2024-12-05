package lab4.resp_chain;

public class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE_B) {
            System.out.println("ConcreteHandlerB handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
