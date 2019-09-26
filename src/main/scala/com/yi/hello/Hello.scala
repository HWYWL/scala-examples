package com.yi.hello

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")

    // 使用val定义的变量值是不可变的，相当于Java里面final修饰的变量
    val i = 1

    //使用var定义的变量是可变的，在Scala中鼓励使用val
    var s = "Hello Scala"

    // Scala编译器会自动推断变量的类型，必要的时候可以指定类型
    val str: String = "Hello Spark"

    lump()
  }

  def lump (): Unit ={
    val a = 10
    val b = 20

    // 块表达式
    val result = {
      a + b
    }

    println(result)
  }
}
