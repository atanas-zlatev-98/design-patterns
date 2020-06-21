package finalHW;

public class In extends Logger {

    public In(){
        this.level = Logger.IN;
    }

    @Override
    protected void writeMsg(String msg) {
        System.out.println("Item sent in country: " + msg);
    }
}