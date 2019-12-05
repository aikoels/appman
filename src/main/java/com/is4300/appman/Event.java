/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.is4300.appman;

/**
 *
 * @author quinc
 */
class Event {

    public Event(Status status, String message, long time) {
        this.time = time;
        this.message = message;
        this.status = status;
    }

    long time;
    String message;
    Status status;
}
