import java.util.Random;

public class EmpWage {
    public static Random random = new Random();
    public static int isPresent = 1;
    public static int isPartTime=1;
    public static int isFullTime=2;
    public static int empRatePerHr = 20 ;
    public static int empHrs = 8 ;
    public static int salary;
    public static int numOfworkingDay=20;
    public static int  totalSalary=0;

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
    public static void PartTime(){
        if ( x == isPartTime ){
            empHrs=8;
            salary=empRatePerHr * empHrs;
            System.out.println("Employee PartTime Salary=" +salary);
        } else if ( x == isFullTime ) {
            empHrs=16;
            salary=empRatePerHr * empHrs;
            System.out.println("Employee FullTime Salary=" +salary);
        }else{
            empHrs=0;
            salary=empRatePerHr * empHrs;
            System.out.println("Employee Salary=" +salary);
        }
    }
    public static void SwitchCase(){
        switch (x) {
            case 1:
                empHrs=8;
                salary=empRatePerHr * empHrs;
                System.out.println("Employee PartTime Salary=" +salary);
                break;
            case 2:
                empHrs=16;
                salary=empRatePerHr * empHrs;
                System.out.println("Employee FullTime Salary=" +salary);
                break;
            default:
                empHrs=0;
                salary=empRatePerHr * empHrs;
                System.out.println("Employee Salary=" +salary);
        }
    }
    public static void WagesForMonth(){
        for ( int day=1; day<=numOfworkingDay; day++)
        {
            switch (x) {
                case 1:
                    empHrs=8;
                    break;
                case 2:
                    empHrs=16;
                    break;
                default:
                    empHrs=0;
            }
            salary=empHrs*empRatePerHr;
            totalSalary=totalSalary+salary;
            System.out.println("RandomCheck= " +x);
            System.out.println("Salary= " +salary);
        }
        System.out.println("Totalsalary= " +totalSalary);
    }


}
