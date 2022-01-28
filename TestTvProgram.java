package com.homework_opps_concept;

public class TestTvProgram {    //test or run class

  static int plusMethodInt(int value, int size) {     //method overloading
    return value+size;                                //value: is price of tv
  }                                                   //size: is size of tv
  static double plusMethodDouble(double value, double size){
    return value+size;
  }


    public static void main(String[] args) {

     int amount1= plusMethodInt(600,55);
     double amount2=plusMethodDouble(700,65.00);
      {
        System.out.println("int:"+ amount1);
        System.out.println("double:"+amount2);}

      {
        System.out.println("-------------------------");
      }

      Sony sony1=new Sony();  //created object
      sony1.entertaining();
      sony1.electricity();
      sony1.screenMirroring();

      {System.out.println("--------------------");}

      Samsung samsung1=new Samsung();
      samsung1.turnTvOnOff();
      samsung1.changingChannel();
      samsung1.usb();

      {System.out.println("---------------------");}

      Television television1=new Television();
      television1.screen();
      television1.family();

      {System.out.println("---------------------");}

      MobilePhone mobilePhone1=new MobilePhone();
      mobilePhone1.carry();

    }
}
