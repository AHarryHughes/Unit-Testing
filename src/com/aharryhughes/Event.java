package com.aharryhughes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by ahhughes8 on 8/7/17.
 */
public class Event {

    private String name;
    private String action;
    private List<Event> eventList;

    public void EventLog () {
        // which initializes the list
        eventList = new ArrayList<>();
    }

    public boolean addEvent(Event event) throws IllegalArgumentException {
        if(event == null || event.name == null || event.action == null){
           throw new IllegalArgumentException();
        }
        else if (event.action.equals("Face2Face") || event.action.equals("PhoneCall") || event.action.equals("TextMessaging") || event.action.equals("Unknown")){
            eventList.add(event);
            System.out.println(event.name);
            return true;
        }
        return false;
    }

    public int getNumEvents () {
       // which returns the size of the list
        return eventList.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
