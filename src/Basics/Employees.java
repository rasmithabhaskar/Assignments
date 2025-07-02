package Basics;

public class Employees {

	public static void main(String[] args) {


		String [][][] semdetails =
			{
				{ 
					{"mathematics","pass(78)"},{"physics","pass(85)"},{"chemistry","fail(21)"},
			{"computer programing","pass(79)"},{"engineering drawing","pass(88)"},{"basic electrical eng","pass(79)"}
		},
			//sem 2	
				{
			{"mathematics 2","pass(82)"},{"mechaniics","pass(77)"},{"environmemtal sci","pass(93)"},
			{"basic electronics","fail(19)"},{"engi physics","pass(84)"},{"engg graphics","pass(91)"}
				},
				//sem 3
				{
					{"data structure","pass(88)"},{"discrete mathematics","pass(81)"},{"digital electronics","pass(76)"},
					{"operating system","fail(32)"},{"Signals and system","pass(85)"},{"object-oriented prog","pass(78)"}
					
				},
				//sem 4
				{
					{"algoritham","pass(91)"},{"computer networks","pass(73)" },{"database systems","fail(19)"},
					{"microprocessors","pass(80)"},{"communication eng","pass(76)"},{"software eng","pass(87)"}
				},
				//sem 5
				{
				{"probability & stats","pass(86)"},{"machine learning","pass(88)"},{"compiler design","pass(95)"},
				{"theory of computation","pass(73)"},{"embedded systems","pass(73)"},{"computer graphics","pass(90)"}
				
		}
	};
	
		System.out.println("semester 2 sub 4 is: "+ semdetails[1][3][0]);
		System.out.println("semester 2 sub 5 is: "+ semdetails[1][4][0]);
		
		System.out.println("**********");
		System.out.println(" semester 4 sub 3 marks are: "+ semdetails[3][2][1]);
		System.out.println(" semester 4 sub 6 marks are: "+ semdetails[3][5][1]);
		
		/*String [][][] a = new String[5][6][2];
		a[0][0][0]="mathematics";
		a[0][0][1]="pass(78)";
		a[0][1][0]="physics";
	    a[0][1][1]="pass(85)";
	    a[0][2][0]="chemistry";
	    a[0][2][1]="fail(21)";
	    a[0][3][0]="computer programing";
	    a[0][3][1]="pass(79)";
	    a[0][4][0]="engineering drawing";
	    a[0][4][1]="pass(88)";
	    a[0][5][0]="basic electrical eng";
	    a[0][5][1]="pass(79)";
	    
	    a[1][0][0]="mathematics 2";
		a[1][0][1]="pass(82)";
		a[1][1][0]="mechaniics";
	    a[1][1][1]="pass(77)";
	    a[1][2][0]="environmemtal sci";
	    a[1][2][1]="pass(93)";
	    a[1][3][0]="basic electronics";
	    a[1][3][1]="fail(19)";
	    a[1][4][0]="engi physics";
	    a[1][4][1]="pass(84)";
	    a[1][5][0]="engg graphics"
	    a[1][5][1]="pass(91)";


	    a[2][0][0]="mathematics 2";
		a[2][0][1]="pass(82)";
		a[2][1][0]="mechaniics";
	    a[2][1][1]="pass(77)";
	    a[1][2][0]="environmemtal sci";
	    a[1][2][1]="pass(93)";
	    a[1][3][0]="basic electronics";
	    a[1][3][1]="fail(19)";
	    a[1][4][0]="engi physics";
	    a[1][4][1]="pass(84)";
	    a[1][5][0]="engg graphics"
	    a[1][5][1]="pass(91)";
		*/
		
	}


}
