package com.mysite.sbmission;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor     // 해당 속성을 필요로 하는 생성자가 롬복에 의해 자동 생성된다.
@Getter
public class HelloLombok {

    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로", 5);
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}       // 오류없이 잘 작동한다.