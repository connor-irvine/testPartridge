object Partridge {


  val terms: List[String] = "Partridge" :: "PearTree" :: "Chat" :: "Dan" :: "Toberlone" :: "Lynn" :: "AlphaPapa" :: "Nomad" :: Nil


  def apply(input: List[String]): String =
    if (input.exists(terms.contains(_))) {
      "Mines a pint!"
    }else{
      "Lynn, I've pierced my foot on a spike!!"
    }
}