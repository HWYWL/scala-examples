package com.yi.collection

object ArrayApp {
  def main(args: Array[String]): Unit = {
    // 数组声明
    val arr = new Array[String](5)
    arr(1) = "HAHA"
    println(arr.mkString(","))
    println("`````````````````````````````````````````````````````````")

    // 初始化赋值
    val arr2 = Array("Hello", "Scala", "Hadoop", "Spark", "Storm")
    for (elem <- arr2) {
      println(elem)
    }
    println("`````````````````````````````````````````````````````````")

    // 反序输出
    for (elem <- arr2.reverse) {
      println(elem)
    }
    println("`````````````````````````````````````````````````````````")

    // 可变长度数组
    var arr3 = scala.collection.mutable.ArrayBuffer[String]()
    arr3.++=(arr2)
    arr3 += "你好"
    println(arr3.mkString(","))
    println("`````````````````````````````````````````````````````````")
    arr3.remove(2)
    println(arr3.mkString(","))
    println("`````````````````````````````````````````````````````````")
    arr3.trimEnd(4)
    println(arr3.mkString(","))
  }
}
