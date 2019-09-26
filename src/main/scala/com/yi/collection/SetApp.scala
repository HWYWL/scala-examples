package com.yi.collection

object SetApp {
  def main(args: Array[String]): Unit = {
    var set1 = Set(2, 5, 1, 1, -1, 0)
    set1 += 9

    println(set1)
  }
}
