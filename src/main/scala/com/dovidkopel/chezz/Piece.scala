package com.dovidkopel.chezz

trait Piece {
  val board: Board
  val player: Player
  val rank: ChessPieceRank
  val initialPosition: Position
  def position: Position
  def history: Seq[Position]
  @throws(classOf[IllegalStateException])
  def move(newPosition: Position)

  def validMovesCount: Int = rank.validMovesCount(position, board)
  def validMoves: Set[Position] = rank.validMoves(position, board)
  def valid(newPosition: Position): Boolean = rank.valid(position, newPosition, board)
}
object Piece {
  def toPosition(piece: Piece): Position = piece.position
}