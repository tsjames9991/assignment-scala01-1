class Search
{
  def LinearSearch (Elements : Array[Int], Key : Int ) : String = {
    if (Elements.contains(Key))
      "Element Found At " + (Elements.indexOf(Key) + 1)
    else
      "Element Not Found"
  }

  def BinarySearch (Elements : Array[Int], Left : Int, Right : Int, Key : Int ) : Int = {
    if(Left <= Right)
    {
      val Middle : Int = (Left + Right) / 2
      if (Elements(Middle) == Key)
        return Middle+1
      else if (Elements(Middle) > Key)
        return BinarySearch(Elements, Left, Middle - 1, Key)
      else
        return BinarySearch(Elements, Middle + 1, Right, Key)
    }
    else
      return -1
  }
}
