import org.scalatest.{MustMatchers, WordSpec}

class testPartridgeSpec extends WordSpec with MustMatchers{

  "Partridge" should{

    "return 'Lynn, I've pierced my foot on a spike'!!'" in {
      Partridge(List.empty) mustEqual "Lynn, I've pierced my foot on a spike!!"
    }
  }
}