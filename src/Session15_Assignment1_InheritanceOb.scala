
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
    
    //calling emp function of Session15_Assignment1_Emp class and passing emp name and emp salary
    ref.emp("SUJIT M K", 20000)
  }
}