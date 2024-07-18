package com.codegym.baitap_sandwich_condiments.controller.repository;

import com.codegym.baitap_sandwich_condiments.controller.model.Sandwich;

import java.util.List;

public interface ISandWichRepository {
    List<Sandwich> getAll();
}
