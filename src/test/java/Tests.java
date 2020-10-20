import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void testTimeFormatter() {
        assertEquals("Are you a time traveler?", TimeFormatter.formatDuration(-1));
        assertEquals("now", TimeFormatter.formatDuration(0));
        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("5 seconds", TimeFormatter.formatDuration(5));
        assertEquals("1 minute", TimeFormatter.formatDuration(60));
        assertEquals("4 minutes and 32 seconds", TimeFormatter.formatDuration(60*4 + 32));
        assertEquals("1 minute and 5 seconds", TimeFormatter.formatDuration(65));
        assertEquals("1 minute and 40 seconds", TimeFormatter.formatDuration(100));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
        assertEquals("1 day", TimeFormatter.formatDuration(86400));
        assertEquals("2 days", TimeFormatter.formatDuration(86400 * 2));
        assertEquals("3 years and 3 seconds", TimeFormatter.formatDuration(31556927 * 3));
        assertEquals("1 year, 1 minute and 14 seconds", TimeFormatter.formatDuration(31557000));
        assertEquals("1 year, 1 day, 3 hours, 47 minutes and 54 seconds", TimeFormatter.formatDuration(31657000));
        assertEquals("1 year, 14 minutes and 11 seconds", TimeFormatter.formatDuration(31557777));
    }
}
