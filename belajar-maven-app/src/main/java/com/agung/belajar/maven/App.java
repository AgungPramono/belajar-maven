package com.agung.belajar.maven;

import com.agung.belajar.maven.data.Person;
import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Gson gson = new Gson();

        Person person = new Person("Agung");
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
