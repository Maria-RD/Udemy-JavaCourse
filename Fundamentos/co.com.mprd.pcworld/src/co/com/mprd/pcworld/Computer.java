package co.com.mprd.pcworld;

public class Computer {
    
    // 1. attribs: private and static
    private int pcId;
    private String name;
    private Peripheral peripherals[];
    private int numPeripherals;
    private static int pcCounter;
    private final static int MAX_PERIPHERALS = 10;
    
    // 2. constructors
    // 2.1. default constructor
    private Computer() {
        this.pcId = ++Computer.pcCounter;
        this.peripherals = new Peripheral[Computer.MAX_PERIPHERALS];
    }
    
    public Computer(String name) {
        this();
        this.name = name;
    }
    
    // 3. getters and setters
    // 3.1. pcId
    public int getPcId() {
        return this.pcId;
    }

    public void setPcId(int pcId) {
        this.pcId = pcId;
    }
    
    // 3.2. name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // 3.3. peripherals
    public Peripheral[] getPeripherals() {
        return this.peripherals;
    }

    public void setPeripherals(Peripheral[] peripherals) {
        this.peripherals = peripherals;
    }
    
    //3.4. addperipheral
    public void addPeripherals(Peripheral peripherals) {
        if (this.numPeripherals<Computer.MAX_PERIPHERALS) {
            this.peripherals[numPeripherals++] = peripherals;
        } else {
            System.out.println("Number of peripherals exceeded: " + Computer.MAX_PERIPHERALS);
        }
    }
    
    // toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer{pcId=").append(pcId);
        sb.append(", name=").append(name);
        //sb.append(", peripherals=").append(peripherals);
        for (int i = 0; i < this.numPeripherals; i++) {
            sb.append(", peripherals=").append(peripherals[i]);
        }
        sb.append('}');
        return sb.toString();
    }
    
}
