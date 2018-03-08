package no.cantara.java.modules.json2.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import no.cantara.java.modules.json2.Thing;
import no.cantara.java.modules.json2.ThingMapper;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class ThingMapperJackson2 implements ThingMapper {
    private static final Logger log = getLogger(ThingMapperJackson2.class);

    private final ObjectMapper objectMapper;

    public ThingMapperJackson2() {
        objectMapper = new ObjectMapper();
    }

    @Override
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
