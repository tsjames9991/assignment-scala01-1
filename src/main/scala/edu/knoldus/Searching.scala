package edu.knoldus

class Searching {
  def bSearch(elements: Array[Int], left: Int, right: Int, key: Int): Int = {
    if (left > right){
      return -1
    }
    val mid : Int = left + (right - left) / 2
    if (elements(mid) == key){
        return mid
      }

    else if (elements(mid) > key){
      return bSearch(elements, left, mid - 1, key)
    }
    else{
      return bSearch(elements, mid + 1, right, key)
    }
  }

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    val Left = 0
    val Right = array.length - 1
    val temp = bSearch(array, Left, Right, elem)
    if (temp != -1)
      {
        return true
      }
    else
    {
      return false
    }
  }

  def linearSearch(Elements: Array[Int], elem: Int): Boolean = {
    for (i <- 0 to Elements.length - 1)
      {
        if (Elements(i) == elem)
          return true
      }
    return false
  }

}
