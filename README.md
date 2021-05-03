# 자동차 경주 게임

## 진행 방법

- 숫자 야구 게임 요구사항을 파악한다.
- 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

- [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

### 예제

<details>
<summary>실행 예제</summary>

```bash
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,crong,honux
시도할 횟수는 몇회인가요?
5

실행 결과
pobi: -
crong: -
honux: -

pobi: --
crong: -
honux: --

pobi: ---
crong: --
honux: ---

pobi: ----
crong: ---
honux: ----

pobi: -----
crong: ----
honux: -----

pobi, honux가 최종 우승했습니다.
```

</details>

### 기능 요구사항

- [ ] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- [ ] 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- [ ] 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
  - [ ] 각 일급 컬렉션으로 각각 유효성 검증 코드를 가진다.
- [ ] 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- [ ] 전진하는 조건은 0에서 9사이에서 random 값을 구한 후 random 값이 4이상일 경우 전진하고, 3이하의 값이면 멈춘다.
- [ ] 자동차 경주게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

### 프로그래밍 요구사항

1. [자바 코드 컨벤션을 지키면서 프로그래밍](https://naver.github.io/hackday-conventions-java/)한다.
2. indent depth를 1까지만 허용한다.
3. stream api를 사용하지 않는다. 단, 람다는 사용 가능하다.
4. else는 쓰지 않는다.
5. 함수또는 메소드의 길이가 10라인을 넘어가지 않도록 구현한다.
   - 함수또는 메소드는 한 가지의 일만 잘 하도록 구현한다.
6. [일급콜렉션](https://developerfarm.wordpress.com/2012/02/01/object_calisthenics_/)을 활용해 구현한다.
7. [모든 원시값과 문자열을 포장한다.](https://developerfarm.wordpress.com/2012/01/27/object_calisthenics_4/)
8. 로직에 단위 테스트를 구현한다.
   - 단 UI 로직은 제외

### 미션 저장소 및 진행 요구사항

- [Commit Message Convention](https://gist.github.com/stephenparish/9941e89d80e2bc58a153)
