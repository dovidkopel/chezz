package com.dovidkopel.chezz

/**
  * Created by dkopel on 1/1/17.
  */
trait ChessPieceRank {
  val label: String
  // Number of pieces per player
  def pieces: Int
  // Origin per player
  def origin: PositionRange
  // For each piece, where the initial piece will reside for player
  def initialPositions: Set[Position]
  // How many valid moves with current position
  def validMovesCount(current: Position, board: Board): Int
  // All valid moves for current piece in current position based on board
  def validMoves(current: Position, board: Board): Set[Position]
  // Is supplied move valid for current piece in current position based on board
  def valid(current: Position, newPosition: Position, board: Board): Boolean
  // Can this piece capture the passed piece
  def canCapture(current: Position, board: Board, pieceToDiscard: Piece): Boolean
}
