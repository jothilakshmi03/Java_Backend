package constructor;

class IndianStates{
    public String state;  //global variable
    public float area;

    public void displaystates(){
        System.out.println("the area of the "+state+" is "+area+" km/sq");
    }
    IndianStates(String s,float a){ //parameter
        this.state=s;     //s,a= local variable
        this.area=a;     // constructor
        // this represents (this particular class or constructor)
    }
}

public class Parameterized_constructor {
    public static void main(String[] args) {
           IndianStates state1=new IndianStates("kerala",25.8f); //argument
           state1.displaystates();

        IndianStates state2=new IndianStates("Delhi",100.76f); //argument
        state2.displaystates();


    }
}
