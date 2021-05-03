package co.com.mprd.pcworld.test;

import co.com.mprd.pcworld.Peripheral;
import co.com.mprd.pcworld.Computer;

public class PCWorld {
    public static void main(String[] args) {
        // 1. setting up peripherals
        // 1.1. monitor
        Peripheral p1 = new Peripheral(false, "Samsung", 0);
        p1.setSize(14.5);
        //p1.setNameDevice(0);
        System.out.println(p1);
        
        // 1.2. second peripheral
        Peripheral p2 = new Peripheral(true, "Chinese", 1);
        System.out.println(p2);
        
        // 1.2. second peripheral
        Peripheral p3 = new Peripheral(true, "J&R", 1);
        System.out.println(p3);
        
        // 2. setting up two omputer
        // 2.1. computer 1
        Computer c1 = new Computer("Asus");
        c1.addPeripherals(p2);
        System.out.println(c1);
        
        // 2.2. computer 2
        Computer c2 = new Computer("AIO2");
        c2.addPeripherals(p1);
        c2.addPeripherals(p2);
        System.out.println(c2);
    }
}
