package co.com.mprd.pcworld;

public class Peripheral {

    // 1. creating attribs: private and static
    private final int deviceId;
    private boolean inputType; // "true" input, "false" output
    private String nameDevice; //added
    private String brand;
    private double size;
    private static int peripheralCounter;
    public final static int MAX_DEVICES = 10;

    // 2. constructors: default and overloaded
    // 2.1. default
    public Peripheral() { // private access modifier dont allow to be initialized
        this.deviceId = ++Peripheral.peripheralCounter;
        //String device[] = {"Monitor", "Keyboard", "Mouse", "Printer"};
        //this.nameDevice2 = new String[Peripheral.MAX_DEVICES];
    }

    // 2.2. overloaded constructor
    public Peripheral(boolean inputType, String brand, int index) {
        this();
        this.inputType = inputType;
        this.brand = brand;
        this.nameDevice = this.addNameDevice(index);
    }

    // 3. methods - getters and setters
    // 3.1.2. nameDevice2
    public String getNameDevice() {
        return this.nameDevice;
    }
    
    public String addNameDevice(int index) {
        String arrayNameDevice[] = {"Monitor", "Keyboard", "Mouse", "Printer"};
        this.nameDevice = arrayNameDevice[index];
        return this.nameDevice;
    }
    
    // 3.2. inputType
    public boolean isInputType() {
        return this.inputType;
    }
    
    public void setInputType(boolean inputType) {
        this.inputType = inputType;
    }

    // 3.3. brand
    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    // 3.4. size
    public double getSize() {
        return this.size;
    }
    
    public void setSize(double size) {
        this.size = size;
    }
    
    // 4. toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Peripheral: {deviceId=").append(this.deviceId);
        sb.append(", inputType=").append(this.inputType);
        sb.append(", nameDevice2=").append(this.nameDevice);
        sb.append(", brand=").append(this.brand);
        sb.append(", size=").append(this.size).append("}");
        return sb.toString();
    }
}
