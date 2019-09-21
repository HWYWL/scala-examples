package com.yi.casez

object CaseClassApp {
  def main(args: Array[String]): Unit = {
    println(Dog("旺财").name)
  }
}

/**
 * case 声明的类不需要new就可以得到对象
 * @param name
 */
case class Dog(name:String){

}
