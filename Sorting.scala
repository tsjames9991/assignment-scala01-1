def SelectionSort(Elements: Array[Int]): Array[Int] = {
  for( i <- 0 to Elements.length-1)
  {
    for(j <- i + 1 to Elements.length - 1)
      if(Elements(j) < Elements(i))
      {
        val temp = Elements(i)
        Elements(i) = Elements(j)
        Elements(j) = temp
      }
  }
  Elements
}

def BubbleSort(Elements: Array[Int]): Array[Int] = {
  for( i <- 0 until (Elements.length - 1))
  {
    for(j <- 0 until (Elements.length - i - 1 ))
      if(Elements(j) > Elements(j + 1))
      {
        val temp = Elements(j)
        Elements(j) = Elements(j + 1)
        Elements(j + 1) = temp
      }
  }
  Elements
}

def InsertionSort(Elements: Array[Int]): Array[Int] = {
  for( i <- 0 until Elements.length)
  {
    val m = Elements(i)
    var j = i
    while (j > 0 && m < Elements(j - 1))
    {
      Elements(j) = Elements(j - 1)
      j -= 1
    }
    Elements(j) = m
  }
  Elements
}