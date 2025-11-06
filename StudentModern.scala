class Student(val name: String, val id: Int, val age: Int)
object Student{
  def apply(name: String): Student = new Student(name, -1, -1)
  def apply(name: String, id: Int): Student = new Student(name, id, -1)
}
