object recursion {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // Define
  def inc(n: Int) = n + 1                         //> inc: (n: Int)Int
  def dec(n: Int) = n - 1                         //> dec: (n: Int)Int
  def isZero(n: Int) = n == 0                     //> isZero: (n: Int)Boolean
  
  // Problem 1
  def add(n: Int, m: Int): Int = inc(n + dec(m))  //> add: (n: Int, m: Int)Int
  
  add(3, 2)                                       //> res0: Int = 5
  add(4, 7)                                       //> res1: Int = 11
  add(2, 5)                                       //> res2: Int = 7
  add(10, 8)                                      //> res3: Int = 18
  
  // Problem 1a
  
  def addTail(n: Int, m: Int) = {
  	def helper(count: Int, result: Int): Int =
  		if(count == m) result else helper(inc(count), result + inc(0))
  	helper(0, n)
  }                                               //> addTail: (n: Int, m: Int)Int
  
  addTail(3, 2)                                   //> res4: Int = 5
  addTail(4, 7)                                   //> res5: Int = 11
  addTail(2, 5)                                   //> res6: Int = 7
  addTail(10, 8)                                  //> res7: Int = 18
  
  // Problem 2
  def mul(n: Int, m: Int): Int =
  	if (isZero(n) || isZero(m)) 0
  	else if (m < 0)	-n + mul(n, inc(m))
  	else add(n, mul(n, dec(m)))               //> mul: (n: Int, m: Int)Int
  
  mul(5, 3)                                       //> res8: Int = 15
  mul(3, 7)                                       //> res9: Int = 21
  mul(4, 6)                                       //> res10: Int = 24
  mul(7, 5)                                       //> res11: Int = 35
  mul(43, 23)                                     //> res12: Int = 989
  mul(6, 9)                                       //> res13: Int = 54
  
  // Problem 2a
  def mulTail(n: Int, m: Int) = {
  	def helper(count: Int, result: Int): Int =
  		if(count == m) result else helper(inc(count), add(result, n))
  	helper(0, 0)
  }                                               //> mulTail: (n: Int, m: Int)Int
  
  mulTail(5, 3)                                   //> res14: Int = 15
  mulTail(3, 7)                                   //> res15: Int = 21
  mulTail(4, 6)                                   //> res16: Int = 24
  mulTail(7, 5)                                   //> res17: Int = 35
  mulTail(43, 23)                                 //> res18: Int = 989
  mulTail(6, 9)                                   //> res19: Int = 54
  
  // Problem 3
  def exp2(m: Int): Int =
  	if (isZero(m)) 1
  	else mul(2, exp2(dec(m)))                 //> exp2: (m: Int)Int
  	
  exp2(3)                                         //> res20: Int = 8
  exp2(4)                                         //> res21: Int = 16
  exp2(12)                                        //> res22: Int = 4096
  exp2(0)                                         //> res23: Int = 1
  exp2(1)                                         //> res24: Int = 2
  
  
  
  // Problem 4
  def hyperExp(n: Int): Int =
  	if (isZero(n)) 1
  	else exp2(hyperExp(dec(n)))               //> hyperExp: (n: Int)Int
  	
  hyperExp(0)                                     //> res25: Int = 1
  hyperExp(1)                                     //> res26: Int = 2
  hyperExp(2)                                     //> res27: Int = 4
  hyperExp(3)                                     //> res28: Int = 16
  hyperExp(4)                                     //> res29: Int = 65536
  
}