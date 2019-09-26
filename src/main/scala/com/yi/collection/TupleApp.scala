package com.yi.collection

/**
 * 元组
 */
object TupleApp {
  def main(args: Array[String]): Unit = {
    val tup = ("Hadoop", 3.1415, 12, Map("NO1" -> "美女"), Array("Hello", "Scala", "Hadoop", "Spark", "Storm"))

    println(tup._1)
    println(tup._4.getOrElse("NO2", "不在映射中"))
    println(tup._5.mkString(","))

    // 拉链操作
    val names = Array("校花", "美女", "女神")
    val scores1 = Array(18, 19, 17)
    val scores2 = Array(18, 19)

    var map1 = names.zip(scores1)

    // 对“校花”数组后面的元素进行填充，填充数据不够使用 18 填充
    var map2 = names.zipAll(scores2, "校花", 18)

    println(map1.mkString)
    println(map2.mkString)
  }
}
