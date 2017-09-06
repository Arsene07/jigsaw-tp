package mission.domain;

import fr.zenika.iki.team.domain.Member;

import java.util.Date;
import java.util.List;

/**
 * Created by melghaouat on 27/08/2017.
 */
public class Mission {
    private int id;
    List<Member> members;
    Client client;
    Date start;
    Date end;
    Type type;

    public Mission(int id, List<Member> members, Client client, Date start, Date end) {
        this.id = id;
        this.members = members;
        this.client = client;
        this.start = start;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}