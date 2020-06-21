package finalHW;

public class Out extends Logger {
    public Out() {
        this.level = Logger.OUT;
    }

    @Override
    protected void writeMsg(String msg) {
        System.out.println("Item sent out of country: " + msg);
    }
}
