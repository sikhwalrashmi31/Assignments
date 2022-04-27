package com.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springrest.entities.zipcode;

@Component
public class zipcodeService {

    private static List<zipcode> list = new ArrayList<zipcode>();

    static {
        list.add(new zipcode(99501, "AK", "ANCHORAGE", "US"));
    }

    public zipcode getzipcodeByzipcode(int zipcode) {

        return list.stream().filter(z -> z.getZipcode() == zipcode).findFirst().get();
    }

    public List<zipcode> getAll() {
        return list;
    }

}