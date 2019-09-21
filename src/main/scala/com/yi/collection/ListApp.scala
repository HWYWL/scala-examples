package com.yi.collection

object ListApp {
  def main(args: Array[String]): Unit = {
    val list1 = List("Hello", "Scala", "Hadoop")
    println(list1)

    val list2 = "Spark" :: "Storm" :: "Kylin" :: "Scala" :: Nil
    println(list2)

    val list3 = scala.collection.mutable.ListBuffer[String]()
    // 判断list是否为空
    if (list3.isEmpty){
      println("我是空")
    }

    list3 ++= list1
    list3 += "Hadoop"
    println(list3 + " 长度：" + list3.size)
  }
}
