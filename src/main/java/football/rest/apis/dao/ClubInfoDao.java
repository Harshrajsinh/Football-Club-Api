package football.rest.apis.dao;

import football.rest.apis.entity.Club;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubInfoDao {

    public List<Club> findAll();
}
