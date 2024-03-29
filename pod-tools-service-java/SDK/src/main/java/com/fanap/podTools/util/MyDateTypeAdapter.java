package com.fanap.podTools.util;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by A.Rokni
 * on Wed, 23 January 2019 at 3:48 PM.
 */
public class MyDateTypeAdapter extends TypeAdapter<Date> {

    @Override
    public void write(JsonWriter out, Date value) throws IOException {
        if (value == null)
            out.nullValue();
        else
            out.value(value.getTime());
    }

    @Override
    public Date read(JsonReader in) throws IOException {
        if (in != null) {
            if (in.peek().equals(JsonToken.NUMBER)) {

                return new Date(in.nextLong());

            }
        }
        return null;
    }
}