package com.dovidkopel.chezz

/**
  * Created by dkopel on 1/1/17.
  */
trait Captured {
  def captured: Boolean
  def capture(pieceToDiscard: Piece)
  // Can `this` piece capture the passed piece with the next move
  def canCapture(pieceToDiscard: Piece): Boolean
}
