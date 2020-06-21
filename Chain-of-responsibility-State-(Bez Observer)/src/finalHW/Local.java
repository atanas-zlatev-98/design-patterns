package finalHW;

public class Local extends Logger {
    public Local(){
        this.level = Logger.LOCAL;
    }

    @Override
    protected void writeMsg(String msg) {
        System.out.println("Item sent in Local city: " + msg);
    }
}