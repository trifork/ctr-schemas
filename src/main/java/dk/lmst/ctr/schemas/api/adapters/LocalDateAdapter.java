package dk.lmst.ctr.schemas.api.adapters;

import org.joda.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    public LocalDate unmarshal(String v) throws Exception {
        if (v == null) {
            return null;
        }
        if (v.endsWith("Z")) {
            v = v.substring(0, v.length() - 1);
        }
        return new LocalDate(v);
    }

    public String marshal(LocalDate v) throws Exception {
        if (v == null) {
            return null;
        }
        return v.toString();
    }

}
