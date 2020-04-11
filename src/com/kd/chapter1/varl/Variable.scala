package com.kd.chapter1.varl

object Variable {

  def main(args: Array[String]) {

    println("Variable demo::!!")

    // Mutable variable
    var num1: Int = 10;
    var num2: Int = 20;
    num2 = 90

    print(num1 + num2)

    print("\n")
    var ty = 10;
    println(ty)

    //Immutable variable

    val num3: Int = 10;

    //it will not work
    //  num3=20;

     findNum(40);
     
     
     diffStyle(12)
  }

/***
   * 
   * <p> Try implmenting FizzBuzz promblem in Scala </p>
   * 
   * 
   */

  def findNum(range: Int) {

    print("User enter given number=" + range)
    //  print(num)
    
    for(p<- 1 to range){
     
      
      if(p%5==0 && p%7==0){
        println("FizzBuzz="+p)
      }else if(p%5==0){
        println("Fizz:"+p)
      }else if(p%7==0){
        println("Buzz:"+p)
      }
      
      
    }

  }
  
  /***
   * <p> Scala If Statement as better alternative of Ternary Operators </p>
   * 
   */
  def diffStyle(num1:Int)=if(num1 >18) println("You are eligible for voting..!")else println("Wait...you are not eligible")
  

}