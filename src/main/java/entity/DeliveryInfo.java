package entity;

public class DeliveryInfo {
    int id;

    int rushOrderId;

    String name;

    String phoneNumber;

    String email;

    String province;

    String instructions;

    String address;

    Boolean chooseRushOrder;

    private static DeliveryInfo instance;

    public static DeliveryInfo getInstance(){
        if (instance == null) {
            instance = new DeliveryInfo();
        }
        return instance;
    }

    public static void setInstance(DeliveryInfo deliveryInfo) {
        instance = deliveryInfo;
    }

    public DeliveryInfo() {
        this.rushOrderId = -1;
        this.name = new String();
        this.phoneNumber = new String();
        this.email = new String();
        this.province = new String();
        this.instructions = new String();
        this.address = new String();
        this.chooseRushOrder = false;
    }
    public DeliveryInfo(int rushOrderId, String name, String phoneNumber, String email, String province, String instructions, String address, Boolean chooseRushOrder) {
        this.rushOrderId = rushOrderId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.province = province;
        this.instructions = instructions;
        this.address = address;
        this.chooseRushOrder = chooseRushOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRushOrderId() {
        return rushOrderId;
    }

    public void setRushOrderId(int rushOrderId) {
        this.rushOrderId = rushOrderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getChooseRushOrder() {
        return chooseRushOrder;
    }

    public void setChooseRushOrder(Boolean chooseRushOrder) {
        this.chooseRushOrder = chooseRushOrder;
    }
}
