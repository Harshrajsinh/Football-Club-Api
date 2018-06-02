package football.rest.apis.DaoImpl;

import football.rest.apis.dao.ClubInfoDao;
import football.rest.apis.entity.Club;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubInfoDaoImpl implements ClubInfoDao {

    @Override
    public List<Club> findAll() {
        return null;
    }
}
