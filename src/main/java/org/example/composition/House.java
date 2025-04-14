package org.example.composition;

import java.util.ArrayList;
import java.util.List;

public class House {
    List<Room> rooms;

    public House(){
        rooms = new ArrayList<>();
        rooms.add(new Room("Leaving Room")); // Room create by House
        rooms.add(new Room("Bed Room"));  // // Room create by House
    }
}

/*
House ◆────────── Room

Solid diamond on the House side (the whole)
Solid line connecting to Room (the part)

House owns Room
Room does not exist independently outside the House
When the House is gone, so are its Rooms

* */
