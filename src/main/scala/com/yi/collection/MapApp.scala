package com.yi.collection

/**
 * 映射
 */
object MapApp {
  def main(args: Array[String]): Unit = {

    // 构建映射
    var scores1 = Map("NO1" -> "校花", "NO2" -> "美女", "NO3" -> "女神")
    val scores2 = Map(("NO1" -> "校花"), ("NO2" -> "美女"), ("NO3" -> "女神"))
    scores1 +=("NO4" -> "萝莉")

    //获取映射的指
    println(scores1("NO2"))
    println(scores2.getOrElse("NO3", "不在榜单中"))
  }
}
