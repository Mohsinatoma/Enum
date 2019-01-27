package NaztechEnum.NaztechEnum;



public enum Month {

	JANURARY("january",31),
	FEBRUARY("february",28),
	MARCH("march",31),
	APRIL("april",30),
	MAY("may",31),
	JUNE("june",30),
	JULY("july",31),
	AUGUST("august",31);
	
	private final String mnth;   // in kilograms
    private final int day; // in meters
    Month(String m, int n) {
        this.mnth = m;
        this.day = n;
    }
    
   
    
   public static Month parse(String val) {
	   if(val==null) return null;
	   String s1=val.toUpperCase();
	   try {
		   return valueOf(val);
	   }catch(Exception e) {
		   for(Month i: values()) {
			   String s3=i.name();
			   //System.out.println(s3);
			   //System.out.println(s1);
			   String s2=i.name().substring(0,3);
			//	System.out.println("string"+s2);
				if(s1.equals(s2)) {
					
					return i;
				}else if (s1.equals(s3)) {
					//System.out.println(s3);
					return i;
				}
		   }
		   
	   }
	   return null;
   }
   public int getday() {
	   return day;
   }
   
}
