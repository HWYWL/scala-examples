package com.yi.conditions

import scala.collection.immutable.Range.Inclusive
import scala.util.control.Breaks

object Conditions {
  def main(args: Array[String]): Unit = {
    conditionalExpression(-1, 1)
    toExpression(1, 10)
    rangeExpression(1, 10)
    untilExpression(1, 10)
    foreachExpression(1, 10)
    forExpression(1, 10)
    whileExpression()
    dowhileExpression()
    breakExpression(1, 10)
  }

  /**
   * 条件表达式
   *
   * @param num1 参数一
   * @param num2 参数二
   */
  def conditionalExpression(num1: Int, num2: Int): Unit = {
    // 条件表达式
    if (num1 > num2) {
      println(num1 + " > " + num2)
    } else if (num1 == num2) {
      println(num1 + " = " + num2)
    } else {
      println(num1 + " < " + num2)
    }
  }

  /**
   * to循环表达式
   *
   * @param num1 参数一
   * @param num2 参数二
   */
  def toExpression(num1: Int, num2: Int): Unit = {
    val arr: Inclusive = num1.to(num2)
    println(arr.toList)
  }

  /**
   * range循环表达式
   *
   * @param num1 参数一
   * @param num2 参数二
   */
  def rangeExpression(num1: Int, num2: Int): Unit = {
    val arr: Range = Range(num1, num2)
    println(arr.toList)
  }

  /**
   * until循环表达式
   *
   * @param num1 参数一
   * @param num2 参数二
   */
  def untilExpression(num1: Int, num2: Int): Unit = {
    val arr: Range = num1.until(num2)
    println(arr.toList)
  }

  /**
   * foreach循环表达式
   *
   * @param num1 参数一
   * @param num2 参数二
   */
  def foreachExpression(num1: Int, num2: Int): Unit = {
    val arr: Range = num1.until(num2)
    arr.foreach(e => {
      print(e + " ")
    })
    println()
  }

  /**
   * for循环表达式
   *
   * @param num1 参数一
   * @param num2 参数二
   */
  def forExpression(num1: Int, num2: Int): Unit = {
    val arr: Range = num1.until(num2)

    for (a <- arr if a % 2 == 0) {
      println("质数: " + a)
    }
  }

  /**
   * while循环表达式
   */
  def whileExpression(): Unit = {
    var count = 10

    while (count > 0) {
      print(count + " ")
      count -= 1
    }
    println()
  }

  /**
   * do-while循环表达式
   */
  def dowhileExpression(): Unit = {
    var count = 10

    do {
      print(count + " ")
      count -= 1
    } while (count > 0)

    println()
  }

  /**
   * break 终止循环
   */
  def breakExpression(num1: Int, num2: Int): Unit = {
    val arr: Inclusive = num1.to(num2)
    val loop = new Breaks;

    loop.breakable {
      for (a <- arr) {
        print(a + " ")
        if (a == 5) {
          // 终止循环
          loop.break()
        }
      }
    }

    println()
  }
}
