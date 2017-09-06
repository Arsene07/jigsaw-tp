package fr.zenika.iki.team.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.zenika.iki.team.domain.Member;
import fr.zenika.iki.team.service.internal.SalaryRaiseCalculator;
//import sun.misc.Unsafe;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;

//TODO 2
//import sun.font.CFont;

public class TeamManager {

    private List<Member> members = new ArrayList<>();

    public static  TeamManager teamManager = new TeamManager();

    private final static Logger LOGGER = Logger.getLogger(TeamManager.class.getName());

    private TeamManager(){}

    public static TeamManager getTeamManager() {
        return teamManager;
    }

    public void addMember(Member member){
        LOGGER.info("Adding a new member");
        members.add(member);
    }

    public void removeMember(Member member){
        LOGGER.info("removing a member");
        members.remove(member);
    }

   public void logIkiMembers() throws  IOException {
       LOGGER.info("Logging iki team members in Json format.");
       File json =  new File("/applis/jigsaw-demo/iki-team/iki-team.json");
       ObjectMapper objectMapper = new ObjectMapper();
       objectMapper.writeValue(json, members);

   }

    public void raiseIkiMembers(double raise) throws IOException, NoSuchFieldException, IllegalAccessException {
        LOGGER.info("Raising iki team members, youpiii !!.");

        members.stream().forEach(member -> SalaryRaiseCalculator.raiseSalary(member, raise));
    }

   public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
       TeamManager teamManager = new TeamManager();

       teamManager.addMember(new Member(1,"Ung", "Celine","celine.ung@zenika.com"));
       teamManager.addMember(new Member(2,"Laporte", "Olivier","olivier.laporte@zenika.com"));
       teamManager.addMember(new Member(3,"Labusquière", "Maxence","maxence.Labusquiere@zenika.com"));
       teamManager.addMember(new Member(4,"Levandowski", "Cyrille","cyrille.levandowski@zenika.com"));
       teamManager.addMember(new Member(5,"Blanchard", "Tony","tony.blanchard@zenika.com"));
       teamManager.addMember(new Member(6,"Pierre", "Raby","pierre.raby@zenika.com"));
       teamManager.addMember(new Member(7,"ElGhaouat", "Mohammed","mohammed.elghaouat@zenika.com"));

       teamManager.raiseIkiMembers(500.d);
       teamManager.logIkiMembers();

       //TODO 1
       /*Constructor<Unsafe> unsafeConstructor = Unsafe.class.getDeclaredConstructor();
       unsafeConstructor.setAccessible(true);
       Unsafe unsafe = unsafeConstructor.newInstance();

       TeamManager instance = (TeamManager)
               unsafe.allocateInstance(TeamManager.class);*/

   }
}
