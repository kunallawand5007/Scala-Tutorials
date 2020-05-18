package com.kd.chapter6.traits

/**
 * @author klawand
 *
 *
 * <p> If we extend a trait first and then the abstract class then the compiler will throw an error,
 *     as that is not the correct order of trait Mixins. </p>
 *
 *  <p> We can extend several number of scala traits with a class or
 *  an abstract class that is known to be trait Mixins </p>
 */
class MultipleTrait extends Home with Furniture {
  def createSofa(): Unit = {
    println("Create sofa with...Laminate");
  }

  def createApartment: Unit = {
    println("Create Apartment..!!");
  }

  def create1BHKFlat(): Unit = {
    println("Create 1BHK Flat..!!");
  }

  var length: Int = 1233

  def createBungalo(): Unit = {
    println("Create Bungalo..!!");
  }
}