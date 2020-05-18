package com.kd.chapter4.clasandfunction

/**
 * @author klawand
 *
 * <p> Scala classes cannot have static variables or methods.
 *  Instead a Scala class can have what is called a singleton object, or sometime a companion object
 *  </p>
 *
 */
object add {

  def main(st: Array[String]) {

    var p = new User(12, 12);

    println("Add=" + p.add());
    println("Multiple=" + p.multiply())

  }
}