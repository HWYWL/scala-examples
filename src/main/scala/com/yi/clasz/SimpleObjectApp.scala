package com.yi.clasz

object SimpleObjectApp {
  def main(args: Array[String]): Unit = {
    val people = new People("张三", 18)
    people.eat()

    val people2 = new People
    people2.age = 12
    people2.eat()

    val student = new Student("C语言程序设计", "大一", people)
    var age = student.age
    println(student)
  }
}
