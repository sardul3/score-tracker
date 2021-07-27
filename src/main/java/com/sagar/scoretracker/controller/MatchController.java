package com.sagar.scoretracker.controller;


import com.sagar.scoretracker.dto.req.CreateMatchReq;
import com.sagar.scoretracker.dto.req.SetTossReq;
import com.sagar.scoretracker.entity.Game;
import com.sagar.scoretracker.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class MatchController {

    private MatchService matchService;

    @PostMapping("/match")
    public ResponseEntity<Game> createNewMatch(@RequestBody CreateMatchReq req) {
        return ResponseEntity.status(HttpStatus.CREATED).body(matchService.createNewMatch(req));
    }

    @PostMapping("/match/{matchId}/toss")
    public ResponseEntity<String> setTossResult(@RequestBody SetTossReq req, @PathVariable String matchId) {
        return ResponseEntity.status(HttpStatus.OK).body(matchService.handleToss(req, matchId));
    }
}
