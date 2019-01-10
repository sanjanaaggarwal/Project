import java.util.Scanner
import services.User
object main extends App {

  println("We may have two operations")
  println("1. we can add a user")
  println("2. we can remove a user ")
  val Scanner = new Scanner(System.in)
  println("enter the operation you want to perform")
  val operation = Scanner.nextInt()
  operation match {
    case 1 => {
      println("whom you want to add")
      println("1. you want to add a student")
      println("2. you want to add an employee")
      val Scanner = new Scanner(System.in)
      println("enter the operation you want to perform")
      val operation1 = Scanner.nextInt()
      operation1 match {
        case 1 => println("enter the name and age of a student")
          val name = Scanner.next()
          val age = Scanner.nextInt()
          val addstudent = new User()
          addstudent.add(name, age, "student")
        case 2 => println("enter the name and age of a employee")
          val name = Scanner.next()
          val age = Scanner.nextInt()
          val addemployee = new User()
          addemployee.add(name, age, "employee")
        case _ => println("we cnt nt add a person")

      }


    }
    case 2 => {
      println("whom you want to remove")
      println("1. you want to remove a student")
      println("2. you want to reemove an employee")
      val Scanner = new Scanner(System.in)
      println("enter the operation you want to perform")
      val operation2 = Scanner.nextInt()
      operation2 match {
        case 1 => println("enter the name of the student you want to remove")
          val name = Scanner.nextLine()
          val removestudent = new User()
          removestudent.remove(name)
        case 2 => println("enter the name of employee you want to remove")
          val name = Scanner.nextLine()
          val removeemployee = new User()
          removeemployee.remove(name)
        case _ => println("we dnt have that user so we cnt remove that user")
      }

    }

  }
}

