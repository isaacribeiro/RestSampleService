package self.learning.roomtemperature.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import self.learning.roomtemperature.dao.TemperatureRepository;
import self.learning.roomtemperature.model.Temperature;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TemperatureController {

    @Autowired
    private TemperatureRepository repository;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String getServiceStatus(){
        return "Service is up and running!";
    }

    @RequestMapping(value="/getAll", method=RequestMethod.GET)
    public List<Temperature> getAll(){

        Temperature t1 = new Temperature();
        t1.setId(new Long(1234));
        t1.setTemperature(new Double(12.3));

        /*
        t1.setTimestamp(new LocalDateTime.now());
        return repository.findAll();
        */

        List<Temperature> list = new ArrayList<>();
        list.add(t1);

        return list;
    }

}
