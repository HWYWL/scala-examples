package com.yi.clasz

class Person {
  private val name="校花"
  val age = 18
  def getName=this.name
}

class Student extends Person {
  // 子类可以定义自己的field和method
  private val score = "A"
  //继承加上关键字,覆盖父类
  override
  val age=19

  def getScore=this.score

  // 覆盖父类非抽象方法，必须要使用override关键字
  // 同时调用父类的方法，使用super关键字
  override def getName: String = "你的名字：" + super.getName
}
