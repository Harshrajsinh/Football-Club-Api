package football.rest.apis.serviceImpl;

import football.rest.apis.dao.ClubInfoDao;
import football.rest.apis.entity.Club;
import football.rest.apis.service.ClubInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubInfoImpl  implements ClubInfo {

    @Autowired
    private ClubInfoDao clubInfoDao;

    @Override
    public List<Club> finadAll() {
        return clubInfoDao.findAll();
    }
}
