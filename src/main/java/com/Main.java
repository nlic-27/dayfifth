package com;

import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        people.setId(1);
        people.setName("林黛玉");
        people.setSex("女");

        Matter matter = new Matter();
        matter.setId(1);
        matter.setName("黛玉葬花");

        Things things = new Things();
        things.setId(1);
        things.setName("花");

        System.out.println(people);
        System.out.println(matter);
        System.out.println(things);
    }
}
