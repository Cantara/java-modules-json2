package no.cantara.java.modules.json2;

import org.skyscreamer.jsonassert.JSONAssert;
import org.slf4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.slf4j.LoggerFactory.getLogger;

public class ThingMapperTest {
    private static final Logger log = getLogger(ThingMapperTest.class);

    private ThingMapper thingMapper;
    private static final String expectedJson = "{\"id\":\"testId\",\"name\":\"test me\",\"tags\":[],\"ownerId\":\"\"}";

    @BeforeMethod
    public void setUp() throws Exception {
        thingMapper = new ThingMapper();
    }

    @Test
    public void testToJson() throws Exception {
        Thing thing = new Thing("testId", "test me");
        String json = thingMapper.toJson(thing);
        log.trace("Json from Thing: {}", json);
        JSONAssert.assertEquals(expectedJson, json,true);

    }
}