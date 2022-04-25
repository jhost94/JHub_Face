package com.jhost.template.Face.service.internal;

import com.jhost.template.Face.config.ConfigBean;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class Fetcher<T, ID> {

    private final String coreUrl;

    public Fetcher(ConfigBean configBean) {
        this.coreUrl = configBean.getCoreUrl();
    }

    public List<T> fetchAll(){
        return null;
    }

    public List<T> fetchAll(String pathUrl){
        return null;
    }

    public T fetchById(ID id) {
        return null;
    }

    public T fetchById(String pathUrl, ID id) {
        return null;
    }

    public T save(T entity) {
        return entity;
    }

    public T save(String pathUrl, T entity) {
        return entity;
    }

    public ID delete(T entity) {
        return null;
    }

    public ID delete(String pathUrl, T entity) {
        return null;
    }
}
