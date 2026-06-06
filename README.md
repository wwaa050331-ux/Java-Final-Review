# ☕ 자바 프로그래밍 기말고사 실기 요약집

> 📅 기말고사를 위해 무조건 외워야 하는 뼈대 코드와 핵심 개념 정리집입니다.

## 🔍 빠른 바로가기
* 📅 [1일차: 인터페이스와 구현](#1일차-인터페이스와-구현-week-09)
* 📅 [2일차: 인터페이스와 예외 클래스](#2일차-인터페이스와-예외-클래스-week-10)
* ⚠️ [예외 클래스 요약](#-예외-클래스-exception-class)
* 📅 [3일차: 재네릭 클래스](#-3일차-재네릭-클래스-Week-11))
* 📅 [4일차: 기본 API 및 Object, 컬렉션 프레임워크, 익명 클래스/람다식](#-4일차-기본-API-및-Object-컬렉션-프레임워크-익명-클래스/람다식-week12-)

---

## 1일차: 인터페이스와 구현 (Week 09)

### 📌 개념 및 요약
* **인터페이스(Interface):** 클래스를 만들기 위한 **설계도**. 내부 코드에 매개변수나 여러 변수 선언이 가능함.
* **구현(Implement):** 설계도를 바탕으로 실제 기능을 채워 넣는 것.
* **상수 선언:** 인터페이스 내 변수는 자동으로 `public static final`이 되므로 상수는 대문자로 선언하며, `String`으로 여러 변수를 동시에 선언할 수 있음.
* **default 메서드:** 인터페이스가 `default` 키워드를 가질 때만 `{}` 블록(몸체)을 가질 수 있음.
* **private static 메서드:** 인터페이스 내부에서만 자기들끼리 공통으로 호출하여 사용할 때 선언함.


### 💡 핵심 뼈대 코드
```java
public interface ICalculator {
    String PLUS = "plus";
    String MINUS = "minus";
    String MULTIPLE = "multiple"; 

    int add(int a, int b);

    default int multiple(int i, int j) { 
        return i * j;
    }

    private static void initMessage(String opt) {  
        System.out.println(opt + "시작합니다~~~~");
    }
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

## 4일차: 기본 API 및 Object, 컬렉션 프레임워크, 익명 클래스/람다식(week12)

# 📅 Java 12주차 실습 핵심 개념 총정리 (테마 1, 2, 3 전체)

📅 Java 12주차 실습 핵심 개념 총정리
12주차 실습에서 다룬 자바 중급 과정의 3대 핵심 테마(기본 API 및 Object, 컬렉션 프레임워크, 익명 클래스/람다식)에 대한 상세 정의, 사용법, 실습 코드 분석 문서입니다.

📂 테마 1: 자바의 뿌리 클래스들과 데이터 변환
관련 파일: Keyboard.java, ObjectMethodDemo.java, WrapperDemo.java, StringTokenizerDemo.java

1. Object 클래스와 오버라이딩 (toString, equals)
개념 및 정의: 자바의 모든 클래스가 예외 없이 자동으로 상속받는 최상위 대장 클래스입니다. 이 안에 객체를 문자열로 표현하는 toString()과 객체의 내용이 같은지 비교하는 equals()가 기본 정의되어 있습니다.

사용법: 부모인 Object가 준 메서드의 기본 기능(주소값 비교 등)이 내 클래스의 목적에 맞지 않으면 자식 클래스에서 재정의(@Override)해서 씁니다.

실습 코드 기반 예시 (Keyboard.java & ObjectMethodDemo.java):

Java
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
2. 래퍼 클래스 (Wrapper Class) & 오토 박싱/언박싱
개념 및 정의: int, double 같은 기초 타입은 가볍고 빠르지만 객체가 아니라서 제네릭이나 만능 주머니(Collection)에 넣을 수 없습니다. 이를 해결하기 위해 기초 타입을 객체 상자 형태로 포장해 놓은 클래스들을 래퍼 클래스라고 합니다. (Integer, Double, Float 등)

사용법 및 예시 (WrapperDemo.java 기반):

Java
Integer bi1 = new Integer(10); // 정석대로 상자에 10을 포장하는 방법 (구버전 방식)

Integer bi2 = 20;  // ⭕ 오토 박싱: 기본 정수(20)를 Integer 객체 상자에 자동으로 포장해 줌
int i2 = bi2 + 20; // ⭕ 오토 언박싱: Integer 상자에서 자동으로 기본 정수를 꺼내서 더해 줌

// 💡 실무 필수 변환 기능들
String s1 = Double.toString(3.14); // 숫자 3.14를 문자열 "3.14"로 변환
Float pi = Float.parseFloat("3.14"); // 문자열 "3.14"를 진짜 소수 3.14 타입으로 변환
Integer bi3 = Integer.valueOf("11", 16); // 16진수 문자열 "11"을 10진수 정수(17)로 변환
3. StringTokenizer
개념 및 정의: 긴 문자열을 개발자가 지정한 특수 기호(구분자, Delimiter)를 기준으로 톡톡 끊어서 조각(토큰, Token)으로 분리해 주는 편리한 문자열 처리 도구입니다.

사용법 및 예시 (StringTokenizerDemo.java 기반):

Java
String s = "of the peple,by the peple, for the peple";
StringTokenizer st = new StringTokenizer(s, ","); // 콤마(,)를 기준으로 자르겠다!

System.out.println(st.countTokens()); // 현재 잘린 조각이 총 몇 개인지 확인 (결과: 3)

while(st.hasMoreTokens()) { // 다음 꺼낼 조각이 남아있는 동안 무한 반복 (true/false)
    System.out.print("[" + st.nextToken() + "]"); // 조각을 하나씩 꺼내옴
}
// 출력 결과: [of the peple][by the peple][ for the peple]
📂 테마 2: 자료구조와 만능 주머니 (컬렉션 프레임워크)
관련 파일: ArrayListDemo.java, ListDemo.java, IteratorDemo.java, PerformanceDemo.java

1. List 인터페이스와 ArrayList
개념 및 정의: 크기가 한 번 정해지면 바꿀 수 없는 일반 배열의 단점을 극복하기 위해 만든, 스스로 크기를 늘렸다 줄였다 하는 만능 주머니입니다. 순서가 엄격하게 유지되며, 데이터의 중복을 허용합니다.

사용법 및 예시 (ArrayListDemo.java 기반):

Java
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
2. Arrays.asList의 한계점
개념 및 정의: 일반 배열을 리스트 구조로 빠르게 변환해 주는 아주 유용한 기능이지만, 이렇게 만든 리스트는 고정된 배열의 성질을 그대로 가지고 있어서 방의 크기를 바꿀 수 없습니다.

사용법 및 예시 (ListDemo.java 기반):

Java
String[] animals1 = {"사슴", "호랑이", "바다표범", "곰"};
List<String> animals2 = Arrays.asList(animals1); // 배열을 리스트로 변경

animals2.set(1, "앵무새"); // ⭕ 방의 내용을 수정하는 것은 가능!
// animals2.add("늑대");   // ❌ 에러 발생! 방의 개수를 늘리는 추가(add)나 삭제(remove)는 절대 불가능!
3. Iterator (반복자)
개념 및 정의: 주머니(Collection) 속에 들어있는 대량의 데이터들을 "처음부터 끝까지 안전하고 순서대로 하나씩 꺼내 가도록 돕는 전용 빨대/통로"입니다.

사용법 및 예시 (IteratorDemo.java 기반):

Java
Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");
Iterator<String> iterator = list.iterator(); // 주머니 전용 반복자(빨대)를 꽂음

while(iterator.hasNext()) { // 1. 다음 칸에 데이터가 아직 들어있니? 물어봄 (true/false)
    System.out.print(iterator.next() + "-"); // 2. 있으면 그거 꺼내오고 화살표를 다음 칸으로 이동!
}
// 출력 결과: 다람쥐-개구리-나비-
4. ArrayList vs LinkedList 성능 비교
개념 및 정의: 둘 다 똑같이 데이터를 담는 List 주머니이지만, 내부 방 구조가 다릅니다.

ArrayList: 방들이 메모리에 연속으로 다닥다닥 붙어있음.

LinkedList: 방들이 기차 칸처럼 고리(주소)로 앞뒤 연결되어 있음.

성능 분석 (PerformanceDemo.java 기반):

주머니 맨 앞에 새로운 데이터를 10만 개 집어넣는 상황일 때:

ArrayList는 새 데이터를 맨 앞에 넣을 때마다 기존에 있던 모든 방을 한 칸씩 뒤로 밀어내야 해서 연산 속도가 엄청나게 느려집니다 (a1.add(0, i)).

LinkedList는 기존 방들을 건드릴 필요 없이 기차 맨 앞에 새 기차 칸 하나만 툭 연결해 주면 끝이라서 속도가 압도적으로 빠릅니다 (l1.addFirst(i)).

📂 테마 3: 코드를 극단적으로 줄이는 마법 (익명 클래스와 람다식)
관련 파일: AnanymouseEx.java, FuntionalIntEx.java

1. 익명 클래스 (Anonymous Class)
개념 및 정의: 인터페이스를 원래 사용하려면 반드시 새로운 자식 클래스 파일을 만들어서 구현해야 합니다. 하지만 딱 한 번만 대충 쓰고 버릴 일회용 클래스라면, 귀찮게 새 파일을 만들지 않고 new 하는 그 자리에서 이름 없이 즉석으로 코드를 채워 만드는 기법입니다.

사용법 및 예시 (AnanymouseEx.java 기반):

Java
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
2. 함수형 인터페이스와 람다식 (Lambda)
개념 및 정의: 자바의 최신 문법으로, 메서드가 단 1개만 있는 인터페이스(@FunctionalInterface)일 때 위에서 배운 익명 클래스의 구구절절 길었던 코드(new, public void 등)마저 다 생략하고 화살표(->) 하나로 핵심 기능(로직)만 표현하는 마법 같은 코드 압축 기술입니다.

사용법 및 예시 (FuntionalIntEx.java 기반):

Java
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
🛠️ 12주차 전체 실습 클래스들의 총체적인 연관성 정리
이번 12주차 코드들은 서로 다른 기능 같지만, 실은 자바의 객체 다루기 능력을 극대화하기 위해 톱니바퀴처럼 맞물려 있습니다.

1. Wrapper 클래스(Integer 등)의 탄생 배경과 Collection 주머니의 연관성
자바의 ArrayList나 LinkedList 같은 자료구조 주머니들은 무조건 객체(클래스 타입)만 담을 수 있게 설계되어 있습니다.
따라서 PerformanceDemo에서 숫자 10만 개를 주머니에 넣을 때 기초 타입 int가 아니라 Wrapper 클래스인 Integer 형태로 주머니 (ArrayList<Integer>)에 쏙쏙 박싱되어 들어갈 수 있었던 것입니다.

2. Collection 주머니와 최신 람다식 기술의 결합
대량의 데이터를 ArrayList에 담아놓고 하나씩 꺼내 쓰거나 조건별로 지우려고 할 때 과거에는 Iterator 빨대를 꽂아 while문을 길게 돌려야 했습니다. (IteratorDemo 방식)
하지만 12주차의 최종 진화형인 람다식 문법을 결합하면서, cars1.removeIf(c -> c.startsWith("소"))나 cars1.forEach(s -> System.out.print(s)) 처럼 수십 줄짜리 반복 제어 코드를 단 한 줄로 압축하여 컬렉션 데이터를 제어할 수 있게 연결됩니다.
