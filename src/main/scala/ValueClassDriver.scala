object ValueClassDriver extends App {

  val fObject =new FirstName("Shivani")
  val lObject =new LastName("Mehrotra")
  val aObject =new Age(23)
  displayDetails(fObject,lObject,aObject)

  def displayDetails(fObject : FirstName,lObject : LastName , aObject : Age): Unit =
  {
    println(s"$fObject $lObject is of $aObject years. ")
  }
}

class FirstName(val firstName:String)
{
  override def toString: String = firstName
}

class LastName(val lastName: String)
{
  override def  toString: String = lastName
}

class Age(val age:Int)
{
  override def toString: String = age.toString
}
