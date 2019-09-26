package com.yi.clasz

// 伴生类
class Dao {
  val id = 1
  private var name = "旺财"

  def printName(): Unit = {
    // 在Dao类中可以访问伴生类对象的的私有属性
    println(Dao.COUSTANT + name)
  }
}

// 伴生对象
object Dao {
  // 伴生对象中的私有属性
  private val COUSTANT = "汪汪汪。。。"
  def main(args: Array[String]): Unit = {
    val p = new Dao

    // 访问伴生类的私有属性
    p.name = "大旺财"
    p.printName()
  }
}
