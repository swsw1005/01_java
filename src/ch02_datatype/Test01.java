package ch02_datatype;


public class Test01{
	public static void main(String args[]){
		int a1=10;
		int _a=10;
		int $a=10;
		
		System.out.println("a1\t=\t"+a1);
		System.out.println("_a\t=\t"+_a);
		System.out.println("$a\t=\t"+$a);
			
	}//main end
}//class end
/*

Java Data Type 
ㄴ Primitive Type
    ㄴ Boolean Type(boolean)
    ㄴ Numeric Type
        ㄴ Integral Type
            ㄴ Integer Type(short, int, long)
            ㄴ Floating Point Type(float, double)
        ㄴ Character Type(char)
ㄴ Reference Type
    ㄴ Class Type
    ㄴ Interface Type
    ㄴ Array Type
    ㄴ Enum Type
    ㄴ etc.

자료형
byte	1byte 	-128 ~ 127
char	2byte	unicode
short	2byte	-32768 ~ 32767
int 	4byte	-2,147,483,648 ~ 2,147,483,647


int	a	a1	_a	$a	가능

int kim 1 = 1000	공백 불가능
int 2kim  = 2000	첫글자 숫자불가능

상수(constant) = data = 값

1. 정수	10(int)  10L(long)  0xa(16진)
2. 실수	12.7(double)  12.7f(float)
3. 문자 상수	'a' 'A' 'f'
4. 문자열상수	"A" "mbc" "홍길동"

정수+""	문자열
정수+''	정수		자료형 큰쪽으로
정수+실수	실수값		자료형 큰쪽으로

*/