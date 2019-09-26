package com.yi.clasz

class Persion3 {}

class Student3 extends Persion3

object Student3 {
  def main(args: Array[String]): Unit = {
    val p: Persion3 = new Student3
    var s: Persion3 = null

    // 如果对象是null，则isInstanceOf一定返回false
    println(s.isInstanceOf[Student3])

    // 判断 p 是否为Student3对象实例
    if (p.isInstanceOf[Student3]) {
      // 把p转换为Student3对象实例
      s = p.asInstanceOf[Student3]
    }

    println(s.isInstanceOf[Student3])
  }
}
