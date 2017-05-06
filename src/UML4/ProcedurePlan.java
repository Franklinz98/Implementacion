/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML4;

import java.util.ArrayList;

/**
 *
 * @author mybas
 */
public class ProcedurePlan {
    private ArrayList<ProtocolCode> protocolcodes;
    private RequestedProcedure requestedprocedure;

    public ProcedurePlan(ProtocolCode protocolcode, RequestedProcedure requestedprocedure) {
        this.protocolcodes=new ArrayList<>();
        this.protocolcodes.add(protocolcode);
        this.requestedprocedure = requestedprocedure;
    }   
    
}
