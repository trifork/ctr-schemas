package dk.lmst.ctr.schemas.api.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

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
