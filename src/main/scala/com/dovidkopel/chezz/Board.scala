package com.dovidkopel.chezz



/**
  * Created by dkopel on 1/1/17.
  */
trait Board {
  private[this] var pieces = Seq.empty[Piece]
  def positions: Set[Position]
  def players: Set[Player]
  def faces: Int
  def apply(position: Position): Option[Piece] = pieces.find(p => p.position.equals(position))
  @throws(classOf[IllegalStateException])
  def apply(piece: Piece, position: Position)
}
