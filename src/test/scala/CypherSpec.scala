import org.scalatest.{MustMatchers, WordSpec}

class CypherSpec extends WordSpec with MustMatchers{

  "Cypher" must{

    "return List(1) when given 'a'" in {

      Cypher("a",1) 
    }
  }
}
