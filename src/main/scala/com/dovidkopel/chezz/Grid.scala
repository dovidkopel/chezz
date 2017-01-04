package com.dovidkopel.chezz

/**
  * Created by dkopel on 1/2/17.
  */
trait Grid {
  def columns: Int
  def rows: Int
  def cells: Int = columns * rows
}
