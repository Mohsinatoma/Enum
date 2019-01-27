package NaztechEnum.NaztechEnum;



public class Test {
	
	public static void main(String[] args) {
		//	Month mnth[]=Month.values();
			
		/*	for (Month col: mnth ) {
				 System.out.println(col + " at index "
	                     + col.ordinal()); 
			}*/
			
			
			
			String s="janurary";
			
			
			Month nn=Month.parse(s);
			
			System.out.println(nn);
			
			int a=nn.getday();
			System.out.println(a);
		}
		
}
