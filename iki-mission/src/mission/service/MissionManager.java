package mission.service;

import mission.domain.Mission;

import java.util.List;
import java.util.logging.Logger;

public class MissionManager {

    private static final Logger LOGGER = Logger.getLogger(MissionManager.class.getName());

    private List<Mission> missions;

    public void addMission(Mission mission){
        LOGGER.info("Adding mission ..");
        missions.add(mission);
    }

}
