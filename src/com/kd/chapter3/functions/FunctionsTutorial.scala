package com.kd.chapter3.functions

object FunctionsTutorial {

  def main(args: Array[String]) {

    func()
    println()
    val result = funcwithparam(12, 12);
    
    println("Result2:"+result)
    
    
    
    
    println("funcType3 result="+funcType3(10,10))
    
  }
  
   // simple functional call
  
  def func() {
    print("First function")
  }
  // function with 2 param without return type

  def funcwithparam(num1:Int,num2:Int){
    num1+num2;
  }
  
  // function with return type
  
  def funcType3(num1:Int,num2:Int):Int={
    num1+num2;
  }
  
}

