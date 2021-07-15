package Capg;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDob {

    public static void main(String[] args) {

        Date empDob1=new Date(12,6,1996);
        Date empDob2=new Date(8,6,1985);
        Date empDob3=new Date(12,6,1979);
        Date empDob4=new Date(26,11,1985);
        Map<Date,String >  EmpDobMap = new HashMap<>();
        EmpDobMap.putIfAbsent(empDob1,"Bob");
        EmpDobMap.putIfAbsent(empDob2,"James");
        EmpDobMap.putIfAbsent(empDob3,"Garry");
        EmpDobMap.putIfAbsent(empDob4,"Rock");
        System.out.println(EmpDobMap);

    }

}