package net.masi.salesianos.actividad.classes;

public class Restaurante {
    private String name;
    private String location;
    private Schedule schedule;
    private String rate;

    public Restaurante(String name, String location, Schedule schedule, String rate) {
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

    public String getRate() {
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

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", schedule=" + schedule.toString() +
                ", rate='" + rate + '\'' +
                '}';
    }

}
