package com.yi.clasz

/**
 * 抽象类
 */
object AbstractApp {
  def main(args: Array[String]): Unit = {
    val user = new User {
      override var name: String = "校花"
      override var age: Int = 18

      override def eat(): Unit = println(age + " 岁的 " + name + " 在吃饭!!!")
    }

    user.eat()
  }
}
