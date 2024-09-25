import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker s1, s2;

    @BeforeEach
    void setUp() {
        s1 = new SalaryWorker("000004", "Saul", "Goodman", 1975, "Esq.", 40, 80000);
        s2 = new SalaryWorker("000005", "Sigourney", "Weaver", 1954, "Mrs.", 40, 52000);
    }

    @Test
    void setAnnualSalary() {
        s1.setAnnualSalary(20000);
        assertEquals(20000, s1.getAnnualSalary());
    }

    @Test
    void testToString() {
        assertEquals("SalaryWorker{Worker{Person{ID='000005', firstName='Sigourney', lastName='Weaver', YOB=1954, title='Mrs.'}hourlyPayRate=40.0}annualSalary=52000.0}", s2.toString());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1000, s2.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals(1538.4615384615386, s1.displayWeeklyPay(40));
    }

    @Test
    void toCSV() {
        assertEquals("000005,Sigourney,Weaver,Mrs.,1954,40.0,52000.0", s2.toCSV());
    }

    @Test
    void toJSON() {
        assertEquals("{{{\"ID\":\"000004\",\"firstName\":\"Saul\",\"lastName\":\"Goodman\",\"title\":\"Esq.\",\"YOB\":\"1975\"}\"hourlyPayRate\":\"40.0\"}\"annualSalary\":\"80000.0\"}", s1.toJSON());
    }

    @Test
    void toXML() {
        assertEquals("<SalaryWorker><Worker><Person><ID>000004</ID><firstName>Saul</firstName><lastName>Goodman</lastName><title>Esq.</title><YOB>1975</YOB></Person><hourlyPayRate>40.0</hourlyPayRate></Worker><annualSalary>80000.0</annualSalary></SalaryWorker>", s1.toXML());
    }
}