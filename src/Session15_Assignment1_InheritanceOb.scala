
// Scala object to call class

object Session15_Assignment1_InheritanceOb {
  
  // main function 
  def main(args:Array[String])
  {
    // assigning class Session15_Assignment1_Emp instance to ref variable
    var ref = new Session15_Assignment1_Emp
    
    //printing info
    println(" ")
    println("Printing from Object having Main function")
    println(" ")
    
    
    // Single/Simple Inheritance
    
    //calling emp function of Session15_Assignment1_Emp class and passing emp name and emp salary
    ref.emp("SUJIT M K", 20000)
    
    //Multiple Inheritance
    //creating object of Session15_Ass1_MultiClass and calling emp function 
    
    var ref2 = new Session15_Ass1_MultiClass()
    ref2.print1()
    ref2.print2()
  }
}