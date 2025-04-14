package org.example.aggregation;

import java.util.List;

public class Team {
    List<Player> players;

    public Team(List<Player> players) {
        this.players = players;  // // Passed in, not created by Team
    }
}

/*
Team has a reference to Player, but it doesn’t control the lifecycle
Player objects can be shared between teams or reused elsewhere
* */