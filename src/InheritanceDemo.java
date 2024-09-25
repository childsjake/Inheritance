import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        Worker w1 = new Worker("John", "Williams", 1968, "Mr.", 30);
        workers.add(w1);
        Worker w2 = new Worker("Anne", "Johnson", 1955, "Mrs.", 38);
        workers.add(w2);
        Worker w3 = new Worker("Joey", "Smith", 1981, "Dr.", 50);
        workers.add(w3);
        SalaryWorker s1 = new SalaryWorker("Jake", "Childs", 2000, "Mr.", 20, 69000);
        workers.add(s1);
        SalaryWorker s2 = new SalaryWorker("Jimmy", "Collins", 1998, "Esq.", 40, 82000);
        workers.add(s2);
        SalaryWorker s3 = new SalaryWorker("Paul", "McCartney", 1945, "Mr.", 60, 112000);
        workers.add(s3);

        int[] weeklyHours = {40, 50, 40};
        for (int week = 1; week <= 3; week++){
            System.out.println("Week " + week + " Pay:");
            for (Worker worker : workers) {
                double hoursWorked = weeklyHours[week - 1];
                System.out.println(worker.getFirstName() + " " + worker.getLastName() + ": " + worker.displayWeeklyPay(hoursWorked));
                System.out.println();
            }
            System.out.println();
        }

    }






}
