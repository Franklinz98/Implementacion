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
public class Visit {
    private ArrayList<RequestedProcedure> requestedprocedures;
    private Facility facility;
    private Patient patient;
    private ServiceEpisode serviceepisode;

    public Visit(Facility facility, Patient patient, ServiceEpisode serviceepisode) {
        this.requestedprocedures=new ArrayList<>();
        this.facility = facility;
        this.patient = patient;
        this.serviceepisode = serviceepisode;
    }
    
}
