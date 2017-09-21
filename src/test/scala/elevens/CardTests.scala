package elevens

import org.scalatest.{FunSuite,BeforeAndAfter}


class CardTests extends FunSuite with BeforeAndAfter {

  var card : Card = _

  before {
    card = new Card(5)
  }

  test("two non-face cards sum to 11") {
    var card2 = new Card(6)
    assert(card.getValue() + card2.getValue() == 11)
  }

  test("two non-face cards that don't sum to 11") {
    var card2 = new Card(3)
    assert(card.getValue() + card2.getValue() != 11)
  }
}
