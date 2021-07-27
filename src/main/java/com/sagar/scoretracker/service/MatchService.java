package com.sagar.scoretracker.service;

import com.sagar.scoretracker.dto.req.CreateMatchReq;
import com.sagar.scoretracker.dto.req.SetTossReq;
import com.sagar.scoretracker.entity.Game;
import com.sagar.scoretracker.repository.MatchRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@Service
//@AllArgsConstructor
@Slf4j
public class MatchService {

    //private MatchRepository matchRepository;

    public Game createNewMatch(CreateMatchReq req) {
        Game newMatch = Game.builder()
                            .matchId(UUID.randomUUID())
                            .homeTeam(req.getHomeTeam())
                            .awayTeam(req.getAwayTeam())
                            .overs(req.getOvers())
                            .build();
       // matchRepository.save(newMatch);
        return newMatch;
    }

    public String handleToss(SetTossReq req, String matchId) {
        String call = req.getHeadOrTails();
        String tossResult = "";
        String winningTeam = "";
        //Optional<Game> match =  matchRepository.findById(UUID.fromString(matchId));
//         if(match.isPresent()) {
//             log.info(match.get().getHomeTeam());
//             Random r = new Random();
//             int chance = r.nextInt(2);
//             switch (chance) {
//                 case 1:
//                     tossResult = "tails";
//                 case 0:
//                     tossResult = "heads";
//             }
//             log.info(tossResult);
//             if(call.startsWith(tossResult.substring(0,1))) {
//                 winningTeam = match.get().getHomeTeam();
//             }
//         }
        return winningTeam + " won the toss";
    }
}
