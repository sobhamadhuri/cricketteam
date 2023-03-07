/*package com.example.player.service;

import com.example.player.model.Player;
import com.example.player.repository.PlayerRepository;
import java.util.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

// Don't modify the below code

public class PlayerService implements PlayerRepository {

    private static HashMap<Integer, Player> team = new HashMap<>();

    public PlayerService() {
        team.put(1, new Player(1, "Alexander", 5, "All-rounder"));
        team.put(2, new Player(2, "Benjamin", 3, "All-rounder"));
        team.put(3, new Player(3, "Michael", 18, "Batsman"));
        team.put(4, new Player(4, "William", 45, "Batsman"));
        team.put(5, new Player(5, "Joshua", 19, "Batsman"));
        team.put(6, new Player(6, "Daniel", 10, "Bowler"));
        team.put(7, new Player(7, "Matthew", 34, "Bowler"));
        team.put(8, new Player(8, "Samuel", 17, "Batsman"));
        team.put(9, new Player(9, "John", 1, "Bowler"));
        team.put(10, new Player(10, "Earnest", 2, "All-rounder"));
        team.put(11, new Player(11, "Bob", 25, "Batsman"));
    }

    // Don't modify the above code

    // Write your code here
   int uniqueId =12;
    @Override
    public ArrayList<Player> getPlayers(){
        Collection<Player> playersTeam = team.values();
        ArrayList<Player> players = new ArrayList<>(playersTeam);
        return players;
    }

    @Override
    public Player addPlayer(Player player){
        player.setPlayerId(uniqueId);
        team.put(uniqueId, player);
        Player player1= team.get(uniqueId);
        uniqueId+=1;
        return player1;
    }

    @Override
    public Player getPlayerById(int playerId){
        Player existingPlayer = team.get(playerId);
        if (existingPlayer==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return existingPlayer;
    

    }
   @Override
    public Player updatePlayer(int playerId, Player player){
        Player existingPlayer = team.get(playerId);
        if (existingPlayer==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        
        if(player.getPlayerName() !=""){
            existingPlayer.setPlayerName(player.getPlayerName());
        }
        if(player.getJerseyNumber() != 0){
            existingPlayer.setJerseyNumber(player.getJerseyNumber());
        }
        if(player.getRole()!=""){
            existingPlayer.setRole(player.getRole());
        }

       
        return existingPlayer;
    }

    @Override
    public void deletePlayer(int playerId){
        Player existingPlayer = team.get(playerId);
        if (existingPlayer==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }else{
            team.remove(playerId);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }
}*/
