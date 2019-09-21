package com.yi.clasz

/**
 *
 */
object ApplyApp {
  def main(args: Array[String]): Unit = {
    val ap = new ApplyTest

    for (_ <- 1.to(10)){
      ApplyTest.incr1()
      ap.incr2()
    }

    println(ApplyTest.count1)
    println(ap.count2)
  }
}

/**
 * class是object的伴生类
 */
object ApplyTest {
  var count1 = 0

  def incr1(): Unit ={
    count1 += 1
  }
}

/**
 * object是class的伴生对象
 */
class ApplyTest{
  var count2 = 0

  def incr2(): Unit ={
    count2 += 1
  }
}
