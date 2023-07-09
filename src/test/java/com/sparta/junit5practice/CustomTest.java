package com.sparta.junit5practice;

import org.junit.jupiter.api.*;

public class CustomTest {
    @Test
    @DisplayName("테스트의 내용을 한 눈에 알아볼 수 있도록 네이밍해 줄 때")
    void test1() {
        System.out.println("테스트 내용 빠르게 파악");
    }

    @Nested
    @DisplayName("@Nested: 주제 별로 테스트를 그룹지어서 파악하기 좋습니다.")
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class Test1 {

        @Order(1) // 테스트 순서 지정
        @Test
        @DisplayName("Test1 클래스")
        void test() {
            System.out.println("\nTest1 클래스");
        }

        @Order(3)
        @Test
        @DisplayName("Test1 - test1()")
        void test1() {
            System.out.println("Test1.test1");
        }

        @Order(2)
        @Test
        @DisplayName("Test1 - test2()")
        void test2() {
            System.out.println("Test1.test2");
        }
    }
}
