# ☕ 자바 프로그래밍 기말고사 실기 요약집

> 📅 기말고사를 위해 무조건 외워야 하는 뼈대 코드와 핵심 개념 정리집입니다.

## 🔍 빠른 바로가기
* 📅 [1일차: 인터페이스와 구현](#1일차-인터페이스와-구현-week-09)
* 📅 [2일차: 인터페이스와 예외 클래스](#2일차-인터페이스와-예외-클래스-week-10)
* ⚠️ [예외 클래스 요약](#-예외-클래스-exception-class)
* 📅 [3일차: 제네릭 클래스](#3일차-제네릭-클래스-week-11)
* 📅 [4일차: 기본 API 및 Object, 컬렉션 프레임워크, 익명 클래스/람다식](#4일차-기본-api-및-object-컬렉션-프레임워크-익명-클래스람다식week12)
* 📅 [5일차: 컬렉션 & 유틸리티](#5일차-hashset-hashmap-collections-유틸리티-기능)
* [📅 15주차. 주차별 전체 핵심 개념 요약](#-15주차-주차별-전체-핵심-개념-요약)
---
## 1일차: 인터페이스와 구현 (Week 09)

### 📌 개념 및 요약
* **인터페이스(Interface):** 클래스를 만들기 위한 **설계도**. 내부 코드에 매개변수나 여러 변수 선언이 가능함.
* **구현(Implement):** 설계도를 바탕으로 실제 기능을 채워 넣는 것.
* **상수 선언:** 인터페이스 내 변수는 자동으로 `public static final`이 되므로 상수는 대문자로 선언하며, `String`으로 여러 변수를 동시에 선언할 수 있음.
* **default 메서드:** 인터페이스가 `default` 키워드를 가질 때만 `{}` 블록(몸체)을 가질 수 있음.
* **static**
> Static 멤버: 프로그램이 실행될 때(클래스가 메모리에 로드될 때) Method(메서드) 영역/Static 영역에 딱 한 번만 메모리가 할당됩니다. 그리고 프로그램이 종료될 때까지 메모리에 계속 남아있습니다.
이 때문에 static이 붙은 변수나 메서드는 객체를 생성(new)하지 않고도 클래스명.멤버명으로 바로 사용할 수 있습니다.
* **접근자 (Getter)** : 안쪽에 있는 데이터를 "가져오는(Get)" 창구입니다. (예: "내 지갑에 얼마 있는지 확인만 해줘")

* **설정자 (Setter)** : 안쪽에 있는 데이터를 "변경하는(Set)" 창구입니다. 그냥 바꾸는 게 아니라, 이상한 데이터가 들어오지 못하게 검사하는 문지기 역할을 해요. (예: "내 나이를 -5살로 바꾼다고? 그건 안 돼! 올바른 값만 입력해")
* **생성자와 메안메서드 차이점**
  
| 구분 | 생성자 (Constructor) | 메인 메서드 (Main Method) |
| :--- | :--- | :--- |
| **목적** | 객체(인스턴스)가 처음 태어날 때 초기화하기 위함 | 프로그램의 시작 버튼을 누르기 위함 |
| **이름** | 클래스 이름과 똑같아야 함 | 무조건 `main`이어야 함 |
| **리턴 타입** | 아예 없음 (`void`도 안 적음) | `void` (리턴 값이 없음) |
| **호출 시점** | `new 클래스명()` 할 때 자동으로 실행됨 | 프로그램이 실행될 때 가장 먼저 딱 한 번 실행됨 |
  
반환값이 없고 클래스 이름 이어야함

* **상속과 인터페이스의 차이점**
* 
| 구분 | 상속 (`extends`) | 인터페이스 (`implements`) |
| :--- | :--- | :--- |
| **핵심 개념** | **개념적 연결 (IS-A 관계)**<br>"~은 ~의 일종이다" | **기능적 연결 (CAN-DO 관계)**<br>"~을 할 수 있다" |
| **목적** | 부모의 코드를 그대로 **재사용**하고 기능을 확장하기 위함 | 동일한 **동작 규칙(규격)**을 강제하여 교체가 가능하게 만들기 위함 |
| **다중 구현** | **단 하나의 클래스만** 상속 가능 (단일 상속) | **여러 개의 인터페이스를 동시에** 구현 가능 (다중 구현) |
| **기본 상태** | 부모가 이미 완성해 둔 변수와 메서드를 물려받음 | 알맹이 없는 껍데기(추상 메서드)만 받아서 내가 직접 완성해야 함 |  

* ### 📂 자바 주요 자료구조 및 디자인 패턴 요약
종류 (도구) | 핵심 규칙 (메커니즘) | 주요 메서드 세트 | 주요 활용 사례 | 비유 |
| :--- | :--- | :--- | :--- | :--- |
| **Iterator**<br>(반복자) | 안전한 순회 및 탐색 | `hasNext()`, `next()`, `remove()` | 컬렉션 내부 데이터 안전하게 꺼내기 | 데이터 주머니 전용 돋보기 |
| **Queue**<br>(큐) | 선입선출 (FIFO)<br>먼저 온 데이터가 먼저 나감 | `offer()`, `poll()`, `peek()` | 은행 번호표, 프린터 인쇄 대기열 | 맛집 줄 서기 |
| **Stack**<br>(스택) | 후입선출 (LIFO)<br>마지막 데이터가 먼저 나감 | `push()`, `pop()`, `peek()` | 브라우저 뒤로가기, `Ctrl + Z` | 프링글스 통, 접시 쌓기 |
| **Map**<br>(맵) | 키-값 (Key-Value) 쌍 보관 | `put()`, `get()`, `containsKey()` | 사전, 로그인 정보(ID-PW) 저장 | 이름표 붙은 개인 서랍장 |
| **Stream**<br>(스트림) | 컨베이어 벨트식 데이터 가공 | `filter()`, `map()`, `collect()` | 대량 데이터 필터링 및 변환 연산 | 공장 컨베이어 벨트 |
| **Observer**<br>(옵저버) | 이벤트 기반 실시간 알림 | `subscribe()`, `publish()`, `onNext()` | 실시간 채팅, 주식 시세 변동 알림 | 유튜브 채널 알람 설정 |


### 💡 핵심 뼈대 코드
```java
public interface ICalculator {
    String PLUS = "plus",String MINUS = "minus",String MULTIPLE = "multiple"; 
    public int plus(int i,int j);
	public int minus(int i,int j);
    //추상 메서드이기 때문에 구현 클래스에서 반드시 구현해야하
    //*예시 {
    int result = i + j;        // 구체적인 로직 (구현의 일부)
    return result;}             // 최종 결과 반환 (구현의 마무리)
    * //

    default int multiple(int i, int j) { 
        return i * j;
    }

    private static void initMessage(String opt) {  
        System.out.println(opt + "시작합니다~~~~");
    }
    public static int exec(String opt,int i,int j) {
        //static이기 때문에 객체 생성 가능
		//객체를 따로 생성(new)하지 않아도 ICalculator.exec(...) 형태로 어디서나 바로 호출할 수 있는 정적 메서드입니다. 
		//어떤 연산(opt)을 할지, 어떤 숫자들(i, j)을 가지고 계산할지 제어하는 컨트롤러 역할을 합니다.
		// TODO Auto-generated method stub
	initMessage(opt);
	CalculatorImpl cal=new CalculatorImpl();
	int retVal=0;
}
```
## 2일차: 인터페이스와 예외 클래스 (Week 10)
### 간단 개념정리
* **📌 간단 개념정리**
* 기본 구조: 구현 클래스 선언 시 자식 클래스가 앞에 오고 implements 뒤에 인터페이스가 위치함.
* 우선순위: main 메서드는 프로그램 실행 시 누구보다 먼저 실행됨.

* 접근 제어자,접근 범위
* public,어디서든 전부 접근 가능
* protected,같은 패키지 + 자식 클래스까지 접근 가능
* default,같은 패키지 내부에서만 접근 가능
* private,해당 클래스 내부에서만 접근 가능

**⚙️ 메서드 타입 구분**
* 일반/디폴트 메서드: 설계도를 바탕으로 만들어진 '제품(객체)' 소속. 즉, TV나 에어컨 같은 객체를 직접 생성해야만 turnOn()이나 repair()를 누를 수 있음.
* 정적(static) 메서드: 제품이 아니라 '설계도(인터페이스) 자체' 소속. 공통으로 써야 하는 도우미(Utility) 역할이며, 객체 생성 없이 인터페이스명.메서드명()으로 바로 사용 가능함.

**개념,설명,특징**
* 오버라이딩 (Overriding),부모의 기능을 자식이 새롭게 덮어쓰기 (업그레이드),@Override: 오타나 실수하지 않도록 컴퓨터가 미리 검사해 주는 안전벨트(알림 마크)
* 오버로딩 (Overloading),새로 추가하기 (같은 이름으로 여러 개 만들기),매개변수의 타입이나 개수가 달라야 함

### 💡 인터페이스의 핵심 뼈대 코드
```java
// 1. 인터페이스 구현 클래스 선언
public class Computer implements Controllable { 
    // 구현 코드 생략
}

// 2. 정적(static) 메서드 선언 및 호출 예시
interface Controllable {
    static void reset() {
        System.out.println("장비를 초기화한다");
    }
}
// 호출 시: Controllable.reset();

// 3. 다형성, 업캐스팅, 다운캐스팅 활용
public class Main {
    public static void main(String[] args) {
        Controllable[] controllable = { new TV(), new Computer() }; 

        for (Controllable c : controllable) { 
            printObj(c); 
        }

        if (controllable[0] instanceof TV) { 
            TV v = (TV) controllable[0]; 
            v.remoteOn();
            v.remoteOff();
        }
    }

    void printObj(Controllable c) { 
        c.turnOn();
        c.turnOff();
        c.repair();
    }
}
```
**⚠️ 예외 클래스 (Exception Class)**
**📌 개념 요약**
구조: try와 catch는 무조건 한 세트로 사용됨.
래퍼 클래스(Wrapper Class): int, char, double, boolean 등의 기본 데이터 타입들을 객체화하기 위해 사용하며, 정수형은 Integer를 사용함.
메서드: Integer.parseInt()는 문자열을 int형으로 변환해 줌.

**🚫 주요 예외 종류 (모두 catch와 세트)**
* Exception: 모든 에러의 조상 (어떤 에러 종류든 최상위에서 다 잡아낼 수 있음)
* ArrayIndexOutOfBoundsException: 배열의 인덱스 범위를 벗어나는 에러
* ArithmeticException: 수학적인 계산 오류 (예: 0으로 나누는 경우 등)

**🧼 finally {} 블록**
* in.close() 등을 내부에 넣어 자원을 반납할 수 있으며, 예외 발생 여부와 상관없이 마지막에 무조건 딱 한 번 실행됨.
* 보통 데이터베이스 연결을 끊거나, 열어두었던 메모리 파일들을 안전하게 닫아줄 때 사용함.

**💻 예외 처리 예시 코드**
* 호출 및 실행부 (예외 처리 담당 - "사장님 역할"): try 블록에서 문제를 감지하면 catch 블록이 넘겨받아 안전하게 처리하고 자원을 닫음.
* 메서드 정의부 (예외 발생 지점 - "매니저님 역할"): 실제로 하고 싶은 동작을 수행하되, 발생한 예외의 위험성을 내포하고 있음.


### 💡 예외클래스의 핵심 뼈대 코드
```java
try {
    td.square(in.nextLine()); 
} catch (Exception e) { 
    System.out.println("양도된 예외를 처리하고 있어요!"); 
    in.close();
}

// 메서드 정의부
private void square(String s) {
    int n = Integer.parseInt(s); 
    System.out.println(n * n);   
}
```
---
## 3일차: 재네릭 클래스 (Week 11)
### 📌 개념 및 요약
**1. 제네릭(Generic) 클래스란?**
제네릭 클래스는 "타입(자료형)을 미리 정해두지 않고, 나중에 쓸 때 결정하는 만능 상자"
제네릭을 쓰면 상자 하나만 만들어 두고 필요할 때마다 타입을 갈아 끼울 수 있습니다.

비유: 구멍이 뚫려있는 '붕어빵 틀'입니다.

코드 예시: <T> 같은 빈 이름표를 붙여두고, 객체를 만들 때 Box<String>, Box<Integer>처럼 실제 타입을 꽂아 씁니다.
<br>
**생성자(Constructor)란?**
생성자는 "객체(인스턴스)가 처음 태어날 때 무조건 호출되는 변수 초기화 전용 메서드"입니다.

우리가 new 클래스명()을 하는 순간 이 생성자가 자동으로 실행.필수 데이터들을 세팅(초기화)하는 역할을 합니다.

비유: 스마트폰 공장에서 제품이 처음 출고될 때, 기본 언어는 한국어, 배경화면은 기본 이미지로 '초기 세팅'되어서 나오는 것과 같습니다.

특징: 1. 클래스 이름과 똑같이 생겼습니다.
2. 반환 타입(void, int 등)이 아예 적혀있지 않습니다.

**super()**
super()는 "나를 만들어준 부모 클래스의 생성자를 호출하는 명령"입니다.

자바에서 자식 객체가 태어나려면, 부모 객체가 먼저 메모리에 태어나야 합니다. 자식 생성자의 맨 첫 줄에는 눈에 보이지 않아도 항상 super()가 자동으로 들어가 있어서 부모를 먼저 깨웁니다.(ex 엄마 먼저 일어나)

| 구분 | 기초 타입 (Primitive Type) | 클래스 타입 (Reference / Wrapper Type) |
| :--- | :--- | :--- |
| **개념** | 오직 값 자체만 저장하는 가볍고 단순한 타입 | 데이터뿐만 아니라 **기능(메서드)**까지 포함하는 객체 타입 |
| **종류** | `int`, `double`, `boolean`, `char` 등 (소문자로 시작) | `Integer`, `Double`, `Boolean`, `String` 등 (대문자로 시작) |
| **특징** | 메모리 효율이 좋고 아주 빠름. | `null`을 가질 수 있고, 다양한 기능(메서드)을 제공함. |
| **제네릭** | `< >` 안에 절대 들어갈 수 없음! ❌ | `< >` 안에 들어갈 수 있음! ⭕ |    

---

## 4일차: 기본 API 및 Object, 컬렉션 프레임워크, 익명 클래스/람다식(week12)

## 📅 Java 12주차 실습 핵심 개념 총정리 (테마 1, 2, 3 전체)

📅 Java 12주차 실습 핵심 개념 총정리
12주차 실습에서 다룬 자바 중급 과정의 3대 핵심 테마(기본 API 및 Object, 컬렉션 프레임워크, 익명 클래스/람다식)에 대한 상세 정의, 사용법, 실습 코드 분석 문서입니다.

**📂 테마 1: 자바의 뿌리 클래스들과 데이터 변환**
관련 파일: Keyboard.java, ObjectMethodDemo.java, WrapperDemo.java, StringTokenizerDemo.java

1. Object 클래스와 오버라이딩 (toString, equals)
개념 및 정의: 자바의 모든 클래스가 예외 없이 자동으로 상속받는 최상위 대장 클래스입니다. 이 안에 객체를 문자열로 표현하는 toString()과 객체의 내용이 같은지 비교하는 equals()가 기본 정의되어 있습니다.

사용법: 부모인 Object가 준 메서드의 기본 기능(주소값 비교 등)이 내 클래스의 목적에 맞지 않으면 자식 클래스에서 재정의(@Override)해서 씁니다.

실습 코드 기반 예시 (Keyboard.java & ObjectMethodDemo.java):

```java
public class Keyboard {
    String name;

    public Keyboard(String name) {
        this.name = name;
    }

    // 1) toString 오버라이딩: 주소값 출력 대신 내가 지정한 문장이 나오게 만듦
    @Override
    public String toString() {
        return "키보드입니다.";
    }

    // 2) equals 오버라이딩: 주소가 달라도 '모델 이름(name)'이 같으면 같은 객체로 판정
    @Override
    public boolean equals(Object obj) {
        // obj는 자바의 모든 객체를 다 담을 수 있는 최상위 만능 그릇(변수 이름)입니다.
        if(obj instanceof Keyboard) { // 1. 들어온 손님의 본질이 Keyboard인지 검사
            Keyboard k = (Keyboard) obj; // 2. 맞다면 Keyboard로 옷을 갈아입힘(다운캐스팅)
            if(name.equals(k.name)) return true; // 3. 진짜 알맹이 이름이 같으면 true!
        }
        return false; // 키보드가 아니거나 이름이 다르면 false!
    }
}
```

2. 래퍼 클래스 (Wrapper Class) & 오토 박싱/언박싱
개념 및 정의: int, double 같은 기초 타입은 가볍고 빠르지만 객체가 아니라서 제네릭이나 만능 주머니(Collection)에 넣을 수 없습니다. 이를 해결하기 위해 기초 타입을 객체 상자 형태로 포장해 놓은 클래스들을 래퍼 클래스라고 합니다. (Integer, Double, Float 등)

사용법 및 예시 (WrapperDemo.java 기반):

```java
Integer bi1 = new Integer(10); // 정석대로 상자에 10을 포장하는 방법 (구버전 방식)

Integer bi2 = 20;  // ⭕ 오토 박싱: 기본 정수(20)를 Integer 객체 상자에 자동으로 포장해 줌
int i2 = bi2 + 20; // ⭕ 오토 언박싱: Integer 상자에서 자동으로 기본 정수를 꺼내서 더해 줌

// 💡 실무 필수 변환 기능들
String s1 = Double.toString(3.14); // 숫자 3.14를 문자열 "3.14"로 변환
Float pi = Float.parseFloat("3.14"); // 문자열 "3.14"를 진짜 소수 3.14 타입으로 변환
Integer bi3 = Integer.valueOf("11", 16); // 16진수 문자열 "11"을 10진수 정수(17)로 변환
```

3. StringTokenizer
개념 및 정의: 긴 문자열을 개발자가 지정한 특수 기호(구분자, Delimiter)를 기준으로 톡톡 끊어서 조각(토큰, Token)으로 분리해 주는 편리한 문자열 처리 도구입니다.

사용법 및 예시 (StringTokenizerDemo.java 기반):

```java
String s = "of the peple,by the peple, for the peple";
StringTokenizer st = new StringTokenizer(s, ","); // 콤마(,)를 기준으로 자르겠다!

System.out.println(st.countTokens()); // 현재 잘린 조각이 총 몇 개인지 확인 (결과: 3)

while(st.hasMoreTokens()) { // 다음 꺼낼 조각이 남아있는 동안 무한 반복 (true/false)
    System.out.print("[" + st.nextToken() + "]"); // 조각을 하나씩 꺼내옴
}

// 출력 결과: [of the peple][by the peple][ for the peple]
```

---

📂 테마 2: 자료구조와 만능 주머니 (컬렉션 프레임워크)
관련 파일: ArrayListDemo.java, ListDemo.java, IteratorDemo.java, PerformanceDemo.java

1. List 인터페이스와 ArrayList
개념 및 정의: 크기가 한 번 정해지면 바꿀 수 없는 일반 배열의 단점을 극복하기 위해 만든, 스스로 크기를 늘렸다 줄였다 하는 만능 주머니입니다. 순서가 엄격하게 유지되며, 데이터의 중복을 허용합니다.

사용법 및 예시 (ArrayListDemo.java 기반):

```java
// List.of로 고정된 리스트 만들기
List<String> list = List.of("그랜저", "소나타", "아반테", "제네시스", "소울");
System.out.println(list.indexOf("소나타")); // "소나타"가 몇 번째 방에 있는지 검색 (결과: 1)
System.out.println(list.contains("싼타페")); // "싼타페"를 가지고 있는지 확인 (결과: false)

// 진짜 자유롭게 편집 가능한 ArrayList 진짜 주머니 생성!
List<String> cars1 = new ArrayList<>(list);
cars1.add("싼타페");      // 주머니 맨 뒤에 데이터 추가
cars1.remove("제네시스"); // 주머니에서 특정 데이터 삭제

// 💡 현대적인 고급 메서드 기능들 (람다식 결합)
cars1.removeIf(c -> c.startsWith("소")); // "소"로 시작하는 자동차("소나타", "소울") 싹 다 지우기
cars1.replaceAll(s -> "뉴" + s);        // 남은 모든 자동차 앞에 "뉴" 글자 붙여서 교체하기
cars1.forEach(s -> System.out.print(s + " ")); // 하나씩 꺼내서 전부 출력하기
```

2. Arrays.asList의 한계점
개념 및 정의: 일반 배열을 리스트 구조로 빠르게 변환해 주는 아주 유용한 기능이지만, 이렇게 만든 리스트는 고정된 배열의 성질을 그대로 가지고 있어서 방의 크기를 바꿀 수 없습니다.

사용법 및 예시 (ListDemo.java 기반):

```java
String[] animals1 = {"사슴", "호랑이", "바다표범", "곰"};
List<String> animals2 = Arrays.asList(animals1); // 배열을 리스트로 변경

animals2.set(1, "앵무새"); // ⭕ 방의 내용을 수정하는 것은 가능!
// animals2.add("늑대");   // ❌ 에러 발생! 방의 개수를 늘리는 추가(add)나 삭제(remove)는 절대 불가능!
```

3. Iterator (반복자)
개념 및 정의: 주머니(Collection) 속에 들어있는 대량의 데이터들을 "처음부터 끝까지 안전하고 순서대로 하나씩 꺼내 가도록 돕는 전용 빨대/통로"입니다.

사용법 및 예시 (IteratorDemo.java 기반):

```java

Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");
Iterator<String> iterator = list.iterator(); // 주머니 전용 반복자(빨대)를 꽂음

while(iterator.hasNext()) { // 1. 다음 칸에 데이터가 아직 들어있니? 물어봄 (true/false)
    System.out.print(iterator.next() + "-"); // 2. 있으면 그거 꺼내오고 화살표를 다음 칸으로 이동!
}
// 출력 결과: 다람쥐-개구리-나비-
```

4. ArrayList vs LinkedList 성능 비교
개념 및 정의: 둘 다 똑같이 데이터를 담는 List 주머니이지만, 내부 방 구조가 다릅니다.

ArrayList: 방들이 메모리에 연속으로 다닥다닥 붙어있음.

LinkedList: 방들이 기차 칸처럼 고리(주소)로 앞뒤 연결되어 있음.

성능 분석 (PerformanceDemo.java 기반):

주머니 맨 앞에 새로운 데이터를 10만 개 집어넣는 상황일 때:

ArrayList는 새 데이터를 맨 앞에 넣을 때마다 기존에 있던 모든 방을 한 칸씩 뒤로 밀어내야 해서 연산 속도가 엄청나게 느려집니다 (a1.add(0, i)).

LinkedList는 기존 방들을 건드릴 필요 없이 기차 맨 앞에 새 기차 칸 하나만 툭 연결해 주면 끝이라서 속도가 압도적으로 빠릅니다 (l1.addFirst(i)).

---

📂 테마 3: 코드를 극단적으로 줄이는 마법 (익명 클래스와 람다식)
관련 파일: AnanymouseEx.java, FuntionalIntEx.java

1. 익명 클래스 (Anonymous Class)
개념 및 정의: 인터페이스를 원래 사용하려면 반드시 새로운 자식 클래스 파일을 만들어서 구현해야 합니다. 하지만 딱 한 번만 대충 쓰고 버릴 일회용 클래스라면, 귀찮게 새 파일을 만들지 않고 new 하는 그 자리에서 이름 없이 즉석으로 코드를 채워 만드는 기법입니다.

사용법 및 예시 (AnanymouseEx.java 기반):

```java
interface MyInterface {
    void printMsg(String msg);
}

public class AnanymouseEx {
    public static void main(String[] args) {
        // 인터페이스는 원래 new를 못 하지만, 뒤에 중괄호{}를 붙여 즉석에서 구현하면 new가 가능해집니다!
        MyInterface obj = new MyInterface() {
            @Override
            public void printMsg(String msg) {
                System.out.println(msg); // 이름 없는 일회용 알맹이 채우기
            }
        }; // ⚠️ 하나의 대입 문장이 끝나는 구간이므로 중괄호 끝에 세미콜론(;) 필수!

        obj.printMsg("Hello"); // 호출해서 사용
    }
}
```

2. 함수형 인터페이스와 람다식 (Lambda)
개념 및 정의: 자바의 최신 문법으로, 메서드가 단 1개만 있는 인터페이스(@FunctionalInterface)일 때 위에서 배운 익명 클래스의 구구절절 길었던 코드(new, public void 등)마저 다 생략하고 화살표(->) 하나로 핵심 기능(로직)만 표현하는 마법 같은 코드 압축 기술입니다.

사용법 및 예시 (FuntionalIntEx.java 기반):

```java
@FunctionalInterface // 자바 컴파일러에게 "이거 메서드 딱 1개짜리 함수형 인터페이스야"라고 알림
interface Funcinter {
    public abstract int max(int a, int b);
}

public class FuntionalIntEx {
    public static void main(String[] args) {
        // [람다식 구현] 자바가 인터페이스 구조를 보고 타입을 다 자동 추론하므로 
        // (매개변수) -> {실행코드} 공식에 맞춰 핵심만 적습니다.
        Funcinter f = (a, b) -> a > b ? a : b; // 삼항연산자로 더 큰 수를 반환하는 로직

        System.out.println(f.max(10, 20)); // 결과: 20
    }
}
```

🛠️ 12주차 전체 실습 클래스들의 총체적인 연관성 정리
이번 12주차 코드들은 서로 다른 기능 같지만, 실은 자바의 객체 다루기 능력을 극대화하기 위해 톱니바퀴처럼 맞물려 있습니다.

1. Wrapper 클래스(Integer 등)의 탄생 배경과 Collection 주머니의 연관성
자바의 ArrayList나 LinkedList 같은 자료구조 주머니들은 무조건 객체(클래스 타입)만 담을 수 있게 설계되어 있습니다.
따라서 PerformanceDemo에서 숫자 10만 개를 주머니에 넣을 때 기초 타입 int가 아니라 Wrapper 클래스인 Integer 형태로 주머니 (ArrayList<Integer>)에 쏙쏙 박싱되어 들어갈 수 있었던 것입니다.

2. Collection 주머니와 최신 람다식 기술의 결합
대량의 데이터를 ArrayList에 담아놓고 하나씩 꺼내 쓰거나 조건별로 지우려고 할 때 과거에는 Iterator 빨대를 꽂아 while문을 길게 돌려야 했습니다. (IteratorDemo 방식)
하지만 12주차의 최종 진화형인 람다식 문법을 결합하면서, cars1.removeIf(c -> c.startsWith("소"))나 cars1.forEach(s -> System.out.print(s)) 처럼 수십 줄짜리 반복 제어 코드를 단 한 줄로 압축하여 컬렉션 데이터를 제어할 수 있게 연결됩니다.

---

## 5일차: HashSet, HashMap, Collections 유틸리티 기능

### 13주차 실습에서 다룬 자바 중급 과정의 핵심 테마(HashSet, HashMap, Collections 유틸리티 기능)에 대한 상세 정의, 사용법, 실습 코드 복원 및 분석 문서입니다.

---

**📂 테마 1: 중복을 허용하지 않는 주머니 (Set 계열)**
관련 파일: HashSet1Demo.java, Fruit.java, HashSet2Demo.java

**1. HashSet의 기본 특징과 활용**
개념 및 정의: List와 달리 데이터의 저장 순서를 유지하지 않으며, 결정적으로 중복된 데이터를 절대 허용하지 않는 자료구조 주머니입니다.

사용법: 값의 존재 여부를 빠르게 확인하거나, 대량의 데이터에서 중복을 자동으로 제거할 때 주로 사용합니다.

실습 코드 분석 및 예시 (HashSet1Demo.java 복원):

```Java
package week13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet1Demo {
    public static void main(String[] args) {
        // 1단계: HashSet 객체 생성 및 데이터 추가
        Set<String> fruits = new HashSet<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("포도");
        fruits.add("수박");
        
        // 동일한 데이터("사과")를 또 넣으려고 하면 알아서 중복을 걸러냄 (무시됨)
        fruits.add("사과"); 
        System.out.println("1단계 결과 (중복 제거) : " + fruits);

        // 특정 데이터 삭제 및 존재 여부 확인 (contains)
        fruits.remove("수박");
        System.out.println("수박이 포함되어 있나? " + fruits.contains("수박"));
        System.out.println("현재 주머니 크기(size): " + fruits.size());

        // 2단계: 다른 컬렉션(List)을 이용해 또 다른 HashSet 생성
        List<String> list = Arrays.asList("포도", "수박", "키위");
        Set<String> h2 = new HashSet<>(list);
        System.out.println("2단계 결과 : " + h2);

        // addAll: 두 주머니 알맹이를 통째로 합치기 (합집합, 중복은 자동 제거)
        fruits.addAll(h2);
        System.out.println("3단계(addAll) 결과 : " + fruits);

        // clear & isEmpty: 주머니 통째로 비우기 및 비어있는지 확인
        fruits.clear();
        System.out.println("주머니가 비어있나? " + fruits.isEmpty());
    }
}
```

**2. 사용자 정의 객체와 중복 판정 (equals, hashCode)**
개념 및 정의: 자바 시스템이 만든 String은 "사과"라는 글자가 같으면 같은 데이터라고 판정하지만, 내가 직접 만든 클래스(Fruit)는 내부 알맹이 글자가 같아도 메모리 주소가 다르면 자바가 서로 다른 데이터로 인식하여 HashSet에 중복으로 들어갑니다.

사용법 및 해결책: 클래스 내부에서 부모인 Object가 물려준 equals()와 hashCode()를 반드시 세트로 같이 재정의(@Override)해야만 HashSet이 중복을 정상적으로 걸러낼 수 있습니다.

실습 코드 분석 및 예시 (Fruit.java & HashSet2Demo.java 복원):

```Java
// Fruit.java
package week13;

public class Fruit {
    String name;

    public Fruit(String name) {
        this.name = name;
    }

    // 1) equals 오버라이딩: 주소값이 달라도 과일 이름(name)이 같으면 진짜 같다고 판정
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fruit) {
            Fruit f = (Fruit) obj;
            return name.equals(f.name);
        }
        return false;
    }

    // 2) hashCode 오버라이딩: equals가 true가 나오면 주소형 해시코드값도 일치하게 만듦
    // 해시 주머니(HashSet, HashMap) 계열은 hashCode 값이 다르면 equals 검사조차 안 하므로 필수입니다.
    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Fruit[name=" + name + "]";
    }
}
```

```Java
// HashSet2Demo.java
package week13;

import java.util.HashSet;
import java.util.Set;

public class HashSet2Demo {
    public static void main(String[] args) {
        Set<Fruit> fruits = new HashSet<>();
        
        // Fruit 클래스에 equals와 hashCode를 올바르게 재정의했기 때문에 중복 저장이 막힙니다!
        fruits.add(new Fruit("사과"));
        fruits.add(new Fruit("사과")); 
        
        System.out.println("과일 주머니 크기: " + fruits.size()); // 출력 결과: 1 (중복 차단 성공)
        System.out.println(fruits);
    }
}
```

---

**📂 테마 2: 키(Key)와 값(Value)으로 저장하는 주머니 (Map 계열)**
관련 파일: MapDemo.java, HashMapDemo.java

**1. Map과 HashMap 구조**
개념 및 정의: 사전(Dictionary)처럼 데이터를 다루는 구조입니다. 영단어(Key)를 찾으면 뜻(Value)이 나오는 것처럼 Key(키)와 Value(값)를 한 쌍(Entry)으로 묶어서 저장합니다.

규칙: 주머니 안에서 Key(키)는 절대로 중복될 수 없으며, Value(값)는 중복이 가능합니다. 기존에 존재하는 Key에 또 put을 하면 데이터가 교체(수정)됩니다.

실습 코드 분석 및 예시 (HashMapDemo.java & MapDemo.java 복원):

```Java
// HashMapDemo.java
package week13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // Key는 정수(Integer), Value는 문자열(String)인 HashMap 생성
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "basick");
        map.put(2, "koonta");
        map.put(3, "Layone");

        // 순회 방식 1: entrySet()과 Iterator를 사용해 Key, Value 쌍을 한꺼번에 꺼내기
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 순회 방식 2: keySet()을 사용해 Key들만 뽑아내서 반복문으로 하나씩 탐색하기
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
```

```Java
// MapDemo.java
package week13;

import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Map.of 를 이용해 데이터 수정/추가가 불가능한 고정형(Immutable) Map 객체 생성
        Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 2);
        
        System.out.println("과일 종류 수: " + fruits.size());
        System.out.println("포도가 있나요? " + fruits.containsKey("포도")); // Key 존재 확인
        System.out.println("사과의 개수: " + fruits.get("사과")); // Key로 Value 찾기

        // 💡 람다식(BiConsumer)을 결합해 깔끔하게 한 줄로 Map의 모든 요소 출력하기
        fruits.forEach((key, value) -> System.out.println(key + "가 " + value + "개 있습니다."));
    }
}
```

---

**📂 테마 3: 컬렉션을 요리하는 알고리즘 무기 (Collections 클래스)**
관련 파일: SortDemo.java, SearchDemo.java, SuffleDemo.java, EtcDemo.java

개념 및 정의: Arrays 클래스가 일반 배열([])을 제어하는 도구였다면, Collections 클래스는 List, Set, Map 같은 컬렉션 주머니들을 정렬, 역정렬, 무작위 섞기, 이진 검색, 빈도수 세기 등으로 가공해 주는 만능 유틸리티 클래스입니다.

**1. 정렬과 역순 배치 (SortDemo.java 복원)**

```Java
package week13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("오렌지", "바나나", "망고", "사과", "파인애플");

        // 1) Collections.sort + reverseOrder: 내림차순(역순)으로 가나다라 정렬 적용
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("내림차순 정렬: " + list);

        // 2) Collections.reverse: 현재 정렬 상태를 거울처럼 그대로 반전시킴
        Collections.reverse(list);
        System.out.println("리스트 반전: " + list);
    }
}
2. 고속 데이터 이진 검색 (SearchDemo.java 복원)
Java
package week13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("황금알", "돈", "같이", "보아라");

        // ⚠️ 주의: binarySearch()를 쓰기 전에는 반드시 먼저 '오름차순 정렬'이 되어있어야 합니다!
        Collections.sort(list); 
        System.out.println("정렬된 상태: " + list);

        // Collections.binarySearch: 이진 탐색 알고리즘을 사용해 고속으로 데이터 인덱스(방 번호) 추적
        int index = Collections.binarySearch(list, "돈");
        System.out.println("'돈'이 들어있는 위치(방 번호): " + index);
    }
}
```

**3. 요소 회전과 무작위 섞기 (SuffleDemo.java 복원)**
```Java
package week13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuffleDemo {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        for (char c = 'A'; c <= 'G'; c++) {
            list.add(c); // A, B, C, D, E, F, G 저장
        }
        System.out.println("최초 리스트: " + list);

        // 1) Collections.rotate: 지정한 칸수만큼 데이터를 뒤로 밀어서 회전시킴 (마지막 칸은 맨 앞으로 이동)
        Collections.rotate(list, 2);
        System.out.println("2칸 회전 리스트: " + list);

        // 2) Collections.shuffle: 리스트 내부의 요소 순서를 카드 섞듯 완전 무작위로 뒤흔듦
        Collections.shuffle(list);
        System.out.println("무작위 섞은 리스트: " + list);
    }
}
```

**4. 요소의 빈도수 측정 (EtcDemo.java 복원)**
```Java
package week13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EtcDemo {
    public static void main(String[] args) {
        // 중복 데이터가 많이 섞인 원본 리스트 생성
        List<String> list1 = List.of("사과", "포도", "수박", "사과", "키위", "사과", "망고", "포도");

        // HashSet 주머니를 이용하여 원본의 중복 데이터 완전히 거르기
        HashSet<String> set = new HashSet<>(list1);
        List<String> list2 = new ArrayList<>(set);
        Collections.sort(list2); // 깔끔하게 정렬

        // Collections.frequency: 원본 주머니(list1)에 특정 과일 데이터가 총 몇 개씩 분포하는지 세어줌
        for (String fruit : list2) {
            int count = Collections.frequency(list1, fruit);
            System.out.printf("%s : %d개\n", fruit, count);
        }
    }
}
```

---

## 🛠️ 13주차 전체 실습 클래스들의 총체적인 연관성 정리
이번 주차 실습 코드들은 자바에서 가장 많이 활용되는 자료구조의 확장과 데이터 가공 및 조작 기법의 긴밀한 상호 연동을 다루고 있습니다.

**1. HashSet과 HashMap의 긴밀한 커넥션 관계**
자바 시스템 내부에서 HashSet은 완전히 독자적으로 돌아가는 구조가 아니라 사실 HashMap의 메커니즘을 그대로 빌려서 구현되어 있습니다. HashMapDemo 코드를 살펴보면 주머니 안의 모든 키를 꺼내올 때 map.keySet() 메서드를 사용하는데, 이 메서드가 반환하는 자료형 타입이 바로 Set 구조입니다. 즉, Map의 키 중복 방지 성질과 Set의 유일성 성질이 서로 끈끈하게 엮여 있음을 실습을 통해 확인할 수 있습니다.  


**2. Collection 주머니들과 Collections 알고리즘 도구 상자의 연동**
ArrayList나 HashSet 등 다양한 주머니(Collection)에 대량의 데이터를 담았을 때, 이를 개발자가 직접 알고리즘 코드를 구현해 정렬하거나 섞거나 빈도수를 세려면 코드가 굉장히 비대해집니다.
실습 파일들의 연관성을 보면 Collections라는 강력한 도구 상자가 뒤를 받쳐줌으로써, List와 Set 주머니 객체들을 단 한 줄의 메서드 명령어(sort, binarySearch, shuffle, frequency)만으로 가공하고 요리해 내는 긴밀한 연동 관계를 보여줍니다.

(※ 참고사항: 파일 중 포함된 JDBCTest_01.class 파일은 자바의 데이터베이스 연결 라이브러리인 java.sql 접근 불가로 컴파일 오류가 그대로 묶여 있는 아티팩트 파일이므로, 핵심 실습 개념 공부 시에는 제외하셔도 무방합니다.)


---

## 📅 15주차. 주차별 전체 핵심 개념 요약

---  

### week09 & week10 (인터페이스와 다형성, 예외 처리)

ICalculator, CalculatorImpl: 인터페이스 구현의 표준 패턴입니다.

ControllablePolyDemo, RemoteControllable: 인터페이스를 통한 다형성(Polymorphism) 구현을 다룹니다.

TryCatchDemo, ThrowsDemo: 프로그램이 멈추지 않도록 예외를 처리하는 try-catch 구문과 예외를 던지는 throws의 개념입니다.  

---

### week11 (제네릭 - Generic)

GenericClassDemo, EntryDemo, GenericCup: 타입을 미리 정하지 않고 런타임에 결정하여 데이터 타입을 안전하게 다루는 기법입니다 (<T>, <K, V>).

---

### week12 & week13 (자바 기본 API 및 컬렉션 프레임워크)

StringTokenizerDemo, WrapperDemo, ObjectMethodDemo: 자바 내장 문자열 분리 및 기본 기능을 다룹니다.

ArrayListDemo, HashSetDemo, HashMapDemo, TreeSetDemo: 데이터를 저장하는 핵심 자료구조들입니다. 순서가 중요하면 List, 중복 제거는 Set, 키-값 쌍은 Map을 씁니다.

SortDemo, SearchDemo, SuffleDemo: 데이터를 정렬하고 검색하고 섞는 유틸리티 기법들입니다.


---

### week14 (JDBC - Java Database Connectivity)

JDBCTest_01 ~ 06: 자바 코드로 데이터베이스(DB)에 연결하여 데이터를 조회(Select), 추가(Insert), 수정(Update), 삭제(Delete)하는 핵심 실무 영역입니다. 점수 비중이 가장 높을 확률이 큽니다.

**2. 시험장 필수 소스코드 (USB 저장용)**
각 개념별로 가장 뼈대가 되는 코드만 압축했습니다. 파일 하나에 몰아넣거나 주차별 파일로 분리해서 가져가세요.

> 📌 코드 1: 인터페이스 + 다형성 (week09~10)
교수님이 "특정 기능을 하는 인터페이스를 만들고 이를 구현(implements)하는 클래스를 작성하라"고 할 때 기본 틀입니다.

```Java
// 1. 인터페이스 선언 (ICalculator.java)
interface ICalculator {
    int add(int a, int b); // 추상 메서드
}

// 2. 인터페이스 구현 (CalculatorImpl.java)
class CalculatorImpl implements ICalculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

// 3. 다형성 활용 실행 메인 클래스
public class InterfaceDemo {
    public static void main(String[] args) {
        // 인터페이스 타입으로 객체 생성 (다형성)
        ICalculator cal = new CalculatorImpl();
        System.out.println("결과: " + cal.add(5, 3));
    }
}
```

> 📌 코드 2: 예외 처리 (week10)
에러가 날 수 있는 구간을 방어하거나, 메서드 밖으로 에러를 던질 때 포맷입니다.

```Java
public class ExceptionDemo {
    // throws: 나를 호출한 곳으로 예외를 던짐
    public static void divide(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0); // 0으로 나누면 에러 발생
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다: " + e.getMessage());
        } finally {
            System.out.println("예외 발생 여부와 상관없이 무조건 실행되는 구간");
        }
    }
}
```
> 📌 코드 3: 제네릭 클래스 (week11)  

멀티 타입(Entry<K, V>) 구조로 시험에 나올 확률이 높습니다.

```Java
// 제네릭 클래스 선언 (Entry.java 구조)
class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

public class GenericDemo {
    public static void main(String[] args) {
        // 런타임에 타입을 String과 Integer로 결정
        Entry<String, Integer> entry = new Entry<>("Age", 25);
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
```
> 📌 코드 4: 컬렉션 프레임워크 핵심 3대장 (week12~13)
시험 문제에서 "데이터를 저장하고 가공하라"고 하면 무조건 이 셋 중 하나를 씁니다.

```Java
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // 1. ArrayList (순서 있음, 중복 허용)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        
        // Iterator(반복자) 사용 패턴 (IteratorDemo용)
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        // 2. HashSet (순서 없음, 중복 불가)
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10); // 중복이라 무시됨

        // 3. HashMap (Key-Value 쌍)
        Map<String, String> map = new HashMap<>();
        map.put("id", "student01");
        map.put("name", "홍길동");
        System.out.println("이름 출력: " + map.get("name"));
        
        // 정렬 및 섞기 (SortDemo, SuffleDemo)
        Collections.sort(list); // 오름차순 정렬
        Collections.shuffle(list); // 무작위 섞기
    }
}

```
> 📌 코드 5: 문자열 쪼개기 (week12)

StringTokenizer는 단골 출제 요소입니다.

```Java
import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args) {
        String query = "자바,DB,인터페이스,제네릭";
        // 쉼표(,)를 기준으로 문자열 분리
        StringTokenizer st = new StringTokenizer(query, ",");
        
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
```

> 📌 코드 6: [가장 중요] JDBC 표준 템플릿 (week13~14)

실기 시험에서 JDBC 코딩을 하라고 하면 아래 뼈대 코드에서 URL, 계정 정보, SQL 구문만 바꾸면 90%는 끝납니다. 무조건 가져가세요.

```Java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTemplate {
    public static void main(String[] args) {
        // DB 연결 정보 (시험 문제에 주어지는 대로 수정할 것)
        String url = "jdbc:mysql://localhost:3306/mydb"; 
        String user = "root";
        String password = "password";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1. 드라이버 로드 및 연결
            Class.forName("com.mysql.cj.jdbc.Driver"); // 또는 Oracle 드라이버
            conn = DriverManager.getConnection(url, user, password);

            // 2. SQL 작성 (조회 예시)
            String sql = "SELECT * FROM users WHERE age >= ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 20); // 1번째 물음표(?)에 값 바인딩

            // 3. 실행 및 결과 처리
            rs = pstmt.executeQuery(); // SELECT 문은 executeQuery() / C,U,D는 executeUpdate()
            while (rs.next()) {
                // 컬럼명에 맞게 데이터 가져오기
                System.out.println("이름: " + rs.getString("name"));
                System.out.println("나이: " + rs.getInt("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 4. 자원 해제 (연 순서 반대로 close)
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    }
}
```

---  

## 🔀 [복합 마스터 01] 인터페이스 + 제네릭 + 컬렉션 (week09 + week11 + week13)

> **출제 시나리오:** 특정 상품을 관리하는 시스템을 구축하시오. 상품 정보를 담을 제네릭 구조의 `Entry` 클래스를 활용하고, 이를 추가/조회하는 기능은 인터페이스로 설계한 뒤 `ArrayList` 자료구조를 사용해 구현하시오.

### 📋 1. 인터페이스 설계 ( week09 / week10 )
```java
import java.util.List;

// 데이터를 관리하는 표준 규격 정의
interface IRepository<T> {
    void add(T item);         // 데이터 추가
    List<T> getAll();         // 전체 데이터 조회
    void printAll();          // 전체 데이터 출력 유틸리티
}
> 📦 2. 제네릭 엔트리 클래스 ( week11 )
```Java
// Key와 Value를 쌍으로 갖는 제네릭 데이터 클래스
class ItemEntry<K, V> {
    private K id;
    private V name;

    public ItemEntry(K id, V name) {
        this.id = id;
        this.name = name;
    }

    public K getId() { return id; }
    public V getName() { return name; }

    @Override
    public String toString() {
        return "[ID: " + id + ", 상품명: " + name + "]";
    }
}
```
> 🛠️ 3. 인터페이스 구현 및 컬렉션 활용 ( week13 )
```Java
import java.util.ArrayList;
import java.util.List;

// 인터페이스를 상속받아 ArrayList로 실제 데이터 로직 구현
class ItemRepositoryImpl implements IRepository<ItemEntry<Integer, String>> {
    // 컬렉션 프레임워크 활용
    private List<ItemEntry<Integer, String>> db = new ArrayList<>();

    @Override
    public void add(ItemEntry<Integer, String> item) {
        db.add(item);
    }

    @Override
    public List<ItemEntry<Integer, String>> getAll() {
        return db;
    }

    @Override
    public void printAll() {
        // week13 Iterator 패턴 또는 For-each 루프로 순회
        for (ItemEntry<Integer, String> item : db) {
            System.out.println(item);
        }
    }
}
```
> 🚀 4. 메인 실행 클래스
```Java
public class CombinedDemo01 {
    public static void main(String[] args) {
        // 다형성을 이용한 객체 생성
        IRepository<ItemEntry<Integer, String>> repo = new ItemRepositoryImpl();

        // 제네릭 데이터 주입 및 컬렉션에 추가
        repo.add(new ItemEntry<>(101, "자바 기말 족보"));
        repo.add(new ItemEntry<>(102, "오픈북 치트시트"));

        // 출력
        repo.printAll();
    }
}
```
## 🗄️ [복합 마스터 02] JDBC + 예외 처리 + 컬렉션 변환 (week10 + week13 + week14)
출제 시나리오: 데이터베이스(DB)에서 회원 정보를 조회하여 자바 프로그램의 ArrayList에 담은 뒤, 회원 목록을 정렬(Sort)하여 출력하시오. DB 연동 중 발생할 수 있는 모든 에러는 예외 처리를 해야 합니다.

> 👤 1. 회원 데이터 클래스 ( week12 Object )

```Java
// 데이터를 담을 바구니(DTO) 역할의 클래스
class User implements Comparable<User> {
    private String id;
    private int score;

    public User(String id, int score) {
        this.id = id;
        this.score = score;
    }

    public String getId() { return id; }
    public int getScore() { return score; }

    // week13 SortDemo에서 Collections.sort()를 쓰기 위한 정렬 기준 정의 (점수 기준 내림차순)
    @Override
    public int compareTo(User other) {
        return Integer.compare(other.score, this.score); 
    }

    @Override
    public String toString() {
        return "아이디: " + id + ", 점수: " + score;
    }
}
```
> 🔌 2. JDBC 연동 및 데이터 가공 ( week10 + week14 )
```Java
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinedDemo02 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "password";

        // 결과를 담을 컬렉션 생성
        List<User> userList = new ArrayList<>();

        // 자원 자동 해제를 위한 try-with-resources 문법 (또는 기존 finally 사용 가능)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement("SELECT id, score FROM students");
                 ResultSet rs = pstmt.executeQuery()) {

                // 1. JDBC로 데이터를 읽어서 컬렉션(List)에 담기
                while (rs.next()) {
                    String id = rs.getString("id");
                    int score = rs.getInt("score");
                    userList.add(new User(id, score));
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로드 실패: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("DB 연동 예외 발생 (week10): " + e.getMessage());
        }

        // 2. 컬렉션 정렬 수행 (week13 SortDemo 응용)
        Collections.sort(userList);

        // 3. 결과 출력
        System.out.println("--- 성적 우수자 순위 ---");
        for (User u : userList) {
            System.out.println(u);
        }
    }
}
```
