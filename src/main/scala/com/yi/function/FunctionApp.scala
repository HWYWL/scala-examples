package com.yi.function

object FunctionApp {
  def main(args: Array[String]): Unit = {
    sayHello("小明")

    println(add(1, 2))

    defaultValue(null)

    variableParameter(1, 2, 3, 4, 5)
  }

  /**
   * 无返回值
   *
   * @param name
   */
  def sayHello(name: String): Unit = {
    println("Hello " + name)
  }

  /**
   * 最后一个执行的结果就是返回值，不需要return
   *
   * @param x 参数一
   * @param y 参数二
   * @return 相加结果
   */
  def add(x: Int, y: Int): Int = {
    x + y
  }

  /**
   * 默认参数
   *
   * @param name 参数，有一个默认值
   */
  def defaultValue(name: String = "李四"): Unit = {
    println("你好 " + name)
  }

  /**
   * 可变参数函数
   *
   * @param num 可变参数(类型必须相同)
   */
  def variableParameter(num: Int*) {
    var count: Int = 0
    num.foreach(e => {
      count += e
    })

    println("总和：" + count)
  }
}
