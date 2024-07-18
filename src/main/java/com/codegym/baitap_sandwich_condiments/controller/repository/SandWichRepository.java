package com.codegym.baitap_sandwich_condiments.controller.repository;

import com.codegym.baitap_sandwich_condiments.controller.model.Sandwich;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class SandWichRepository {
    @Repository
    public static class SandwichRepository implements ISandWichRepository {

        private static final List<Sandwich> item = new ArrayList<>();

        static {
            item.add(new Sandwich("Rau xà lách"));
            item.add(new Sandwich("Cà chua"));
            item.add(new Sandwich("Mù tạc"));
            item.add(new Sandwich("Giá đỗ"));
        }


        @Override
        public List<Sandwich> getAll() {
            return item;
        }
    }
}
