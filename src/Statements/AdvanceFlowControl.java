package Statements;

public class AdvanceFlowControl {

	public static void main(String[] args) {
		int [][] myComplexArray = {{1,3,5,34},{3,5,7,8},{4,6,8,9}};
		for (int[] mySimpleArray : myComplexArray) {
			for(int i=0;i<mySimpleArray.length;i++) {
				System.out.print(mySimpleArray[i]+ "\t");
			}
			
			System.out.println();
		}

		int x=20;
		while(x>0) {
			do {
				x-=2;
			}while(x>5);
			x--;
			System.out.println(x+"\t");
		}
		
		//break statement example
		int [][] list ={{1,3,5,34},{3,2,7,8},{2,6,8,2}};
		int searchValue=2;
		int positionX =-1;
		int positionY = -1;
		
		PARENT_LOOP :for(int i=0;i<list.length;i++) {
			for(int j=0;j<list[i].length;j++) {
				if(list[i][j]==searchValue) {
					positionX=i;
				    positionY =j;
				    break PARENT_LOOP;
				}
			}
		}
		if(positionX ==-1||positionY==-1) {
			System.out.println("Search Value not found");
		}else {
			System.out.println("Search value found at positions: "+positionX+"\t"+positionY);
		}
		
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
		    for (char c = 'a'; c <= 'c'; c++) {
		        if (a == 2 || c == 'b')
		            continue FIRST_CHAR_LOOP;
		        System.out.print(" " + a + c);
		    }
		    
//		for (int i1=0;i1<10;) {
//			i1=i1++;
//			System.out.println("Hello World");
//		} this will run infinite loop -- 
		    
		}
		int x1=50,x2=75;
		boolean b=x1>=x2;
		if(b==true)
			System.out.println("succeess");
		else
			System.out.println("failure");
		
		boolean keepGoing = true;
		int result =15, i2=10;
		do {
			i2--;
			if(i2==8)keepGoing=false;
			result-=2;
		}while(keepGoing);
		System.out.println(result);
		
		
		int count =0;
		ROW_LOOP:for(int row=1;row<=3;row++)
			for(int col=1;col<=2;col++) {
				if(row*col%2==0) 
				continue ROW_LOOP;
				count++;
			}
		System.out.println(count);
		
		
		final char a='A',d='D';
		char grade='B';
		switch(grade) {
		case a:
		case 'B':System.out.print("great");
		case 'C': System.out.print("good"); break;
		case d:
		case 'F' :System.out.print("not good");
		
		
		}
			}
	}
	
	

