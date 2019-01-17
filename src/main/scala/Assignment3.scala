package edu.hcu.assignment3

class Assignment3 {

  def insertion(arr: Array[Int]): Array[Int] = {
    ???
  }

  def bubble(arr: Array[Int]): Array[Int] = {
    for (i <- 0 to arr.length) {
      for (j <- 0 to i) {
        if (arr(j) > arr(j + 1)) {
          arr(j) = arr(j) + arr(j + 1)
          arr(j + 1) = arr(j) - arr(j + 1)
          arr(j) = arr(j) - arr(j + 1)
        }

      }
    }

  }

  def selection(arr: Array[Int]): Array[Int] = {
    ???
  }

}
