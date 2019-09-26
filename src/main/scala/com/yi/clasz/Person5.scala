package com.yi.clasz

class Persion5 {}

class Student5 extends Persion5

object Student5 {
  def main(args: Array[String]): Unit = {
    val p: Student5 = new Student5

    p match {
      // 匹配是否为Person5类或其子类对象
      case _: Persion5 => println("This id a Person5")
      // 匹配剩余情况
      case _ => println("Unknown type!")
    }
  }
}
