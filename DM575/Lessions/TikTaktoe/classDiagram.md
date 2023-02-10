
::: mermaid
classDiagram
    Board --|> Player
    Board : +Board()
    Board : +print() void
    Board : +nextPlayer() Player
    Board : +won() boolean
    Board : +tied() boolean
    Board : +play(int square) void
    Board : +isFree(int square) boolean
    class Player{
      X
      O
    }
:::