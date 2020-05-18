package com.kd.chapter1.varl



/**
 * @author klawand
 * 
 * <p> SScala program of readLine() method  </p>
 *
 */
object ReadConsole {
  
  def main(ar:Array[String]){

  val extracted = {
    
    
     Console.println("Enter The Required Values...")

     
     var v1 =scala.io.StdIn.readInt();
     var v2 =scala.io.StdIn.readInt();
     
     Console.println("Result=",v1+v2)
     
  }
}
}