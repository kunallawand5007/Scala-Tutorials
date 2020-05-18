package com.kd.chapter5.innerclass

/**
 * @author klawand
 *
 * <p>Scala program to ill
 * ustrate how to   create an object inside a class, Or  a class inside an object </p>
 *
 */
class University {

  class College {

    def list() {

      for (a <- 1 to 10) {
        Console.println("Inside college:", a);

      }
    }

  }
}

object Uni {

  def main(af: Array[String]) {

    val uni = new University();

    val col = new uni.College();

    col.list();

  }

}