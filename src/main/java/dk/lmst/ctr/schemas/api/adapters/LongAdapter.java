package dk.fmkonline.jaxb.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class LongAdapter extends XmlAdapter<String, Long> {

    @Override
    public Long unmarshal(String s) throws Exception {
        if (s == null) {
            return null;
        }
        return Long.valueOf(s);
    }

    @Override
    public String marshal(Long l) throws Exception {
        return (l == null ? null : String.valueOf(l));
    }

}
