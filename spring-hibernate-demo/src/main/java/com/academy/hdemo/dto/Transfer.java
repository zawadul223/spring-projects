package com.academy.hdemo.dto;

public class Transfer {
    public long from;
    public long to;
    public Long balance;

    public Transfer(){

    }
    public Transfer(long from, long to, Long balance) {
        this.from = from;
        this.to = to;
        this.balance = balance;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
