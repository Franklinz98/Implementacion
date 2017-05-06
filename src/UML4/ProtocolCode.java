/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML4;

/**
 *
 * @author mybas
 */
public class ProtocolCode {
    private ModalityPerformedProcedureStep modalitystep;
    private ProcedurePlan procedureplan;
    private ScheduledProcedureStep scheduledstep;

    public ProtocolCode(ModalityPerformedProcedureStep modalitystep, ProcedurePlan procedureplan, ScheduledProcedureStep scheduledstep) {
        this.modalitystep = modalitystep;
        this.procedureplan = procedureplan;
        this.scheduledstep = scheduledstep;
    }
    
}
