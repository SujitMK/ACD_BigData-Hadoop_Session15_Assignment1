

//MULTIPLE INHERITANCE IS NOT POSSIBLE IN SCALA

class Session15_Ass1_MultiClass extends Session15_Assign_MultiClass1 with Session15_Assign_MultiClass2{
  
  //Overridden function from Multiclass1
    override def print1():Unit = 
  {    
    println("Printing from Multiclass about MultiClass - 1")
    println(" ")
  }
  
  //Overridden function from Multiclass2
  override def print2():Unit = 
  {    
    println("Printing from Multiclass about MultiClass - 2")
    println(" ")
  }
}