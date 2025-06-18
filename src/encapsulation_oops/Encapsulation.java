package encapsulation_oops;

class Bank{
    private int acc_no;
    double balance;

    Bank(int acc_no){
        this.acc_no-=acc_no;
        System.out.println(acc_no);
    }

    public void display(){
        System.out.println(acc_no);
    }

//    public int getAcc_no() {
//        return acc_no;
//    }
//
//    public boolean setAcc_no(int acc_no) {
//        this.acc_no = acc_no;
//        return false;
//    }

}

public class Encapsulation {
    public static void main(String[]args){
        Bank b=new Bank(1278678);
        b.display();
        //b.acc_no=87875765;
        //b.setAcc_no(786757);
        //System.out.println(b.getAcc_no());
        //b.display();
    }

}

//setters
//getters
