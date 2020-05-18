package com.kd.chapter4.clasandfunction

/**
 * @author klawand
 *
 *  1. <p> A Scala program to illustrate the,Initialization of an object </p>
 *  2. <p> Scala program to illustrate how to create an Anonymous object </p> 
 *
 */
class Mobile(model: String, company: String, price: Float) {

  def mobileInfo() {

    println("Model=" + model);
    println("Company=" + company);
    println("Price=" + price);
  }

}
//Main Object
object MobileMain {

  //Main Method
  def main(ard: Array[String]) {

    val mobile = new Mobile("M30S", "Samsung", 15500);

    mobile.mobileInfo();
    
    println("Anonymous Object exmple:");
    
    // Creating Anonymous object ..use when you do not want to reuse it.

     new Mobile("M31S","Samsung",10000).mobileInfo();
     
     Console.println("Calling from Console")
  }

}