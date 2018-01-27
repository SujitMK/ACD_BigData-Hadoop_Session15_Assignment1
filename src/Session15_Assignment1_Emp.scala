
// child class extending / inheriting super class Session15_Assignment1_EmpSuperClass
class Session15_Assignment1_Emp extends Session15_Assignment1_EmpSuperClass{
  
  // function emp is provide with body / implimentation 
  override def emp(eName:String,eSalary:Int):Unit = 
  {
    // printing the emp name and salary
    
    println("Printing from Child class Employee")
    println(" ")
    print("Employee Name : "+ eName + " and Salary : " + eSalary)
  }
}