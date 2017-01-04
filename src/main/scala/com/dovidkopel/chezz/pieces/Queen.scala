package com.dovidkopel.chezz.pieces

import com.dovidkopel.chezz.ChessPieceRank

/**
  * Created by dkopel on 1/1/17.
  */
trait Queen extends ChessPieceRank {
  override val label = "Q"
  override val pieces: Int = 1
}
