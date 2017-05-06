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
public class ScheduledProcedureStep {

    private RequestedProcedure requestedprocedure;
    private ArrayList<ModalityPerformedProcedureStep> modalitysteps;
    private ArrayList<ProtocolCode> protocolcodes;

    public ScheduledProcedureStep(RequestedProcedure requestedprocedure, ModalityPerformedProcedureStep modalitystep, ProcedurePlan procedureplan) {
        this.modalitysteps = new ArrayList<>();
        ProtocolCode protocolcode = new ProtocolCode(modalitystep, procedureplan, this);
        this.protocolcodes.add(protocolcode);
        this.requestedprocedure = requestedprocedure;
    }

    public void addModality(ModalityPerformedProcedureStep modalitystep) {
        this.modalitysteps.add(modalitystep);
    }

    public void addProtocol(ModalityPerformedProcedureStep modalitystep, ProcedurePlan procedureplan, ScheduledProcedureStep scheduledstep) {
        ProtocolCode protocolcode = new ProtocolCode(modalitystep, procedureplan, scheduledstep);
        this.protocolcodes.add(protocolcode);
    }
}
