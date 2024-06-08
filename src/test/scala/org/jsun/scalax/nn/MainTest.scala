package org.jsun.scalax.nn

import org.jsun.scalax.nn.datatypes.Matrix
//import org.scalatest.FunSuite
import org.scalatest.funsuite.AnyFunSuite

class MainTest extends AnyFunSuite{

  test("converting vector to row-oriented 2D matrix"){
    val v = Vector(1,2,3,4,5,6)
    val m = Matrix.fromVector(v.map(_.toDouble), 2, 3).m
    assert(m.size == 2)
    assert(m(0) == Vector(1,2,3))
    assert(m(1) == Vector(4,5,6))
  }

}
