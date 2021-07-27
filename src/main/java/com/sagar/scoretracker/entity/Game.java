package com.sagar.scoretracker.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@Data
//@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Game {

    private UUID matchId;

    private String homeTeam;
    private String awayTeam;
    private int overs;

}
