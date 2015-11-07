package model;

import java.util.Set;

public class Proposal {
    private Integer id;
    private String name;
    private Status status;
    private double price;
    private Employee employee;
    private Set<Offer> offer;
}
