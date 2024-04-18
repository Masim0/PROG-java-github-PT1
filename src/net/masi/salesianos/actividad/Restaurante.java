package net.masi.salesianos.actividad;

public class Restaurante {
    private String name;
    private String location;
    private Schedule schedule;
    private double rate;

    public Restaurante(String name, String location, Schedule schedule, double rate) {
        this.name = name;
        this.location = location;
        this.schedule = schedule;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public double getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
