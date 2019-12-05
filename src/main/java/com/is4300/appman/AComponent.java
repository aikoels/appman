/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.is4300.appman;

import static com.is4300.appman.Status.ERROR;
import static com.is4300.appman.Status.SUCCESS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;

/**
 * This is an interface which is used by the applications and infrastructure
 * within AppMan. This holds the very basics for an object which is owned by a
 * user.
 *
 * @author quinc
 */
public abstract class AComponent {

    private Map<String, String> config;
    private ComponentType type;
    private User owner;
    private Status status;
    private List<Event> log;

    /**
     * Creates AComponent using the supplied configuration and logs the
     * creation.
     *
     * @param owner
     * @param type
     */
    public AComponent(User owner, ComponentType type) {
        this.log = new ArrayList();
        try {
            //Successful Creation
            this.type = type;
            this.config = new HashMap<>();
            this.owner = owner;
            this.status = SUCCESS;
        } catch (Exception e) {
            //Error in Creation
            this.status = ERROR;
            this.log.add(new Event(ERROR, e.getMessage(), System.currentTimeMillis()));
        }
    }

    /**
     * Sets the specified component in the config. Logs an error if it cannot
     * set that component.
     *
     * @param key - The key for the config value
     * @param value - the value to set the config to.
     */
    protected void setConfig(String key, String value) {
        try {
            this.config.put(key, value);
        } catch (Exception e) {
            //Error in setting config
            this.status = ERROR;
            this.log.add(new Event(ERROR, e.getMessage(), System.currentTimeMillis()));
        }
    }

    /**
     * Returns a JFrame representing this object. WindowSize determines which
     * type of window (tiny box, medium size popup, etc).
     *
     * @param size
     * @return JFrame showing this object
     */
    protected JFrame frame(WindowSize size) {
        //TODO: Currently a stub. Implement.

        return null;
    }
}
