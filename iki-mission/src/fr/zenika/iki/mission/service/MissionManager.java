package fr.zenika.iki.mission.service;

import fr.zenika.iki.mission.domain.Mission;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MissionManager {

    private static final Logger LOGGER = Logger.getLogger(MissionManager.class.getName());

    private List<Mission> missions = new ArrayList<Mission>();

    public void addMission(Mission mission){
        LOGGER.info("Adding mission ..");
        missions.add(mission);
    }

}
