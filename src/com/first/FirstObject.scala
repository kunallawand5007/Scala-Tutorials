package com.first

object FirstObject extends App {
  
  println("Hello, World!")
  
  var x:Int=0+2;
  
  println(x)
  
  val result =(x1:Int,y1:Int)=>x1+y1
  
  
  
  println(result(10,20)+20)
  
  val k=()=>20;
  
  println("Result:"+k())
  
  val c:Int=90;
  val c1:Int=90; 
  println(c.hashCode()==c1.hashCode())
  
  val fl:Double=899.09;
  
 
  
  }