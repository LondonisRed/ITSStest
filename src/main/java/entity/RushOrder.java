package entity;

public class RushOrder {
    int id;

    String timeInterval;
    String note;
    private static RushOrder instance;

    public static RushOrder getInstance(){
        if (instance == null) {
            instance = new RushOrder();
        }
        return instance;
    }

    public static void setInstance(RushOrder rushOrder) {
        instance = rushOrder;
    }

    public RushOrder() {
        this.id = 0;
        this.note = new String();
        this.timeInterval = new String();
    }

    public RushOrder(int id, String note, String timeInterval) {
        this.id = id;
        this.note = note;
        this.timeInterval = timeInterval;
    }
}
