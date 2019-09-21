package com.yi.pattern

import scala.util.Random

object MatchApp {
  def main(args: Array[String]): Unit = {
    easyMatch()
    easyMatch1("御姐")
    easyMatch1("小萝莉")
    println("````````````````````````````````")

    easyMatchArray(Array("美女"))
    easyMatchArray(Array("美女", "小萝莉"))
    easyMatchArray(Array("美女", "小萝莉", "御姐"))
    println("````````````````````````````````")

    easyMatchList(List("校花"))
    easyMatchList(List("校花", "小萝莉"))
    easyMatchList(List("小萝莉", "校花", "御姐"))
    easyMatchList(List("校花", "小萝莉", "御姐"))
    println("````````````````````````````````")

    easyMatchType("")
    easyMatchType(0)
    easyMatchType(List(1))
    easyMatchType(Map("red" -> "#FF0000", "azure" -> "#F0FFFF"))
    easyMatchType()
    println("````````````````````````````````")

    easyMatchCase(CTO("张三", 18))
    easyMatchCase(Employee("李四", -1))
    easyMatchCase(new Person)
  }

  /**
   * 简单的模式匹配
   */
  def easyMatch(): Unit = {
    val names = Array("张三", "李四", "王五", "赵六", "钱七")
    val name = names(Random.nextInt(names.length))

    name match {
      case "张三" => println(name + " 这是一个小老")
      case "李四" => println(name + " 这是一个大老")
      case "王五" => println(name + " 这是一个巨老")
      case _ => println(name + "可能这是神吧")
    }
  }

  /**
   * 简单的模式匹配
   */
  def easyMatch1(name: String): Unit = {
    name match {
      case "校花" => println(name + " 这是一个小老")
      case "美女" => println(name + " 这是一个大老")
      case "御姐" => println(name + " 这是一个巨老")
      case "女神" => println(name + " 这是一个超巨老")
      case _ if (name == "小萝莉") => println(name + " 你需要多吃点木瓜")
      case _ => println(name + " 卧槽 你口味真重")
    }
  }

  /**
   * 数组模式匹配
   *
   * @param array
   */
  def easyMatchArray(array: Array[String]): Unit = {
    array match {
      case Array("校花") => println("hi " + array.mkString)
      case Array(x, y) => println("hi" + x + ", " + y)
      case Array("美女", _*) => println("嘿嘿嘿  " + array.mkString)
      case _ => println("hi 美女们 ")
    }
  }

  /**
   * 集合模式匹配
   *
   * @param list
   */
  def easyMatchList(list: List[String]): Unit = {
    list match {
      case "校花" :: Nil => println("hi " + list.mkString)
      case x :: y :: Nil => println("hi" + x + ", " + y)
      case "校花" :: _ => println("嘿嘿嘿  " + list.mkString)
      case _ => println("hi 美女们 ")
    }
  }

  /**
   * 类型模式匹配
   *
   * @param obj
   */
  def easyMatchType(obj: Any): Unit = {
    obj match {
      case _: Int => println("这是Int类型")
      case _: String => println("这是String类型")
      case _: List[_] => println("这是List类型")
      case _: Map[_, _] => println("这是Map类型")
      case _ => println("鬼都不知这是什么类型")
    }
  }

  class Person

  case class CTO(name: String, floor: Int) extends Person

  case class Employee(name: String, floor: Int) extends Person

  case class Other(name: String, floor: Int) extends Person

  /**
   * 类型模式匹配
   *
   * @param person
   */
  def easyMatchCase(person: Person): Unit = {


    person match {
      case CTO(name, floor) => println("CTO 姓名：" + name + ",在 " + floor + " 楼办公")
      case Employee(name, floor) => println("普通职员 姓名：" + name + ",在 " + floor + " 楼办公")
      case Other(name, floor) => println("不知道干嘛的职员 姓名：" + name + ",在 " + floor + " 楼办公")
      case _ => println("这不是我们公司员工")
    }
  }
}
