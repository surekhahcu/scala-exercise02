package edu.hcu.assignment3

import org.scalatest.FunSuite

class Assignment3Test extends FunSuite {
  val obj = new Assignment3

  //1st
  test("Insertion sort") {
    val result = obj.insertion(Array(12, 11, 13, 5, 6))
    val expectResult = Array(5, 6, 11, 12, 13)
    assert(result === expectResult)
  }

  test("Insertion sort2") {
    val result = obj.insertion2(List(12, 11, 13, 5, 6))
    val expectResult = List(5, 6, 11, 12, 13)
    assert(result === expectResult)
  }

  //2nd
  test("bubble sort") {
    val result = obj.bubble(Array(12, 11, 13, 5, 6))
    val expectResult = Array(5, 6, 11, 12, 13)
    assert(result === expectResult)
  }




  //3rd
  test("Selection sort") {
    val result = obj.selection(Array(12, 11, 13, 5, 6))
    val expectResult = Array(5, 6, 11, 12, 13)
    assert(result === expectResult)
  }
/*
  test("Selection sort2") {
    val result = obj.selection1(List(12, 11, 13, 5, 6))
    val expectResult = List(5, 6, 11, 12, 13)
    assert(result === expectResult)
  }



    //5th
    test("Quick sort") {
      val result = obj.quick(Array(12, 11, 13, 5, 6))
      val expectResult = Array(5, 6, 11, 12, 13)
      assert(result === expectResult)
    }
  */
}
