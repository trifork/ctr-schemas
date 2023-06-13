package dk.lmst.ctr.schemas.api.adapters;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateTimeAdapter extends XmlAdapter<String, DateTime> {

    public DateTime unmarshal(String v) throws Exception {
        if (v == null) {
            return null;
        }
        if (v.endsWith("Z")) {
            v = v.substring(0, v.length() - 1) + "+00:00";
        }
        return new DateTime(v);
    }

    public String marshal(DateTime v) throws Exception {
        if (v == null) {
            return null;
        }
        return v.toString();
    }
}
