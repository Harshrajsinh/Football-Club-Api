package football.rest.apis.controller.clubInfoController;


import football.rest.apis.service.ClubInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClubInfoController {


    @Autowired
    private ClubInfo clubInfo;

    @RequestMapping(value = "/findall",method = RequestMethod.GET)
    public String findAll(){
        return  "All Clubs will be returned when Mongo is up and running";
    }
}
