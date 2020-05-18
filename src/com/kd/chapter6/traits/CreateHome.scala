package com.kd.chapter6.traits

class CreateHome extends Home {
  def create1BHKFlat(): Unit = {
    println("Creating 1 BHK Apartment....of COST 35LAC");
  }

  def createBungalo(): Unit = {
    Console.println("Creating 2 BHK Flat...of Cost 45 LAC")
  }

  def createApartment: Unit = {
    println("Creating Apratment...");
  }

  var length: Int = 100;
  
  override val width=200;
}