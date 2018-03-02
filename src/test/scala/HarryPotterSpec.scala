import org.scalatest.{MustMatchers, WordSpec}

class HarryPotterSpec extends WordSpec with MustMatchers{

  "Harry Potter" should {

    "return 'Congrats, You have made a potion' if empty list" in {
      HarryPotter(List.empty) mustEqual "Congrats, You have made a potion"
    }
  }
