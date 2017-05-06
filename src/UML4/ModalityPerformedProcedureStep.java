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
public class ModalityPerformedProcedureStep {

    private ArrayList<Series> series;
    private ArrayList<ScheduledProcedureStep> scheduledproceduresteps;
    private ArrayList<RequestedProcedure> requestedprocedures;
    private ProcedureType proceduretype;
    private ProtocolCode protocolcode;

    public ModalityPerformedProcedureStep(ProcedureType proceduretype, ProtocolCode protocolcode) {
        this.proceduretype = proceduretype;
        this.protocolcode = protocolcode;
        this.series=new ArrayList<>();
        this.scheduledproceduresteps=new ArrayList<>();
        this.requestedprocedures=new ArrayList<>();
    }
    
    public void addSeries(Series serie) {
        this.series.add(serie);
    }

    public void addSeries(ScheduledProcedureStep scheduledprocedurestep) {
        this.scheduledproceduresteps.add(scheduledprocedurestep);
    }
    
    public void addSeries(RequestedProcedure requestedprocedure) {
        this.requestedprocedures.add(requestedprocedure);
    }
}
