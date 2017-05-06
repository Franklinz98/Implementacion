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
public class ImagingServiceRequest {
    private ArrayList<RequestedProcedure> requestedprocedures;
    private Patient patient;

    public ImagingServiceRequest(Patient patient, ProcedurePlan procedureplan, ProcedureType proceduretype, Visit visit, ModalityPerformedProcedureStep modalitystep) {
        this.patient = patient;
        this.requestedprocedures=new ArrayList<>();
        RequestedProcedure requestedprocedure = new RequestedProcedure(procedureplan, proceduretype, visit, this, modalitystep);
        this.requestedprocedures.add(requestedprocedure);
    }
    
    public void addProcedure(ProcedurePlan procedureplan, ProcedureType proceduretype, Visit visit, ModalityPerformedProcedureStep modalitystep){
        RequestedProcedure requestedprocedure = new RequestedProcedure(procedureplan, proceduretype, visit, this, modalitystep);
        this.requestedprocedures.add(requestedprocedure);
    }
}
