import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForLoop {
    public static void main(String[] args) {


        List<Employee> list=new ArrayList<Employee>();
        Employee e1=new Employee("ABC",21,21000);
        Employee e2=new Employee("DCF",26,23000);
        Employee e3=new Employee("GHI",23,25000);
        Employee e4=new Employee("JKL",28,21000);
        Employee e5=new Employee("MNO",22,21000);



        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        System.out.println(list);
        List<Employee> incrementdSalary= list.stream().map(e->{
            if(e.getAge()>22){
                e.setSalary((long) (e.getSalary()*1.10));
            }
            return e;
        }).collect(Collectors.toList());

        System.out.println(incrementdSalary);

        }
    }
