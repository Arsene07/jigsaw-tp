package fr.zenika.iki.recruitment.service;

import fr.zenika.iki.team.domain.Member;
import fr.zenika.iki.team.service.TeamManager;

import java.lang.reflect.Field;

public class RecruitementManager {

    private static RecruitementManager recruitementManager = new RecruitementManager();

    private RecruitementManager(){}

    public static RecruitementManager getRecruitementManager(){
        return recruitementManager;
    }

    public void hireNewMember(Member member){
        TeamManager.getTeamManager().addMember(member);

        Field f = null;
        try {
            f = member.getClass().getDeclaredField("salary");
            f.setAccessible(true);
            f.set(member, member.getSalary() + 300.d);
        }
        catch (NoSuchFieldException|IllegalAccessException e) {
                e.printStackTrace();
            }
    }

    public static void main(String[] args){
        Member member = new Member(9,"John","Smith","john.smith@yahoo.es");
        recruitementManager.hireNewMember(member);
    }

}
