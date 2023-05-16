package com.bjit.Exception_Handling.model;

public class Candidate {

    private String candidateName;
    public Candidate(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }
}
