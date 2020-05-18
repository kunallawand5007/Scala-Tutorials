package com.kd.chapter6.traits


/**
 * @author klawand
 *
 * 1 .<p> Traits are like interfaces in Java</p>
 * 2 .<p> Traits can have methods(both abstract and non-abstract), and fields as its members </p>
 */
trait Home {
  
  def create1BHKFlat();
  def createBungalo();
  
  def createApartment
  
  def createGarden(){
    
    Console.print("Garden is by default..available")
  }
  
  
  // abstract fields are those fields with containing initial value
  //concrete fields are those fields which contain the initial value
  
  var length:Int;
  val width:Int=200;
  
}