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

  //Merge sort

  //Quick sort
}
