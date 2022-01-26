package com.java2s.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.LinkedHashMap;
import java.util.Map;


@ManagedBean
@ViewScoped
public class HelloWorld {

    private User user;

    private Map<String, Object> country = new LinkedHashMap<String, Object>(){{
        put("Pakistan", "PK"); //label, value
        put("United State", "USA");
        put("India", "IN");
        put("Bangladesh", "BG");
        put("England", "EN");
        put("United Arab Emarate", "UAE");
    }};
//we use user class here to make bean or also called POJO
    public HelloWorld() {
        user = new User();
    }
//CheckUserObject is use to check the object(is it empty or null) or there is any data, in frontend we use listener for it in index.xhtml
    public void checkUserObject(){
        System.out.println(user.getName());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<String, Object> getCountry() {
        return country;
    }

    public void setCountry(Map<String, Object> country) {
        this.country = country;
    }
}
