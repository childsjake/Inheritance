import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1, w2, w3;

    @BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Jake", "Childs", 2000, "Mr.", 25);
        w2 = new Worker("00000A", "Anthony", "Hopkins", 1942, "Sir", 80);
        w3 = new Worker("00000B", "Mantis", "Toboggan", 1955, "Dr.", 75);
    }

    @Test
    void testToString() {
        assertEquals("Worker{Person{ID='00000B', firstName='Mantis', lastName='Toboggan', YOB=1955, title='Dr.'}hourlyPayRate=75.0}", w3.toString());
    }

    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(100);
        assertEquals(100, w1.getHourlyPayRate());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1000, w1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals(3800.0, w2.displayWeeklyPay(45));
    }

    @Test
    void toCSV() {
        assertEquals("00000B,Mantis,Toboggan,Dr.,1955,75.0", w3.toCSV());
    }

    @Test
    void toJSON() {
        assertEquals("{{\"ID\":\"00000B\",\"firstName\":\"Mantis\",\"lastName\":\"Toboggan\",\"title\":\"Dr.\",\"YOB\":\"1955\"}\"hourlyPayRate\":\"75.0\"}", w3.toJSON());
    }

    @Test
    void toXML() {
        assertEquals("<Worker><Person><ID>000001</ID><firstName>Jake</firstName><lastName>Childs</lastName><title>Mr.</title><YOB>2000</YOB></Person><hourlyPayRate>25.0</hourlyPayRate></Worker>", w1.toXML());
    }
}