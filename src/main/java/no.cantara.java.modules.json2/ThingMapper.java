package no.cantara.java.modules.json2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class ThingMapper {
    private static final Logger log = getLogger(ThingMapper.class);
    private final ObjectMapper objectMapper;


    public ThingMapper() {
        objectMapper = new ObjectMapper();
    }

    public String toJson(Thing thing) {
        String json = "{}";
        try {
            json =  objectMapper.writeValueAsString(thing);
        } catch (JsonProcessingException e) {
            log.info("Failed to write thing {} into json. Reason {}", thing, e.getMessage());
        }
        return json;
    }
}
