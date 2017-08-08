package com.aharryhughes;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Rule;
        import org.junit.Test;
        import org.junit.rules.ExpectedException;

        import static junit.framework.TestCase.assertFalse;
        import static org.junit.Assert.assertTrue;

/**
 * Created by ahhughes8 on 8/7/17.
 */
public class EventTest {

    private Event event;
    private Event event1;
    private Event event2;
    private Event event3;
    private Event event4;
    private Event event5;
    private Event event6;

    @Before
    public void setUp() throws Exception {
        System.out.println("setting up");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Cleaning up");
    }

    @Test
    public void nullArgs() throws Exception {

        event = new Event();
        event.EventLog();

        event6 = new Event();
        event6.setAction(null);
        event6.setName("event6");


        expected.expect(IllegalArgumentException.class);
        event.addEvent(event6);
    }

    @Test
    public void stringArgs() throws Exception {

        event = new Event();
        event.EventLog();

        event1 = new Event();
        event1.setAction("Face2Face");
        event1.setName("event1");

        event2 = new Event();
        event2.setAction("PhoneCall");
        event2.setName("event2");

        event3 = new Event();
        event3.setAction("TextMessaging");
        event3.setName("event3");

        event4 = new Event();
        event4.setAction("Unknown");
        event4.setName("event4");

        event5 = new Event();
        event5.setAction("blah");
        event5.setName("event5");

        assertTrue(event.addEvent(event1));
        assertTrue(event.addEvent(event2));
        assertTrue(event.addEvent(event3));
        assertTrue(event.addEvent(event4));
        assertFalse(event.addEvent(event5));
    }

    @Rule //Another annotation directed to JUnit
    public ExpectedException expected = ExpectedException.none();
}