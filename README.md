# gson

GSON 라이브러리는 숫자형을 double로 변환합니다.

{"a":1,"aa":2.0}

위와 같은 JSON 스트링을 변환하면 a는 1.0 aa도 2.0이 됩니다.

이 프로젝트는 정수형태의 JSON 스트링은 long으로 변환해줍니다.

{a=1, aa=2.0}

이 문제 때문에 몇가지 방법이 존재하나 대부분 모든 숫자(실수 포함)를 int형으로 변환하거나 gson의 성능 저하가 큰 단점이 있습니다.

하지만 이 프로젝트의 방법은 형변환의 문제와 성능 저하가 없습니다.
