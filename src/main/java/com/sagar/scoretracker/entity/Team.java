package com.sagar.scoretracker.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
//@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID teamId;

    private enum Decision {BATTING, BOWLING};

    private String teamName;
    private String tossLostOrWon;
    private String inningsDecision;
    private Decision decision;

}
