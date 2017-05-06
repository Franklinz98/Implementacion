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
public class RequestedProcedure {
    private ProcedurePlan procedureplan;
    private ProcedureType proceduretype;
    private Visit visit;
    private ImagingServiceRequest imagingrequest;
    private ArrayList<ScheduledProcedureStep> scheduledsteps;
    private ArrayList<ModalityPerformedProcedureStep> modalitysteps;

    public RequestedProcedure(ProcedurePlan procedureplan, ProcedureType proceduretype, Visit visit, ImagingServiceRequest imagingrequest, ModalityPerformedProcedureStep modalitystep) {
        this.procedureplan = procedureplan;
        this.proceduretype = proceduretype;
        this.visit = visit;
        this.imagingrequest = imagingrequest;
        this.modalitysteps=new ArrayList<>();
        this.scheduledsteps=new ArrayList<>();
        ScheduledProcedureStep schedulestep = new ScheduledProcedureStep(this, modalitystep, procedureplan);
        this.scheduledsteps.add(schedulestep);
    }
    
    public void addModality(ModalityPerformedProcedureStep modalitystep){
        this.modalitysteps.add(modalitystep);
    }
    public void addStep(RequestedProcedure requestedprocedure, ModalityPerformedProcedureStep modalitystep, ProcedurePlan procedureplan){
        ScheduledProcedureStep schedulestep = new ScheduledProcedureStep(this, modalitystep, procedureplan);
        this.scheduledsteps.add(schedulestep);
    }
}
