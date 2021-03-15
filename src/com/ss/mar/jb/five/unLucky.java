package com.ss.mar.jb.five;

import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

public class unLucky implements TemporalQuery<Boolean> {
    @Override
    public Boolean queryFrom(TemporalAccessor temporal) {
        return ((temporal.get(ChronoField.DAY_OF_MONTH) == 13) && (temporal.get(ChronoField.DAY_OF_WEEK) == 5));
    }
}
