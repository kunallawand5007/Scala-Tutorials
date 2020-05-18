package com.kd.chapter4.clasandfunction

/**
 * @param n1
 * @param n2
 * @param n3
 *
 * 1 <p> A Scala program to illustrate  how to create a class </p>
 * 2 <p> Scala program of Equals </p>
 * 
 */
class Bike {

  var nameofCompany: String = "";
  var cc: Int = 0;
  var nameofBike: String = "";

  def this(n1: String, n2: String, n3: Int) = {
    this();
    this.nameofCompany = n1;
    this.nameofBike = n2;
    this.cc = n3;
  }
  // class Method
  def bikeInfo() {

    println("Name of Bike Company:" + nameofCompany);
    println("Name of Bike:" + nameofBike)
    println("Bike CC:" + cc);

  }
}
object Main {

  // Main Method
  def main(ar: Array[String]) {
    // class object
    var bike = new Bike("Yamaha", "FzsV3", 150);

    bike.bikeInfo();
    
    //Scala program of Equals
    
    var yamaha=new Bike("Yamaha", "FzsV3", 150);
  
     
    println(bike.hashCode());
    println(yamaha.hashCode());
    
    
    
    
    
    
    
  }

}
  
