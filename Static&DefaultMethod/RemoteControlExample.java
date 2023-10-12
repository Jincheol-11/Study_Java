package com.mystudy.run.inter.exam03;

import com.mystudy.run.inter.exam02.Audio;
import com.mystudy.run.inter.exam02.RemoteControl;
import com.mystudy.run.inter.exam02.Television;

public class RemoteControlExample2 {
    public static void main(String[] args) {
        //인터페이스 변수 선언
        RemoteControl rc;

        //TELEVISION 객체를 생성하고 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        //디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        //Audio 객체를 생성하고 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        //디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        //정적 메소드 호출
        com.mystudy.run.inter.exam03.RemoteControl.changeBattery();
    }
}
