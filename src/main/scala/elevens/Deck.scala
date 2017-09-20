package elevens

class Deck 
{
  var cards = 52
  def cardsLeft() = { cards }

  def drawCard() = {
    if(cards > 0) {
      cards -= 1
    }
  }
}
