package traitQueuePackage

trait QueueTrait
{
  def enqueue(queueList : List[Int] , elem : Int):List[Int]

  def dequeue(queueList: List[Int]): List[Int] = {
    queueList.tail
  }
}

class DoubleQueue extends QueueTrait {
  override def enqueue(queueList: List[Int], elem: Int): List[Int] =
  {
    val doubleElement = elem * 2
    queueList:+doubleElement
  }
}

class SquareQueue extends QueueTrait
{
  override def enqueue(queueList: List[Int], elem: Int): List[Int] =
  {
    val squareElement = elem * elem
    queueList :+ squareElement
  }
}

object TraitsPackagesDriver extends App
{
  val doubleQueueObject = new DoubleQueue
  val squareQueueObject = new SquareQueue
  val dequeueObject = new SquareQueue

  println(doubleQueueObject.enqueue(List(1,2,3,4),5))
  println(squareQueueObject.enqueue(List(5,7,9,10),4))
  println(dequeueObject.dequeue(List(2,3,4)))
}
