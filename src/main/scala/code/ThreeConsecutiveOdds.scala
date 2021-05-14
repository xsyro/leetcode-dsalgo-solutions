package code
/*
  Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.


  Example 1:

  Input: arr = [2,6,4,1]
  Output: false
  Explanation: There are no three consecutive odds.
  Example 2:

  Input: arr = [1,2,34,3,4,5,7,23,12]
  Output: true
  Explanation: [5,7,23] are three consecutive odds.

 */
/**
  * https://leetcode.com/problems/three-consecutive-odds/
  */
object ThreeConsecutiveOdds extends App {

  def threeConsecutiveOdds(arr: Array[Int]): Boolean = {
    //initialise a variable to hold the count
    var count: Int = 0
    var isFound: Boolean = false
    //iterate through the value of the arr
    for(num <- arr){
      if(isOdd(num)) {
        count+=1
        if(count >= 3) return true
      } else count = 0
    }
    isFound
  }

  //Odd numbers are divisible by 2 with a remainder
  def isOdd(int: Int): Boolean = {
    int % 2 != 0
  }

}
