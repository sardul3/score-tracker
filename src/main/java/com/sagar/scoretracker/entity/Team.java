package com.sagar.scoretracker.entity;

import lombok.Data;

import java.util.UUID;

@Data
//@Entity
public class Team {

    private UUID teamId;

    private enum Decision {BATTING, BOWLING};

    private String teamName;
    private String tossLostOrWon;
    private String inningsDecision;
    private Decision decision;

}
