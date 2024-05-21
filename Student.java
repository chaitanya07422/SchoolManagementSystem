package SchoolManagement;

public class Student {
    private  int id;
    private  String name;
    private int  grade;
    private int feepaid;
    private  int feetotal;
    public Student(int id,String name,int grade){
        feepaid=0;
        feetotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void  payfee(int fee){
        feepaid+=fee;
        School.updateTotalMoneyEarned(feepaid);// to  access the updateb toatoal moeny we used satic in  gthe updateTotalMoneyEarned methid
    }
    public int getId(){
        return id;
    }
    public  int getGrade(){
        return grade;
    }
    public String getName(){
        return name;
    }
    public  int getFeepaid(){
        return feepaid;
    }
    public int getFeetotal(){
        return feetotal;
    }
    public   int getremainingfee(){
        return feetotal-feepaid;

    }
}


