# Spring boot framework Tutorial

2020-1 웹프로그래밍응용 수업 실습 정리 repository(~05.14, 작성중)

## Lecture 01
2020-05-14

- ### Bean과 ApplicationContext(Spring Contaner)
  - Bean : 의존성 주입(dependency injection, DI)을 위해 Spring framework에서 관리하는 class
  - 모든 Bean은 ApplicationContext상에서 동작. ApplicationContext는 Spring Contaner라고도 부른다.
    등록된 Bean은 Spring Contaner에 의해 인스턴스가 생성되고 주입됨

- ### projectLombok
  offical : [projectLombok.org](projectlombok.org)<br>
  - annotation을 사용해 Setter, Getter, toString()등 자동으로 생성해주는 library<br>

  다운로드 받은 후 jar가 있는 디렉토리에서 cmd에서 다음과 같이 명령어 실행
  ```shell
  java -jar lombok.jar
  ```
  pom.xml에 다음과 같이 dependency 정보 추가
  ```xml
  <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.12</version>
      <scope>provided</scope>
  </dependency>
  ```

- ### Spring 동작 과정
  1. 스프링 컨테이너 생성(ApplicationContext)
  2. root-context.xml의 <context:component-scan>에 정의된 package 스캔
  3. 해당 package에서 annotation @Component이 붙은 class instance 생성(bean)
  4. annotation @Autowire에 의해 생성한 instance를 주입(depndency injection)
