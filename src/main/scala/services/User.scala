package services

import entities.{Employee, Student}

class User() {

  var students: List[Student] = Nil
  var employees: List[Employee] = Nil

  def add(name: String, age: Int, nam: String): Unit = {

    nam match {
      case "student" => {
        val studentobj = new Student(name, age)
        students = students :+ studentobj
        println("Student added")
        println("name:" + studentobj.name)
        println("age :" + studentobj.age)
        println(students.length)

      }

      case "employee" => {
        val employeeobj = new Employee(name, age)
        employees = employees :+ employeeobj
        println("employee added")
        println("name:" + employeeobj.name)
        println("age:" + employeeobj.age)
      }
    }
  }

  def remove(name: String): Unit = {

  }


}
