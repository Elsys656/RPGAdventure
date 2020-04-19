/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rpgadventure;
import java.util.HashMap;

/**
 *
 * @author nathy
 */
public class Player {
    String playerName, playerClass;
    int playerLevel, playerStrength, playerDexterity, playerIntel, playerHealth, playerHP, playerXP, choice, stats;
    String[] entityClasses = new String[] {"Fighter","Mage","Theif","Healer"};
            
   public Player() {
       setPlayerLevel(1);
       setPlayerXP(0);  
   }
   
   int roll(int num){
       int result = (int)(Math.random() * num + 1);
       return result;
   }
       public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    
    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerLevel(int playerLevel){
        this.playerLevel = playerLevel;
    }
    
    public int getPlayerLevel(){
        return playerLevel;
    }
    
    public void setPlayerXP(int playerXP){
        this.playerXP= playerXP;
    }
    
    public int getPlayerXP(){
        return playerXP;
    }
    public void setPlayerClass(String playerClass){
        this.playerClass = playerClass;
    }
    
    public String getPlayerClass() {
        return playerClass;
    }
    
    public void setPlayerHP(int playerHP){
        this.playerHP = playerHP;
    }
    
    public int getPlayerHP(){
        return playerHP;
    }
    
    public void setPlayerDexterity(int playerDexterity){
        this.playerDexterity = playerDexterity;
    }
    
    public int getPlayerDexterity(){
        return playerDexterity;
    }
    
    public void setPlayerStrength(int playerStrength){
        this.playerStrength = playerStrength;
    }
    
    public int getPlayerStrength(){
        return playerStrength;
    }
    public void setPlayerHealth(int playerHealth){
        this.playerHealth = playerHealth;
    }
    
    public int getPlayerHealth(){
        return playerHealth;
    }
    
    public void setPlayerIntel(int playerIntel){
        this.playerIntel = playerIntel;
    }
    
    public int getPlayerIntel(){
        return playerIntel;
    }
}
