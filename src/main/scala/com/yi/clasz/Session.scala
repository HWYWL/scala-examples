package com.yi.clasz

class Session {}

object SessionFactory{
  //该部分相当于java中的静态块
  val session = new Session()

  //在object中的方法相当于java中的静态方法
  def getSession(): Session ={
    session
  }
}

object SessionDemo{
  def main(args: Array[String]): Unit = {
    //单例对象，不需要new，用【单例对象名称.方法】调用对象中的方法
    val session1 = SessionFactory.getSession()
    val session2 = SessionFactory.getSession()

    println(session1)
    println(session2)
  }
}
