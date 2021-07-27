package com.sagar.scoretracker.dto.req;

import lombok.Data;

@Data
public class CreateMatchReq {
    private String homeTeam;
    private String awayTeam;
    private int overs;
}
