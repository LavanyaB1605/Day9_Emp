import java.util.Random;

public class EmpWage {
    public static int isPresent = 1;
    public static int empRatePerHr = 20 ;
    public static int empHrs = 8 ;
    public static int salary;

    public static Random random = new Random();
    public static int x = random.nextInt(2);
    public static void EmployeePresent(){
        //System.out.println(x);
        if(x == 1) {
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is absent");
        }
    }
    public static void DailyWage(){

        if (isPresent == x )
        {
            salary=empRatePerHr * empHrs ;
            System.out.println("DailyWage is " +salary);
        }
        else{
            salary = 0;
            System.out.println("DailyWage is " +salary);
        }
    }


}
