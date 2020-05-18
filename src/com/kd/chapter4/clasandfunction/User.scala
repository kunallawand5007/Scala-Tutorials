package com.kd.chapter4.clasandfunction



/**
 * @author klawand
 *
 * <p> 
 * 
 *  1.A Scala class is a template for Scala objects
 * 
 *  class Class_name{ 
   // methods and feilds
   }
 * 
 */
class User(num1: Int, num2: Int) {
  
  var myField=0;

  def add(): Int = {
    num1 + num2;
  }

  def multiply(): Int = {
    num1 * num2;
  }
}