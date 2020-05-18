package com.kd.chapter7.collections

/**
 * @author klawand
 * 
 * 1. <p> Tuple is a collection of elements. Tuples are heterogeneous data structures </p>
 * 2. <p> A tuple is immutable </p>
 *
 */
object TupleMain {
  
  
  def main(args:Array[String]){
    
    Console.println("Tuple Maain");
    
    val tuple=(15,"Scala with Spark",(1,2,3,4,5),true)
    
    //Tuple elements can be accessed using an underscore syntax, method tup._i 
    
    println(tuple._1)
    println(tuple._3.getClass.getCanonicalName)
    
    // Iterating tuple 
    
    tuple.productIterator.foreach(s=>println(s))
    
    // patterna matching program
    Console.println("Pattern Matching Program....!")
    
    val (a,b,c)=(true,"Kunal Lawand",12)
    
    println(a)
    println(b)
    println(c)
  }
  
}