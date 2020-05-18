package com.kd.chapter7.collections

import scala.collection.immutable.List

/**
 * @author klawand
 *
 * <p> Lists are immutable whereas arrays are mutable in Scala </p>
 * <p> Lists represents a linked list whereas arrays are flat. </p>
 * 
 * <p>
 * 
 * val variable_name: List[type] = List(item1, item2, item3)
 *  or
 *  val variable_name = List(item1, item2, item3)
 *  </p>
 *   
 */
object ListMain {
  
  
   def main (args:Array[String]){
     // with tye
     val city:List[String]=List("AHMEDNAGAR","PUNE","MUMBAI","NASHIK")
     // without type
     val states=List("MAHARASHTRA","UP","MP","GOA")
     
     for(c<-city){
       println(c)
     }
     
     println(city)
     println(states)
     
     
     // reverse the list
     
     println(states.reverse)
     
     // get first elment of list
     println(city.head)
     
     // get tail of list
     println(city.tail) // print list without first elment
     
     //check is list is empty or not
     println(city.isEmpty)
     
     //sort list
     println("Sorted list",city.sorted)
     
     // sort with ascending
     println(city.sortWith(_<_));
     
     // sort with descending
     println(states.sortWith(_.length()>_.length()))
     
     
     
     
   }
}