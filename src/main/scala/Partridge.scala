object Partridge {


  val terms: List[String] = "Partridge" :: "PearTree" :: "Chat" :: "Dan" :: "Toberlone" :: "Lynn" :: "AlphaPapa" :: "Nomad" :: Nil


  def apply(x: List[String]): String =
    if (x == List("AlphaPapa")) {
      "Mines a pint!"

    } else {
      "Lynn, I've pierced my foot on a spike!!"
    }
}