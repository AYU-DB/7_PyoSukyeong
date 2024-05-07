# 자바 배열 관련 함수 정리 
* 새로 알게된 것, 잊어버리기 쉬운 것 위주로 정리

1. Array length [array1.java]
```
int [] arr = {1, 2, 3};
System.out.println(arr.length) // arr 개수 출력 (3)
```

2. Array declear [array3.java]
```
int answer[] = new int [(개수)];
```

3. Array copy
```
int[] arr = {1, 2, 3, 4, 5};
int[] newArr = arr.clone(); // newArr = {1, 2, 3, 4, 5};
```
```
int[] arr = {1, 2, 3, 4, 5};

//All
int[] newArr = Arrays.copyOf(arr, arr.length); // newArr = {1, 2, 3, 4, 5};

//Range (0 ~ 2)
int[] partialNewArr = Arrays.copyOf(arr, 3); // partialNewArr = {1, 2, 3};
```
