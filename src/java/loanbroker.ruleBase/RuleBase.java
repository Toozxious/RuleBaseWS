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
            if(loanAmount > 20000 && loanDuration > 100)
                rule = "expensive.high";
            if(loanAmount > 20000 && loanDuration < 100)
                rule = "expensive.low";
            
        }else if(creditScore <= 700 && creditScore >= 501){
            if(loanAmount > 150000 && loanDuration > 100)
                rule = "expensive.low";
            if(loanAmount > 150000 && loanDuration < 100) 
                rule = "cheap.high";
            
        }else if(creditScore <= 800 && creditScore >= 701){
            if(loanAmount > 500000 && loanDuration > 100)
                rule = "cheap.high";
            if(loanAmount > 500000 && loanDuration < 100) 
                rule = "cheap.low";
        }
        return rule;
    }
}
