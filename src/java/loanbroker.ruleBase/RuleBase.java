/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanbroker;

/**
 *
 * @author Nicklas Hemmingsen
 */
public class RuleBase {
    
    public String getRules(int creditScore, int loanDuration, double loanAmount){
        String rule = "";
        if(creditScore <= 500){
            if(loanAmount < 20000){
                if(loanDuration > 100){
                    rule = "expensive.high";
                }else{
                    rule = "expensive.low";
                }
            }else{
                rule = "expensive.high";
            }
                
        }else if(creditScore <= 700 && creditScore >= 501){
            if(loanAmount < 150000){
                if(loanDuration > 100){
                    rule = "expensive.low";
                }else{
                    rule = "cheap.high";
                }
            }else{
                rule = "cheap.low";
            }  
        }else if(creditScore <= 800 && creditScore >= 701){
            if(loanAmount > 500000){
                if(loanDuration > 100){
                    rule = "cheap.high";
                }else{
                    rule = "cheap.low";
                }
            }else
                rule = "cheap.low";     
        }
        return rule;
    }
}
