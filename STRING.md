# 자바 스트링 관련 함수 정리 
* 새로 알게된 것, 잊어버리기 쉬운 것 위주로 정리

1. String to int/long [printstr6.java]
```
String s = "1000";    
int n = Integer.parseInt(s);

long L = Long.parseLong(s);    
```

2. int/long to String [printstr6.java]
```
int n = 1;
String szStringInt = Integer.toString(n);
        
long L = 100;
String szStringLong = Long.toString(L);
```

3. String equal [printstr7.java]
```
String big = ">";
String equal = "=";
        
boolean = big.equals(equal); // false
boolean = big.equals("="); // false

boolean = big.equals(big); // true
boolean = big.equals(">"); // true

```

4. Check String null or Empty [code.java]
```
String str1 = "";
String str2 = null;

str1.isEmpty(); // true
str2 == null; //true
```
