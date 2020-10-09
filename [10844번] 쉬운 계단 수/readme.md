<img width="1199" alt="image" src="https://user-images.githubusercontent.com/48542327/95547506-229e9380-0a3e-11eb-917b-a00e37347309.png">

# MySolution.java
* 각 인덱스의 개수를 **dp**로 계산
* numbers[i + 1][j - 1] += numbers[i][j]; // 0을 제외한 숫자들은 하나 작은 숫자를 뒤에 붙일 수 있다
* numbers[i + 1][j + 1] += numbers[i][j]; // 9를 제외한 숫자들은 하나 큰 숫자를 뒤에 붙일 수 있다
* numbers 마지막 줄의 총 개수를 count해서 반환
