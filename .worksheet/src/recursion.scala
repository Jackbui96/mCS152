object recursion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(41); 
  
  // Define
  def inc(n: Int) = n + 1;System.out.println("""inc: (n: Int)Int""");$skip(26); 
  def dec(n: Int) = n - 1;System.out.println("""dec: (n: Int)Int""");$skip(30); 
  def isZero(n: Int) = n == 0;System.out.println("""isZero: (n: Int)Boolean""");$skip(67); 
  
  // Problem 1
  def add(n: Int, m: Int): Int = inc(n + dec(m));System.out.println("""add: (n: Int, m: Int)Int""");$skip(15); val res$0 = 
  
  add(3, 2);System.out.println("""res0: Int = """ + $show(res$0));$skip(12); val res$1 = 
  add(4, 7);System.out.println("""res1: Int = """ + $show(res$1));$skip(12); val res$2 = 
  add(2, 5);System.out.println("""res2: Int = """ + $show(res$2));$skip(13); val res$3 = 
  add(10, 8);System.out.println("""res3: Int = """ + $show(res$3));$skip(189); 
  
  // Problem 1a
  
  def addTail(n: Int, m: Int) = {
  	def helper(count: Int, result: Int): Int =
  		if(count == m) result else helper(inc(count), result + inc(0))
  	helper(0, n)
  };System.out.println("""addTail: (n: Int, m: Int)Int""");$skip(19); val res$4 = 
  
  addTail(3, 2);System.out.println("""res4: Int = """ + $show(res$4));$skip(16); val res$5 = 
  addTail(4, 7);System.out.println("""res5: Int = """ + $show(res$5));$skip(16); val res$6 = 
  addTail(2, 5);System.out.println("""res6: Int = """ + $show(res$6));$skip(17); val res$7 = 
  addTail(10, 8);System.out.println("""res7: Int = """ + $show(res$7));$skip(154); 
  
  // Problem 2
  def mul(n: Int, m: Int): Int =
  	if (isZero(n) || isZero(m)) 0
  	else if (m < 0)	-n + mul(n, inc(m))
  	else add(n, mul(n, dec(m)));System.out.println("""mul: (n: Int, m: Int)Int""");$skip(15); val res$8 = 
  
  mul(5, 3);System.out.println("""res8: Int = """ + $show(res$8));$skip(12); val res$9 = 
  mul(3, 7);System.out.println("""res9: Int = """ + $show(res$9));$skip(12); val res$10 = 
  mul(4, 6);System.out.println("""res10: Int = """ + $show(res$10));$skip(12); val res$11 = 
  mul(7, 5);System.out.println("""res11: Int = """ + $show(res$11));$skip(14); val res$12 = 
  mul(43, 23);System.out.println("""res12: Int = """ + $show(res$12));$skip(12); val res$13 = 
  mul(6, 9);System.out.println("""res13: Int = """ + $show(res$13));$skip(185); 
  
  // Problem 2a
  def mulTail(n: Int, m: Int) = {
  	def helper(count: Int, result: Int): Int =
  		if(count == m) result else helper(inc(count), add(result, n))
  	helper(0, 0)
  };System.out.println("""mulTail: (n: Int, m: Int)Int""");$skip(19); val res$14 = 
  
  mulTail(5, 3);System.out.println("""res14: Int = """ + $show(res$14));$skip(16); val res$15 = 
  mulTail(3, 7);System.out.println("""res15: Int = """ + $show(res$15));$skip(16); val res$16 = 
  mulTail(4, 6);System.out.println("""res16: Int = """ + $show(res$16));$skip(16); val res$17 = 
  mulTail(7, 5);System.out.println("""res17: Int = """ + $show(res$17));$skip(18); val res$18 = 
  mulTail(43, 23);System.out.println("""res18: Int = """ + $show(res$18));$skip(16); val res$19 = 
  mulTail(6, 9);System.out.println("""res19: Int = """ + $show(res$19));$skip(93); 
  
  // Problem 3
  def exp2(m: Int): Int =
  	if (isZero(m)) 1
  	else mul(2, exp2(dec(m)));System.out.println("""exp2: (m: Int)Int""");$skip(14); val res$20 = 
  	
  exp2(3);System.out.println("""res20: Int = """ + $show(res$20));$skip(10); val res$21 = 
  exp2(4);System.out.println("""res21: Int = """ + $show(res$21));$skip(11); val res$22 = 
  exp2(12);System.out.println("""res22: Int = """ + $show(res$22));$skip(10); val res$23 = 
  exp2(0);System.out.println("""res23: Int = """ + $show(res$23));$skip(10); val res$24 = 
  exp2(1);System.out.println("""res24: Int = """ + $show(res$24));$skip(106); 
  
  
  
  // Problem 4
  def hyperExp(n: Int): Int =
  	if (isZero(n)) 1
  	else exp2(hyperExp(dec(n)));System.out.println("""hyperExp: (n: Int)Int""");$skip(18); val res$25 = 
  	
  hyperExp(0);System.out.println("""res25: Int = """ + $show(res$25));$skip(14); val res$26 = 
  hyperExp(1);System.out.println("""res26: Int = """ + $show(res$26));$skip(14); val res$27 = 
  hyperExp(2);System.out.println("""res27: Int = """ + $show(res$27));$skip(14); val res$28 = 
  hyperExp(3);System.out.println("""res28: Int = """ + $show(res$28));$skip(14); val res$29 = 
  hyperExp(4);System.out.println("""res29: Int = """ + $show(res$29))}
  
}
