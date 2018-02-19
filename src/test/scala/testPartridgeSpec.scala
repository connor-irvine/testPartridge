import org.scalatest.{MustMatchers, WordSpec}

class testPartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" should {

    "return 'Lynn, I've pierced my foot on a spike!!' if empty list" in {
      Partridge(List.empty) mustEqual "Lynn, I've pierced my foot on a spike!!"
    }
    "return 'Mines a pint'! if list matches one term" in {
      Partridge(List("AlphaPapa")) mustEqual "Mines a pint!"
    }
    "return 'Lynn, I've pierced my foot on a spike!!' if no matches in list" in {
      Partridge(List("FUBAR")) mustEqual "Lynn, I've pierced my foot on a spike!!"
    }
    "return 'Mines a pint!' if there are any matches" in {
      Partridge(List("PearTree")) mustEqual "Mines a pint!"
    }
    "return 'Mines a pint!!' if there are two matches" in {
      Partridge(List(""))
    }
  }
}