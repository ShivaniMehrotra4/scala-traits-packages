object PersonDriver extends App {
  val personOne = new Person("Test",24)
  val personTwo = new Person("Test",25)
  val personThree = new Person("TestAgain",24)
  val resultUponComparingOneTwo = personOne<personTwo
  println(resultUponComparingOneTwo)
  val resultUponComparingOneThree = personThree<personOne
  println(resultUponComparingOneThree)
}

class Person(val name:String , val age : Int)extends Ordered[Person]
{
  override def compare(that: Person): Int = if(this.name.equals(that.name))
    this.age-that.age
  else
    this.name.length-that.name.length

}
