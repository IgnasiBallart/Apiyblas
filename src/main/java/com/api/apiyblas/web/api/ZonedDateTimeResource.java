package com.api.apiyblas.web.api;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * Created by iballart on 12/12/18.
 */
public class ZonedDateTimeResource implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private ZonedDateTime dateTime;

    protected ZonedDateTimeResource(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public String getZone() {
        return dateTime.getZone().getId();
    }
}
