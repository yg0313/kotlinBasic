# item1

## 가변성을 제한
- var 보다는 val을 사용
- mutable 프로퍼티보다는 immutable 프로퍼티를 사용
- mutable 객체와 클래스보다는 immutable 객체와 클래스를 사용
- 변경이 필요한 대상을 만들어야 한다면, immutable 데이터 클래스로 만들고 copy를 활용
- 컬렉션에 상태를 저장해야 한다면, mutable 컬렉션보다는 읽기 전용 컬렉션을 사용
- 변이 지점을 적절하게 설계하고, 불필요한 변이 지점은 만들지 않기
- mutable 객체를 외부에 노출하지 않기