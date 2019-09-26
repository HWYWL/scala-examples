package com.yi.collection

object ArrayApp {
  def main(args: Array[String]): Unit = {
    // 数组声明
    val arr = new Array[String](5)
    arr(1) = "HAHA"
    println(arr.mkString(","))
    println("**********************************************************")

    // 初始化赋值
    val arr2 = Array("Hello", "Scala", "Hadoop", "Spark", "Storm")
    for (elem <- arr2) {
      println(elem)
    }
    println("**********************************************************")

    // 反序输出
    for (elem <- arr2.reverse) {
      println(elem)
    }
    println("**********************************************************")

    // 可变长度数组
    var arr3 = scala.collection.mutable.ArrayBuffer[String]()
    arr3.++=(arr2)
    arr3 += "你好"
    println(arr3.mkString(","))
    println("**********************************************************")
    arr3.remove(2)
    println(arr3.mkString(","))
    println("**********************************************************")
    arr3.trimEnd(4)
    println(arr3.mkString(","))
    println("**********************************************************")

    // yield关键字将原始的数组进行转换会产生一个新的数组，原始的数组不变
    val arr4 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 将偶数取出乘以10，再生成一个新的数组
    val  res = for(e <- arr4 if e % 2 == 0) yield e * 10
    println(res.mkString(","))
    println("**********************************************************")

    // filter过滤器，接收返回值为booblean的函数
    // map 相当于将数组中的每一个元素取出来，应用传进来的函数
    val resPlus = arr4.filter(_ % 2 == 0).map(_ * 10)
    println(resPlus.mkString(","))
    println("**********************************************************")

    // 数组常用算法
    val arr5 = Array(7, 8, 9, 1, 2, 3, 4, -5, 6)

    // 求和
    println(arr5.sum)
    // 求最大值
    println(arr5.max)
    // 求最小值
    println(arr5.min)
    // 排序
    println(arr5.sorted.mkString(","))
  }
}
