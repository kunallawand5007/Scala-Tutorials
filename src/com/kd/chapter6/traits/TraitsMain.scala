package com.kd.chapter6.traits

object TraitsMain {
  
  def main(args:Array[String]){
    
    println("Called...!!")
    
    val home=new CreateHome();
    
    
    home.create1BHKFlat
    
    home.createBungalo
    
    home.createApartment;
    
    home.createGarden()
    
    println();
    
    println("Length="+home.length)
    println("Width="+home.width)
  }
  
}