# 게시판 서비스 클론 코딩 프로젝트

## 개요

자바 + 스프링부트 관련한 기술을 직접 구현하며 체득하기 위한 프로젝트입니다. 일반적인 게시판 서비스에 필요한 기능을 구현했으며, 
처음 진행해보는 프로젝트이다보니 엔티티 설계 및 사용자 인증 구현에 초점을 두었습니다.

## 기능

* 이용자 로그인
* 게시판 조회 정렬 및 페이징
* 게시글 조회, 생성, 수정, 삭제
* 댓글 조회, 생성, 수정, 삭제
* 해시태그 삽입 및 해시태그 검색

## 개발 환경

* Intellij IDEA Ultimate 2022.2.2
* Java 17
* Gradle 7.6
* Spring Boot 2.7.7

## 기술 세부 스택

Spring Boot

* Spring Boot Actuator
* Spring Web
* Spring Data JPA
* Rest Repositories
* Rest Repositories HAL Explorer
* Thymeleaf
* Spring Security
* H2 Database
* MySQL Driver
* Lombok
* Spring Boot DevTools
* Spring Configuration Processor

그 외

* QueryDSL 5.0.0
* Bootstrap 5.2.0-Beta1
* Cloudtype

## 데모 페이지

실사용 테스트를 위해 ThymeLeaf와 BootStrap으로 간단하게 UI를 구현하고, CloudType으로 배포 보았습니다.

* https://port-0-board-clonecoding-project-1luhct24lcjzlhii.gksl2.cloudtype.app/

## 끝으로

스프링부트로 실제 사용가능한 웹 어플리케이션을 제작하면서, 스터디를 통해 책으로 배웠던 DB 연동 및 설정, Spring Security를 사용한 인증 기능 구현, 
운영시 사용할 Spring Actuator 등을 체험하며 배울 수 있었습니다. 그 외에도, 엔티티를 설계하면서 유즈케이스 다이어그램과 ERD를 그려보고, 
또 QueryDsl 을 적용해 JPA로만 생성하기 어려운 복잡한 쿼리를 런타임 에러 없이 사용해 보았습니다.

비록 혼자 진행한 프로젝트이지만, GitHub Issue & Project 탭을 활용해 애자일 방법론의 칸반을 적용해보며 프로젝트 초기에 구현하기로 결정한 요구사항부터, 
구현 도중에 생겼던 문제점들까지 이슈들을 효율적으로 관리해보았습니다.

서비스에 대한 MVP가 구현 완료되며 프로젝트는 1차적으로 마무리되었으나, 앞으로 구현해보고 싶은 것이나 개선 사항이 생기면 다시 돌아와 구현해 볼 예정입니다.