package com.huigod.clone;

public class CloneTest1 {

  public static void main(String[] args) throws CloneNotSupportedException {
    Student student = new Student();
    student.setAge(20);
    student.setName("zhangsna");

    Student student1 = (Student) student.clone();
    System.out.println(student1.getAge());
    System.out.println(student1.getName());

    System.out.println("-------------------");

    student1.setName("lisi");

    System.out.println(student.getName());
    System.out.println(student1.getName());
  }

}

class Student implements Cloneable {

  private int age;
  private String name;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}