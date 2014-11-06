public class Student {

    //instance variables
    //these are the properties of a student

    	private String name;
    
	//turn this into an array///////////////
    	private int txtmarkone, txtmarktwo, txtmarkthree; 


 //constructor methods - 3 ways you can make a student

      public Student(){
		this("", 0, 0, 0);
	}

	//Additonal Constructor
	public Student(String nm, int t1, int t2, int t3) {
		name = nm;
		txtmarkone = t1;
		txtmarktwo = t2;
		txtmarkthree = t3;
	}

	//Another constructor
	public Student(Student s) {
		this(s.name, s.txtmarkone, s.txtmarktwo, s.txtmarkthree);
	}

    /*
    other methods
    these give our object more abilities
    */


    public void setName(String nm) {
    	name = nm;
    }

    public void setMark(int whichmark, int number){
    	if (whichmark == 1) {
    		txtmarkone = number;
    	} else if (whichmark == 2) {
    		txtmarktwo = number;
    	} else{

    		txtmarkthree = number;
    	}
    }

    public int getAverage() {
        
    	int average ;
              average = (txtmarkone + txtmarktwo + txtmarkthree) / 3;
    	return average;
    }


    public int getMark(int whichmark) {
	if (whichmark == 1) return txtmarkone;
	else if (whichmark ==2) return txtmarktwo;
	else return txtmarkthree;
    }

    public int getHighscore() {
    	if (txtmarkone > txtmarktwo && txtmarkone > txtmarkthree) {
    		return txtmarkone;
    	}
    	else if (txtmarktwo > txtmarkone && txtmarktwo > txtmarkthree){
    		return txtmarktwo;

    	} else {
    		return txtmarkthree;
    	}
    }

    public String toString() {
    	String result = "Name: " + name;
    	result += "\nMark 1:\t" + txtmarkone;
    	result += "\nMark 2:\t" + txtmarktwo;
    	result += "\nMark 3:\t" + txtmarkthree;
    	result += "\n~~~~~~~~~~~~~~~~~~";
    	result += "\nAverage:\t" + getAverage();
    	return result;
    }

    public String getName() {
    	return name;
    }

    //validate data
    public String validateData() {
    	String message = null;
    	//check if name is entered
    	if (name.equals("")) 
    		message += "\nName is required\nPlease re-enter all data";
    	
	if (txtmarkone < 0 || txtmarkone > 100 || txtmarktwo < 0 || txtmarktwo > 100 || txtmarkthree < 0 || txtmarkthree > 100) 
    		message += "\nAt least one mark is out of range, please re-enter all data";
    
        if (message !=null){
                message+= ("\n Please re-enter all data. ");
        }
	return message;
    	}
 }

