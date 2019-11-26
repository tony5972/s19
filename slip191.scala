object slip191
{
	def main(args:Array[String])
	{
			println("(List style, java style, fill, range, tabulate methods)")
		var l1:List[Int]=1::2::3::Nil;//List Method
		println(l1);
		
		var l2:List[Int]=List(1,2,3);//Java Method
		println(l2);
		
		var l3:List[String]=List.fill(3)("HELLO");//Fill
		println(l3);
		
		var l4:List[Int]=List.range(1,5);//range
		println(l4);
		
		var l5:List[Int]=List.tabulate(5)(n=>n*n);//tabulate
		println(l5);

	}
}
