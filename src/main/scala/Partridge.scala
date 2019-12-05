object Partridge {


  val terms = List("Partridge", "PearTree", "Chat", "Dan", "Toberlone", "Lynn", "AlphaPapa", "Nomad")
  val some = "Mines a pint!"
  val none = "Lynn, I've pierced my foot on a spike!!"


  def apply(input: List[String]): String = {
    input.count(x => terms.contains(x)) match {
    case 0 => "Lynn, I've pierced my foot on a spike!!"
    case x => "Mines a pint" + "!" * x
    }
  }

}