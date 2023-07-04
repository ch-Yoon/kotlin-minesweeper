# kotlin-minesweeper

## 1단계

### 요구 사항
- 지뢰 찾기를 변형한 프로그램을 구현한다.
- 높이와 너비, 지뢰 개수를 입력받을 수 있다.
- 지뢰는 눈에 잘 띄는 것으로 표기한다.
- 지뢰는 가급적 랜덤에 가깝게 배치한다.

### 구현 사항
- [x] 높이를 입력 받는다. 단, 부적절한 입력은 고려하지 않는다. (ex. 음수, 문자)
- [x] 너비를 입력 받는다. 단, 부적절한 입력은 고려하지 않는다. (ex. 음수, 문자)
- [x] 지뢰 개수를 입력 받는다. 단, 부적절한 입력은 고려하지 않는다. (ex. 음수, 문자)
- [x] 입력 받은 높이와 너비로 맵을 만든다.
- [x] 입력 받은 지뢰 개수 만큼 랜덤 위치의 지뢰를 만든다
- [x] 만든 맵에 입력 받은 지뢰 개수 만큼 지뢰를 표시한다.
- [x] 만든 맵을 화면에 출력한다.


## 2단계

### 요구 사항
- 각 사각형에 표시될 숫자는 자신을 제외한 주변 8개 사각형에 포함된 지뢰의 개수다.

### 구현 사항
- [x] 지뢰가 아닌 셀에 주변에 위치한 지뢰 개수를 입력한다.
- [x] 지뢰는 *로, 지뢰가 아닌 셀은 주변의 지뢰 개수를 출력한다.


## 3단계

### 요구 사항
- 지뢰가 없는 인접한 칸이 모두 열리게 된다.

### 구현 사항
- [x] 열기를 희망하는 좌표를 입력 받는다. 단, 부적절한 입력은 고려하지 않는다. (ex. 음수, 문자, 좌표 범위 초과)
- [x] 입력한 좌표는 list의 index와 1만큼의 차이가 있으므로, x와 y 좌표를 1씩 빼는 보정 처리를 한다.
- [x] 열지 않은 셀은 'c'로 출력한다.
- [x] 오픈한 셀이 지뢰라면 게임을 종료한다.
- [ ] 오픈한 셀이 지뢰가 아니라면, 그 셀을 오픈한다.
- 오픈한 셀이 지뢰가 아니라면
  - [ ] 1. 지뢰가 아닌 주변 셀들을 모두 오픈한다.
  - [ ] 2. 오픈한 주변 셀이 주변에 지뢰가 없는 셀 이라면, 그 셀을 기준으로 1번으로 돌아간다.
- [ ] 셀 오픈 및 주변 셀들을 오픈하는 모든 작업이 완료되면, 현재의 맵을 출력한다.
