public class SalaryWorker extends Worker
{

    double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, int YOB, String title, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, YOB, title, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(String firstName, String lastName, int YOB, String title, double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, YOB, title, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "SalaryWorker{" +
                super.toString() +
                "annualSalary=" + annualSalary +
                '}';
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        double weeklyPay = annualSalary / 52;
        return weeklyPay;
    }

    @Override
    public double displayWeeklyPay(double hoursWorked) {
        double weeklyPay = annualSalary / 52;
        System.out.println("Your weekly pay is: " + weeklyPay);
        System.out.println("This is 1/52 of your annual salary.");
        return weeklyPay;
    }

    public String toCSV(){
        return super.toCSV() + "," + annualSalary;
    }

    public String toJSON(){
        char DQ = '\u0022';
        String retString = "{" + super.toJSON();
        retString += "" + DQ + "annualSalary" + DQ + ":" + DQ + this.annualSalary + DQ + "}";
        return retString;
    }

    public String toXML(){
        String retString = "<SalaryWorker>" + super.toXML() + "<annualSalary>" + this.annualSalary + "</annualSalary></SalaryWorker>";
        return retString;
    }



}

