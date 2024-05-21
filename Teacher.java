package SchoolManagement;
import java.sql.Driver;
import java.util.Formatter;
public class Teacher {
    private  int  id;
    private  String name;
    private int salary;
    private int salareyearned;
    public  Teacher(int id,String name,int salary){
        this.id= id;
        this.name=name;
        this.salary=salary;
        this.salareyearned=0;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return this.name; //this is optional
    }
    public int getSalary(){
        return salary;
    }
    public void  setSalary(int salary){
        this.salary=salary;
    }
    public  void receeivesalary(int salary){
        salareyearned+=salary;
        School.updateTotalMoneySpent(salary);

    }
}
