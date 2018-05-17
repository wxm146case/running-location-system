package demo.service.impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import demo.model.SimulatorInitLocations;
import demo.service.PathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;


@Service
public class DefaultPathService implements PathService {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public SimulatorInitLocations loadSimulatorInitLocations() {
        final InputStream is = this.getClass().getResourceAsStream("/init-location.json");


        try {
            return objectMapper.readValue(is, SimulatorInitLocations.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException();
        }

    }

}