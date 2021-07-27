package com.sagar.scoretracker.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Toss {
    @Id
    private UUID tossId;
    private enum tossResult {HEADS, TAILS};
    private String callingTeam;
    private tossResult result;


}
