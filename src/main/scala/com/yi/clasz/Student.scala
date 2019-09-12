package com.yi.clasz

/**
 * 继承
 */
case class Student() extends People {
  var major: String = _
  var grade: String = _

  def this(major: String, grade: String, people: People) {
    this()

    this.grade = grade
    this.major = major
    this.age = people.age
    this.name = people.name
  }

  def getStudent(): Student = {
    this
  }

  /**
   * 重写toString方法
   */
  override def toString: String = "学生信息：姓名->" + name + " 年龄->" + age + " 专业->" + major + " 年级->" + grade
}
