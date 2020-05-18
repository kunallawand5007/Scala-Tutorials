package com.kd.chapter6.traits

object TraitMain1 {
  
  
  def main(p:Array[String]){
    
     val fur=new MultipleTrait();
     
     fur.createSofa()
     
     val home=new CreateHome();
     
     home.createApartment;
     
     
  }
}