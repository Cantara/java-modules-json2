package no.cantara.java.modules.json2;

import no.cantara.java.modules.json2.mapper.ThingMapperJackson2;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class ThingMapperProxy implements ThingMapper {
    private static final Logger log = getLogger(ThingMapperProxy.class);

    private ThingMapperJackson2 thingMapper;

    public ThingMapperProxy() {
        thingMapper = new ThingMapperJackson2();
    }

    public String toJson(Thing thing) {
        return thingMapper.toJson(thing);
    }
}
