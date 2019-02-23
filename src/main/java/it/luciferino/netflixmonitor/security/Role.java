package it.luciferino.netflixmonitor.security;

import it.luciferino.netflixmonitor.enumerator.RoleEnum;
import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {

    private String role;

    public Role(String role){
        this.role = role;
    }

    public Role(RoleEnum roleEnum){
        this.role = roleEnum.name();
    }

    @Override
    public String getAuthority() {
        return this.role;
    }
}
