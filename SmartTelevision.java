package com.mystudy.run.inter.exam04;

public class SmartTelevision implements RemoteControl, Searchable{
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
