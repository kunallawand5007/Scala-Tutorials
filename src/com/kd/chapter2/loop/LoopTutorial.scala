package com.kd.chapter2.loop


/**
 * @author klawand
 *
 */
object LoopTutorial {
  
  def main(name:Array[String]){
    
    println("Hello Welcome ...chapter 2")
    
    
    println("############## using to keyword ###########")
    usingTOkeyword();
    
    println("################# using until keyword ###########")
    usingUntilKeyword();
    }
  
  // scala loop using "to" keyword

   def usingTOkeyword(){
     
     for (p<-1 to 10){
       println(p)
     }
   }
  
   // scala loop using until keyword
   /*
    * <p> The major difference between until and to is, to includes start and end value given in the range(1,10), 
    *    while until excludes last value of the range. So, the below example will print only 1 to 9
    * 
    *  It is helpful to apply until keyword when you are iterating string or array range from 0 to n-1
    * 
    * </p>
    */
   def usingUntilKeyword(){
     
     for(p<-1 until 10){
       println(p)
     }
     
   }
   
}