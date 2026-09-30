class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){

  }

  String print(String answer){
	String result= answer;
	return result;
  }

  double FtoC(double temperature){
	double result = (temperature - 32) * (5/9);
	return result;
  }

  double spherevol(double r){
	double result = (4/3) * Math.PI * Math.pow(r,3);
	return result;
  }

  double conevol(double r, double h){
	double result = (1/3) * Math.PI * Math.pow(r,2) * h;
	return result;
  }

   double distance(double x1, double x2, double y1, double y2){
	double result = Math.sqrt(((x2 - x1) *(x2 - x1)) * ((y2 - y1) * (y2 - y1)));
	return result;
  }

 
}