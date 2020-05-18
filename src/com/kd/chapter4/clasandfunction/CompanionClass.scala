package com.kd.chapter4.clasandfunction

class CompanionClass {

  def main1() {

    println("Object Main-1");
  }

  object CompanionClass {

    def main2() {
      println("Object Main-2")
    }

    def main(str: Array[String]) {
      var ma: CompanionClass = new CompanionClass();

      ma.main1();

    }

  }

}