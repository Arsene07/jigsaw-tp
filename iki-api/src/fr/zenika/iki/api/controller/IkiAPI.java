package fr.zenika.iki.api.controller;

import fr.zenika.iki.recruitment.domain.Candidat;

import fr.zenika.iki.team.domain.Member;
import fr.zenika.iki.team.service.TeamManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by melghaouat on 27/08/2017.
 */
public class IkiAPI {

    List<Candidat> candidats = new ArrayList<Candidat>();
    List<Member> members = new ArrayList<Member>();


    public IkiAPI(){
        candidats = new ArrayList<Candidat>();
        candidats.add(new Candidat(1,"John","Matt","john.matt@yahoo.fr"));
        candidats.add(new Candidat(2,"Brad","Pitt","brad.pitt@yahoo.fr"));
        candidats.add(new Candidat(3,"Alain","Delon","alain.delon@yahoo.fr"));

    }

    public List<Candidat> getCandidatsList(){
        return new ArrayList<Candidat>();
    }

    public void addMember(Member membre){
        members.add(membre);
    }

    public void removeMembre(Candidat membre){
        candidats.remove(membre);
    }


    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, IOException {

        TeamManager teamManager = TeamManager.getTeamManager();
        teamManager.addMember(new Member(1,"Ung", "Celine","celine.ung@zenika.com"));
        teamManager.addMember(new Member(2,"Laporte", "Olivier","olivier.laporte@zenika.com"));
        teamManager.addMember(new Member(3,"Labusquière", "Maxence","maxence.Labusquiere@zenika.com"));
        teamManager.addMember(new Member(4,"Levandowski", "Cyrille","cyrille.levandowski@zenika.com"));
        teamManager.addMember(new Member(5,"Blanchard", "Tony","tony.blanchard@zenika.com"));
        teamManager.addMember(new Member(6,"Pierre", "Raby","pierre.raby@zenika.com"));
        teamManager.addMember(new Member(7,"ElGhaouat", "Mohammed","mohammed.elghaouat@zenika.com"));

        teamManager.raiseIkiMembers(500.d);
        teamManager.logIkiMembers();
    }

}

