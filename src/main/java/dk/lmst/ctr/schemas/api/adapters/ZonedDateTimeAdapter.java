package dk.fmkonline.jaxb.adapters;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

/**
 * A jaxb adapter that only accepts dateTimes with a timezone 
 */
public class ZonedDateTimeAdapter extends XmlAdapter<String, ZonedDateTime> {

    public ZonedDateTime unmarshal(String zonedDateTimeString) throws Exception {
        if (zonedDateTimeString == null) {
            return null;
        }
        return ZonedDateTime.parse(zonedDateTimeString);
    }

    public String marshal(ZonedDateTime zonedDateTime) throws Exception {
        if (zonedDateTime == null) {
            return null;
        }
        return zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}
