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
public class Patient {

    private ArrayList<ImagingServiceRequest> requests;
    private ArrayList<ServiceEpisode> services;
    private ArrayList<Visit> visits;
    private ArrayList<ClinicalDocument> documents;

    public Patient() {
        this.requests = new ArrayList<>();
        this.services = new ArrayList<>();
        this.visits = new ArrayList<>();
        this.documents=new ArrayList<>();
    }
    
    public void addRequest(ProcedurePlan procedureplan, ProcedureType proceduretype, Visit visit, ModalityPerformedProcedureStep modalitystep){
        ImagingServiceRequest request = new ImagingServiceRequest(this, procedureplan, proceduretype, visit, modalitystep);
        this.requests.add(request);
    }

    public void addService(ServiceEpisode serviceepisode){
        this.services.add(serviceepisode);
    }
    
    public void addVisit(Facility facility, ServiceEpisode serviceepisode){
        Visit visit = new Visit(facility, this, serviceepisode);
        this.visits.add(visit);
    }
     public void addDocument(ClinicalDocument document){
         this.documents.add(document);
     }
}
