import org.scalatest.{MustMatchers, WordSpec}

class testAdventNumber1Spec extends WordSpec with MustMatchers{

  "AdventNumber1" should {

    "return '-1 whole numbers only'" in {
      AdventNumber1.calculator(3) mustEqual -1
    }

    "return '1 whole numbers only'" in {
      AdventNumber1.calculator(6) mustEqual 0
    }

    "return '2 whole numbers only'" in {
      AdventNumber1.calculator(12) mustEqual 2
    }

    "return '2 decimals'" in {
      AdventNumber1.calculator(14) mustEqual 2
    }

    "return '654'" in {
      AdventNumber1.calculator(1969) mustEqual 654
    }

    "return '33583'" in {
      AdventNumber1.calculator(100756) mustEqual 33583
    }
  }
}
