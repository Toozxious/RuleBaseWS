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
public class RuleBaseGateway {
    
    RuleBase rbase = new RuleBase();
    
    public String getRules(int creditScore, int loanDuration, double loanAmount){
        
        return rbase.getRules(creditScore, loanDuration, loanAmount);
    }
}
