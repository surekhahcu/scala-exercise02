package edu.hcu.assignment3

class Assignment3 {


  //Insertion sort
  def insertion(arr: Array[Int]): Array[Int] = {
    for (i <- 1 to arr.length - 1) {
      var j = i
      while ((j > 0) && (arr(j - 1) > arr(j))) {
        arr(j - 1) = arr(j - 1) + arr(j)
        arr(j) = arr(j - 1) - arr(j)
        arr(j - 1) = arr(j - 1) - arr(j)
        j = j - 1
      }
    }
    arr
  }

  def insertion2(arr: List[Int]): List[Int] = {

    arr match {
      case Nil => Nil
      case head :: tail => insert(head, insertion2(tail))

    }
  }

  def insert(x: Int, xs: List[Int]): List[Int] = {

    xs match {
      case Nil => List(x)
      case head :: tail =>
        if (head >= x) x :: xs
        else head :: insert(x, tail)
    }
  }


  // Bubble sort
  def bubble(arr: Array[Int]): Array[Int] = {
    for (i <- 0 to arr.length - 1) {
      for (j <- 1 to arr.length - 1) {
        if (arr(j - 1) > arr(j)) {
          arr(j - 1) = arr(j - 1) + arr(j)
          arr(j) = arr(j - 1) - arr(j)
          arr(j - 1) = arr(j - 1) - arr(j)
        }
      }
    }
    arr
  }


  def bubble2(arr: List[Int]): List[Int] = {
  arr.foldLeft(List[Int]()) { (temp, ele) => if (temp.head > ele) ele :: temp else temp :+ ele }

  }


  //Selection sort
  def selection(arr: Array[Int]): Array[Int] = {
    for (i <- 0 to arr.length - 1) {
      var min = i
      for (j <- i + 1 to arr.length - 1) {
        if (arr(min) > arr(j)) {
          min = j
        }
      }
      if (min != i) {
        arr(min) = arr(min) + arr(i)
        arr(i) = arr(min) - arr(i)
        arr(min) = arr(min) - arr(i)
      }
    }
    arr
  }


  
}





