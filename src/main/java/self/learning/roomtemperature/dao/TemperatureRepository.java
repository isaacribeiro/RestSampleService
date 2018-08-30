package self.learning.roomtemperature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import self.learning.roomtemperature.model.Temperature;

public interface TemperatureRepository extends JpaRepository<Temperature, Long> {}
