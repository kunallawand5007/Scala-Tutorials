package com.kd.chapter7.collections

object ReduceFoldScanMain {

  def main(args: Array[String]) {

    // Reduce function is applied on collection data structure in scala that contains lists, sets, maps, sequence and tuples
    // Parameter in the reduce function is a binary operation which merges all the elements from the collection and returns a single value
    val list = List(1, 2, 3, 4, 5, 6, 7)

    println(s"List:$list")

    val sum: Double = list.reduce((a1, a2) => a1 + a2)

    println(s"Sum=$sum")

    val multi: Int = list.reduce((a, b) => a * b)

    println(s"Multi=$multi")
    
    val max=list.reduce(_ max _)

    println(s"Max=$max")
    
    val min=list.reduce(_ min _)
 
    println(s"Min=$min")
    
    // fold 
    
    
   // The difference is that fold allows us to define an initial value
   // If the collection is empty, the value initialized becomes the final answer 
    
    val p1=list.fold(0)((a,b)=>a+b)
  
    println(s"P1=$p1")
    
    val strList:List[String]=List("w","lawand","pune","nagar","vishal","Rahul")
    
    val p2=strList.reduce((a,b)=>a+"-"+b)
    
    println(p2)
    
    
    //1
    //val p3= strList.sorted
     
    
    //2
    val p4 =strList.sortWith(_ .length >_ .length)
    println(p4)
    
   
    
  }
}