object slip192
{
	def main(args:Array[String])
	{
		val z= List.tabulate(50)(n => (2*n) + 3)
		println("LIST OF 50 MEMBERS USING FUNCTION 2N+3: "+z);

		var x: List[Int]=z.filter(n => n%5 != 0);
   	    	println("LIST DIVISBLE BY 5 EXCULDED: "+x);
	}
}
