package com.dovidkopel.chezz

/**
  * Created by dkopel on 1/1/17.
  */
case class ChessPiece(
  override val board: Board,
  override val player: Player,
  override val rank: ChessPieceRank,
  override val initialPosition: Position
                     ) extends Piece
  with Color
  with Captured {

  private[this] var current: Position = initialPosition
  private[this] var _history: Seq[Position] = Seq[Position](initialPosition)
  private[this] var _captured: Boolean = false

  override def position: Position = current

  @throws(classOf[IllegalStateException])
  override def move(newPosition: Position): Unit = {
    if(valid(newPosition)) {
      _history = _history :+ newPosition
      current = newPosition
    } else {
      throw new IllegalStateException()
    }
  }

  override def history: Seq[Position] = _history

  override def captured: Boolean = _captured

  override def capture(pieceToDiscard: Piece): Unit = {
    if(canCapture(pieceToDiscard)) {
      _captured = true
    }
  }

  // Can `this` piece capture the passed piece with the next move
  override def canCapture(pieceToDiscard: Piece): Boolean = rank.canCapture(current, board, pieceToDiscard)
}

