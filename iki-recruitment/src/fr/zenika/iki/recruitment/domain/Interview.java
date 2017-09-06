package fr.zenika.iki.recruitment.domain;

import fr.zenika.iki.team.domain.Member;

import java.util.Date;

public class Interview {
    private Date interviewDate;
    private Candidat candidat;
    private Member Interviwer;

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public Member getInterviwer() {
        return Interviwer;
    }

    public void setInterviwer(Member interviwer) {
        Interviwer = interviwer;
    }
}
