package com.movie.data;

public class Movie {
    private String movieName;
    private int moiveId;
    private int ticketPrice;
    private int ticketQuantity;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMoiveId() {
        return moiveId;
    }

    public void setMoiveId(int moiveId) {
        this.moiveId = moiveId;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTicketQuantity() {
        return ticketQuantity;
    }

    public void setTicketQuantity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }

    public Movie(String movieName, int moiveId, int ticketPrice, int ticketQuantity) {
        this.movieName = movieName;
        this.moiveId = moiveId;
        this.ticketPrice = ticketPrice;
        this.ticketQuantity = ticketQuantity;
    }
    public Movie(){
        super();
    }
}
