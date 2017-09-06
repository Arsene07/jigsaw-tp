package fr.zenika.iki.team.service.internal;

import fr.zenika.iki.team.domain.Member;

import java.lang.reflect.Field;
import java.util.logging.Logger;

public class SalaryRaiseCalculator {
    private final static Logger LOGGER = Logger.getLogger(SalaryRaiseCalculator.class.getName());
    public static void raiseSalary(Member member, double raise)  {
       try {
           Field f = member.getClass().getDeclaredField("salary");
           f.setAccessible(true);
           f.set(member, member.getSalary() + raise);
           LOGGER.info("Salary raised !! ");
       }catch (NoSuchFieldException|IllegalAccessException e){
           LOGGER.severe("Cannot raise salary !! + " + e.getMessage());
       }


    }
}
