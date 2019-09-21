package com.yi.exception

object ExceptionApp {
  def main(args: Array[String]): Unit = {
    try {
      var a = 1 / 0
    }catch {
      case ex: Exception =>
        println(ex.getMessage)
        ex.printStackTrace()
    }finally {
      // 一定会执行
    }
  }
}
