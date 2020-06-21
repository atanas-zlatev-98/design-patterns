package finalHW;

public class Main {

    public static void main(String[] args) {

        Logger chain = getChain();
        StartState startState = new StartState();
        StopState stopState = new StopState();
        Context client = new Context("Pesho");

        startState.applyState(client);
        State state = client.getState();
        String currState = state.getStateName();
        System.out.println(currState);
        chain.logMessage(3, "Basket of Tomatoes from Sender: " + client.getName());
        stopState.applyState(client);
        state = client.getState();
        currState = state.getStateName();
        System.out.println(currState);

       
        
        Context client2 = new Context("Gosho");
        
        startState.applyState(client2);
        State state2 = client2.getState();
        String currState2 = state2.getStateName();
        System.out.println(currState2);
        chain.logMessage(2, "Basket of Bananas from Sender: " + client2.getName());
        stopState.applyState(client2);
        state2 = client2.getState();
        currState2 = state2.getStateName();
        System.out.println(currState2);
        
        
        
        Context client3 = new Context("Dimitar");
        
        startState.applyState(client3);
        State state3 = client3.getState();
        String currState3 = state3.getStateName();
        System.out.println(currState3);
        chain.logMessage(1, "Basket of Oranges from Sender: " + client3.getName());
        stopState.applyState(client3);
        state3 = client3.getState();
        currState3 = state3.getStateName();
        System.out.println(currState3);
        
    }

    public static Logger getChain(){
        Logger inLogger = new In();
        Logger outLogger = new Out();
        Logger localLogger = new Local();

        localLogger.setNextLogger(outLogger);
        outLogger.setNextLogger(inLogger);
        return localLogger;
    }

}
