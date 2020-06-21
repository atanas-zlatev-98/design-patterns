package finalHW;

public abstract class Logger {
	public static final int IN = 1;
    public static final int OUT = 2;
    public static final int LOCAL = 3;

    protected int level;

    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String msg){
        if (this.level <= level){
            this.writeMsg(msg);
        }else if (this.nextLogger != null) {
            this.nextLogger.logMessage(level, msg);
        }
    }

    protected abstract void writeMsg(String msg);
}
