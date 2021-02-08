package com.knoldus.deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.knoldus.user.User;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class UDeserializer implements org.apache.kafka.common.serialization.Deserializer<User> {
    @Override public void close() {
    }
    @Override public void configure(Map<String, ?> arg0, boolean arg1) {
    }
    @Override
    public User deserialize(String arg0, byte[] arg1) {
        ObjectMapper mapper = new ObjectMapper();
        User user = null;
        try {
            user = mapper.readValue(arg1, User.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}