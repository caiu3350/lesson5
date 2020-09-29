package student;

public class Student {
    //Always start with instance variables
    //these make up the properties of your object
    //always make them private because...
    private String name;
    private int test1;
    private int test2;
    private int test3;
    //Constructor Method - this initializes the object
    //its always public (NameOfClass)
    
   // public Student(){
    //    name = "";
    //    test1 = 0;
    //    test2 = 0;
    ///   test3 = 0;
    //}
    
    public Student(String name, int test1, int test2, int test3){
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        //this. refers to the property and is needed if the parameters are the same name as the properties
    }
    //when you have multiple student constructers yiu can chain them
    //chaining constructors -> calling a constructor from within another constructor
    //saves a bit of time and code
    public Student(){
        this("",0,0,0);
    }
    public Student(Student other){
        this(other.name,other.test1,other.test2,other.test3);
    }
    //public Student(Student other){
     //   this.name = other.name;
     //   test1 = other.test1;
      //  test2 = other.test2;
      //  test3 = other.test3;
   // }
    //Other methods and abilities for your object
    public void setName(String n){
        name = n;
    }
    public void setScore(int i, int score){
        if(i==1) test1 = score;
        else if(i==2) test2 = score;
        else test3=score;
    }
    public String getName(){
        return name;
    }
    public int getScore(int i){
        if(i==1) return test1;
        else if (1==2) return test2;
        else
            return test3;
    }
    public int getAverage(){
        int average;
        average=(test1+test2+test3)/3;
        return average;
    }
    public int getHighScore(){
        int high = Math.max(test1,test2);
        high = Math.max(high, test3);
        return high;
    }
    public String toString(){
        String str;
        str = "Name:    "+name+"\n"+"Test 1:  "+test1+"\n"+"Test 2:  "+test2+"\n"+"Test 3:  "+test3+"\n"+"Average:  "+getAverage();
        return str;
    }
    
}

    