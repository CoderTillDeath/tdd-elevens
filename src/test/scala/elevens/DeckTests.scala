package elevens

import org.scalatest.{FunSuite,BeforeAndAfter}

class DeckTests extends FunSuite with BeforeAndAfter
{
  var deck : Deck = _

  before {
    deck = new Deck();
  }

  test("Canary Test") {
    assert(true)
  }
  
  test("A deck of cards has 52 cards") {
    assert(deck.cardsLeft() == 52)
  }

  test("When drawing a card from a deck, the number of cards left decreases") {
    deck.drawCard()
    assert(deck.cardsLeft() == 51)
  }

  test("Cannot have negative number of cards in a deck") {
    for(i <- 1 to 53) {deck.drawCard()}
    assert(deck.cardsLeft() == 0)
  }
}
