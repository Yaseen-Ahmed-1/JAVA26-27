
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){

	 
  
   

  }
  double gpa(double Gpa){
	if(Gpa > 90)
		return Gpa * 1.1;
	  else
	  	return Gpa;

  }
 boolean isGraduating(double gradelvl, double credits){
	if(gradelvl >= 12 && credits >= 44)
	   return True;
	else 
	   return False;
 }
 
 String BMI(double weight,double height){
	bmi = ((weight/(height * height)) * 703)
	if(bmi < 18.4)
		return Underweight; 
   else if
		(18.5 <= bmi <= 24.9)
			return Normal; 
   else if
		(25.0<= bmi <= 39.9)
			return overweight;
   else 
		return Obese;


 }

	double coneVolume(double radius, double height){
		return (Math.PI * radius * radius * height) / 3;
}

double distance(double x1, double y1, double x2, double y2){
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
}



 
  
}