class Student(val name: String) {
  var _id = -1
  var _age = -1
  def this(name: String, id: Int) = {
    this(name)
    _id = id
  }
  override def toString: String = s"Student(name=$name, id=${_id}, age=${_age})"
}

class StudentFaulty(val name: String) {
  var _id = -1
  var _age = -1
  def this(name: String, id: Int) = {
    this(name)
    _id = id
  }
  def this(name: String, age: Int) = {
    this(name)
    _age = age
  }
}
