package football.rest.apis.service;

import football.rest.apis.entity.Club;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubInfo {
    List<Club> finadAll();
}
