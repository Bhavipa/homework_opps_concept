package com.homework_opps_concept;

public class Television extends Entertainment{  //parent class or superclass

    public void turnTvOnOff(){
        System.out.println("Tv is turning on/off ");
    }
    public void changingChannel(){
        System.out.println("Function is working fine");
    }
    public void entertaining(){
        System.out.println("People get entertainment");
    }
    public void electricity(){
        System.out.println("Without electricity tv is not working");
    }
    public void usb(){
        System.out.println("Can connect/use with usb");
    }
    public void screenMirroring(){
        System.out.println("Share screen from phone");
    }

    @Override                      //overriding method with different argument.
    public void screen(){          //call same method with different implementation.
        System.out.println("Television can give Screen time");
    }
    @Override
    public void family(){
        System.out.println("spend some family time with family");
    }
}
