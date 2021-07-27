package com.sagar.scoretracker.entity;

import lombok.Data;
import java.util.UUID;

@Data
//@Entity
public class Toss {
    private UUID tossId;
    private enum tossResult {HEADS, TAILS};
    private String callingTeam;
    private tossResult result;


}
