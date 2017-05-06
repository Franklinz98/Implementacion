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
public class ProcedureType {
    private ArrayList<ModalityPerformedProcedureStep> modalitysteps;
    private ArrayList<RequestedProcedure> requestedprocedures;

    public ProcedureType(RequestedProcedure RequestedProcedure) {
        this.modalitysteps=new ArrayList<>();
        this.requestedprocedures=new ArrayList<>();
        this.requestedprocedures.add(RequestedProcedure);
    }
    
}
