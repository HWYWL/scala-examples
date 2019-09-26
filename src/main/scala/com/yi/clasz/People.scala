package com.yi.clasz

class People() {
  // 定义属性 _ 是占位符
  var name: String = _
  var age: Int = _


  // 附属构造器
  def this(name: String, age: Int){
    // 第一步必须调用主构造器
    this()

    // 执行附属构造器
    this.age = age
    this.name = name
  }

  // 定义方法

  def eat(): Unit ={
    println(age + " 岁的 " + name + " 在吃饭！！！")
  }
}

object People{
  def main(args: Array[String]): Unit = {
    val people = new People("张三", 18)
    people.eat()
  }
}
