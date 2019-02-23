package it.luciferino.netflixmonitor.enumerator;

import lombok.Data;


public enum RoleEnum {

    STANDARD(0, "STANDARD", "Standard user"),
    WATCHER(1, "WATCHER", "Watcher user"),
    ADMIN(2, "ADMIN", "Administrator");

    private int value;
    private String message;
    private String description;

    RoleEnum(int value, String message, String description){
        this.value = value;
        this.message = message;
        this.description = description;
    }

}
