package week02d05;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom item : meetingRooms) {
            System.out.println(item.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size()-1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        for (int i = 0; i < meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i).getName());

        }
    }

    public void printAreas() {
        for (MeetingRoom item : meetingRooms) {
            System.out.println(item.getName() + ":" + item.getLenght() + "x" + item.getWidth() + "=" + item.getArea());
        }

    }

    public void printMeetingRoomsWithName(String name) {
        for (MeetingRoom item : meetingRooms) {
            if (name.equals(item.getName())) {
                System.out.println(item.getName() + ":" + item.getLenght() + "x" + item.getWidth() + "=" + item.getArea());
            }
        }
    }

    public void printMeetingRoomsContains(String name) {
        for (MeetingRoom item : meetingRooms) {
            if (item.getName().indexOf(name)>-1) {
                System.out.println(item.getName() + ":" + item.getLenght() + "x" + item.getWidth() + "=" + item.getArea());
            }
        }
    }
    public void printAreasLargerThan(int area) {
        for (MeetingRoom item : meetingRooms) {
            if (item.getArea()>area) {
                System.out.println(item.getName() + ":" + item.getLenght() + "x" + item.getWidth() + "=" + item.getArea());
            }
        }
    }

}
