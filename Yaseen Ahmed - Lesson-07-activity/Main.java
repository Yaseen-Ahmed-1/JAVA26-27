
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  System.out.println("Enter X");
  double X = Input.readDouble();
  double Y = Math.pow(X,7);
  System.out.println(Y);


/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
  System.out.println("Enter Z");
  double Z = Input.readDouble();
  double q = Math.pow(Z,3) + 5;
  System.out.println(q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
  System.out.println("Enter T");
  System.out.println("Enter R");
  double T = Input.readDouble();
  double R = Input.readDouble();
  double S = Math.pow(T,5) * ((R + 2) * (R + 2)) * ((R + 2) * (R + 2)) ;
  System.out.println(S);

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
  System.out.println("Enter A");
  System.out.println("Enter B");
  double A = Input.readDouble();
  double B = Input.readDouble();
  double C = Math.sqrt(A + B);
  System.out.println(C);


/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
  System.out.println("Enter x1");
  System.out.println("Enter x2");
  System.out.println("Enter y1");
  System.out.println("Enter y2");
  double x1 = Input.readDouble();
  double x2 = Input.readDouble();
  double y1 = Input.readDouble();
  double y2 = Input.readDouble();
  double d = Math.sqrt(x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
  System.out.println(d);



/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
  System.out.println("Enter deg");
  double deg = Input.readDouble();
  double g = Math.sin(deg);
  System.out.println(g);





/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/
  System.out.println("Enter m");
  double m = Input.readDouble();
  System.out.println("Enter n");
  double n = Input.readDouble();
  double k = Math.pow(m,5) / Math.sqrt(n + 1);
  System.out.println(k);





/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}