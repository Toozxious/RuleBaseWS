/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanbroker.webservice;

import loanbroker.RuleBaseGateway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author mhck
 */
@WebService(serviceName = "RuleBaseWebService")
public class RuleBaseWebService {
    
    RuleBaseGateway gateway = new RuleBaseGateway();

    @WebMethod(operationName = "getRules")
    public String getRules(@WebParam(name = "creditScore") int creditScore, @WebParam(name = "loanDuration") int loanDuration, @WebParam(name = "loanAmount") double loanAmount) {
        String result = "No Rules - You've failed";
        result = gateway.getRules(creditScore, loanDuration, loanAmount);
        return result;
    }
}
