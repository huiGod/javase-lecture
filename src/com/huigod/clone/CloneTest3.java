package com.huigod.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CloneTest3 {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Teacher3 teacher = new Teacher3();
    teacher.setAge(30);
    teacher.setName("Teacher Zhang");

    Student3 student = new Student3();

    student.setAge(20);
    student.setName("zhangsan");
    student.setTeacher3(teacher);

    Student3 student2 = (Student3) student.deepCopy();

    System.out.println(student2.getAge());
    System.out.println(student2.getName());

    System.out.println("---------------");

    System.out.println(student2.getTeacher3().getAge());
    System.out.println(student2.getTeacher3().getName());

    student2.getTeacher3().setAge(50);
    student2.getTeacher3().setName("Teacher zhao");

    System.out.println(student.getTeacher3().getAge());
    System.out.println(student.getTeacher3().getName());
  }
}


class Teacher3 implements Serializable {


  private static final long serialVersionUID = -2998462720356645986L;
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
}

class Student3 implements Serializable {

  private static final long serialVersionUID = 8505502409017512348L;
  private int age;

  private String name;

  private Teacher3 teacher3;

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

  public Teacher3 getTeacher3() {
    return teacher3;
  }

  public void setTeacher3(Teacher3 teacher3) {
    this.teacher3 = teacher3;
  }

  public Object deepCopy() throws IOException, ClassNotFoundException {

    ByteArrayOutputStream bos = new ByteArrayOutputStream();

    ObjectOutputStream oos = new ObjectOutputStream(bos);

    oos.writeObject(this);

    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());

    ObjectInputStream ois = new ObjectInputStream(bis);

    return ois.readObject();


  }
}