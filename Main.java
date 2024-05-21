package SchoolManagement;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(98,"sampath",90000);
        Teacher teacher2 = new Teacher(97,"nayak",290000);
        Teacher teacher3 = new Teacher(96,"karuna",2390000);
        Teacher teacher4 = new Teacher(95,"sathish",20000);
        List<Teacher> TeacherList  = new ArrayList<>();
        TeacherList.add(teacher1);
        TeacherList.add(teacher2);
        TeacherList.add(teacher3);
        TeacherList.add(teacher4);
        Student student1= new Student(465,"kadavakollu",9);
        Student student2= new Student(466,"khadarbaba",4);
        Student student3= new Student(467,"jaswanth",3);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        School vignan= new School(TeacherList,studentList);
        student1.payfee(5000);
        //System.out.println( "vignan school earned$ " + vignan.getTotalMoneyEarned());
        student2.payfee(4000);
        System.out.println( "vignan school earned$ " + vignan.getTotalMoneyEarned());
        System.out.println("-------vignan slary-----");
        teacher1.receeivesalary(teacher1.getSalary());
        System.out.println("Vignan has spent for salary to "+ teacher1.getName() +"and now has" + vignan.getTotalMoneyEarned());
        teacher2.receeivesalary(teacher2.getSalary());
        System.out.println("Vignan has spent for salary to "+ teacher2.getName() +"and now has" + vignan.getTotalMoneyEarned());
    }

}
