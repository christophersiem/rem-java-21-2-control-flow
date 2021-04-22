import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {
    @Test
    public void notMoreThan30People() {
        // Given
        int numberOfPeople = 31;

        // When
        String status = Alarm.getCapacityStatus(numberOfPeople);

        // Then
        assertEquals("Too many people", status);
    }


    @Test
    public void lessThan30PeopleIsOkay(){
        // Given
        int numberOfPeople = 29;

        // When
        String status = Alarm.getCapacityStatus(numberOfPeople);

        // Then
        assertEquals("Maximum number of people not exceeded", status);
    }
}
