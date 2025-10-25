package chap3Summary;

public class Fish {

	public static void main(String[] args) {
		int numFish=4;
		String fishType = "tuna";
		//String anotherFish = numFish+1;  --code doesnot compile
		String anotherFish = numFish+1+"";
		System.out.println(anotherFish+""+fishType);
		System.out.println(numFish+""+1);
		
		StringBuilder sb= new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		System.out.println(sb);
		
//		String s1="java";
//		StringBuilder s2=new StringBuilder("java");
//		if(s1==s2)  --code doesnot comipile here
//			System.out.println("1");
//		if(s1.equals(s2))
//			System.out.println("2");   
	}

}
