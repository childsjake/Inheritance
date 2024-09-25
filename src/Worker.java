public class Worker extends Person {
    double hourlyPayRate;

    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                "hourlyPayRate=" + hourlyPayRate +
                '}';
    }

    public Worker(String ID, String firstName, String lastName, int YOB, String title, double hourlyPayRate) {
        super(ID, firstName, lastName, YOB, title);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(String firstName, String lastName, int YOB, String title, double hourlyPayRate) {
        super(firstName, lastName, YOB, title);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double overtimeHours = 0;
        double overtimePayRate = 1.5 * hourlyPayRate;
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
            hoursWorked = hoursWorked - overtimeHours;

        }

        double weeklyPay = hourlyPayRate * hoursWorked + overtimePayRate * overtimeHours;
        return weeklyPay;
    }

    public double displayWeeklyPay(double hoursWorked) {
        double overtimeHours = 0;
        double overtimePayRate = 1.5 * hourlyPayRate;
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
            hoursWorked = hoursWorked - overtimeHours;
        }

        double normalPay = hourlyPayRate * hoursWorked;
        double overtimePay = overtimePayRate * overtimeHours;
        double weeklyPay = hourlyPayRate * hoursWorked + overtimePayRate * overtimeHours;

        System.out.println("Hours of regular pay: " + hoursWorked);
        System.out.println("Regular pay total: " + normalPay);
        System.out.println("Hours of overtime pay: " + overtimeHours);
        System.out.println("Overtime pay total: " + overtimePay);
        System.out.println("Overall pay total: " + weeklyPay);
        return weeklyPay;
    }

    public String toCSV(){
        return super.toCSV() + "," + hourlyPayRate;
    }

    public String toJSON(){
        char DQ = '\u0022';
        String retString = "{" + super.toJSON();
        retString += "" + DQ + "hourlyPayRate" + DQ + ":" + DQ + this.hourlyPayRate + DQ + "}";
        return retString;
    }

    public String toXML(){
        String retString = "<Worker>" + super.toXML() + "<hourlyPayRate>" + this.hourlyPayRate + "</hourlyPayRate></Worker>";
        return retString;
    }

}