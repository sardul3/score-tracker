package com.sagar.scoretracker.dto.req;

import lombok.Data;

@Data
public class SetTossReq {
    private String headOrTails;
    private String callingTeam;
}

