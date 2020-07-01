package swsw.romanCalculrater;

import java.util.*;

// 퀴즈
// *채용퀴즈풀이를 함께 제출하셔야 접수가 됩니다.

// 문제
// 로마 숫자는 고대 로마에서 사용된 기수법입니다.
// 기본적으로 다음 5가지를 조합하여 로마 숫자를 읽고 쓸 수 있습니다.
// I = 1
// II = 2
// III = 3
// V = 5
// X = 10

// 4, 6, 7, 8, 9는 규칙을 이용하여 표시합니다.
// V 또는 X를 기준으로 왼쪽에 I가 오면 빼고 오른쪽에 I, II, III이 오면 더해서 표시합니다.

// 위와 같은 규칙으로 1 ~ 10까지 표시하면 다음과 같습니다.

// 로마 숫자        아라비아 숫자
// I   1
// II   2
// III   3
// IV   4
// V   5
// VI   6
// VII   7
// VIII   8
// IX   9
// X   10
// 아래 주어진 조건을 만족하는 로마 숫자 계산기를 작성하여 보내 주세요.
// 프로그래밍 언어의 제한은 없으며 자신있는 언어로 작성해 주세요.

// 조건
// 사칙연산이 가능한 계산기를 작성해 주세요.
// 입력값과 결과값의 범위는 I ~ XXIX (1 ~ 39) 입니다.
// 결과값이 0이하 이거나 39(XXXIX)보다 큰 경우 “범위를 벗어났습니다.”라고 표시해 주세요.
// 작은 수에서 큰 수를 빼는 경우 “작은 수에서 큰수를 뺄 수 없습니다.”라고 표시해 주세요.
// 작은 수를 큰 수로 나누는 경우 “작은 수를 큰 수로 나눌 수 없습니다.”라고 표시해 주세요.
// 나누기(/)의 결과 값은 몫과 나머지로 표시해 주세요.
// 입력은 파일이나 콘솔에서 받아도 되고 프로그램 내부에 하드코딩해도 됩니다.
// 예시
// 예 1)

// 입력

// I + I
// 출력

// II

// 예 2)

// 입력

// XX – IV
// 출력

// XVI

// 예 3)

// 입력

// III * VI
// 출력

// XVIII

// 예 4)

// 입력

// X / III
// 출력

// 몫 III, 나머지 I

// 예 5)

// 입력

// III / X
// 출력

// 작은 수를 큰 수로 나눌 수 없습니다.

// 예 6)

// 입력

// X – XXX
// 출력

// 작은 수에서 큰 수를 뺄 수 없습니다.

// 예 7)

// 입력

// XX + XX
// 출력

// 범위를 벗어났습니다.

public class RomanCalCulrater {

    // ......................................................................
    String calcul(String input) {

        input = input.replaceAll(" ", "");

        String output = "";// 출력값

        int list[] = { input.indexOf("+"), input.indexOf("-"),
                input.indexOf("*"), input.indexOf("/") };

        int sign_index = 0;

        for (int i = 0; i < list.length - 1; i++) {
            list[i + 1] = Math.max(list[i], list[i + 1]);
            sign_index = list[i + 1];
        }

        String a1 = input.substring(0, sign_index);
        String sign = input.substring(sign_index, sign_index + 1);
        String a2 = input.substring(sign_index + 1, input.length());

        int b1 = romanToInteger(a1.toUpperCase());
        int b2 = romanToInteger(a2.toUpperCase());

        // System.out.println();
        // System.out.println("-------\t" + a1 + "\t" + sign + "\t" + a2);
        // System.out.println("-------\t" + b1 + "\t" + sign + "\t" + b2);

        int result1 = 0;
        int result2 = 0;
        switch (sign) {
        case "+":
            result1 = b1 + b2;
            if (result1 > 39 || result1 < 1) {
                output = "범위를 벗어났습니다.";
            } else {
                output = intToRoman(result1);
            }
            break;

        case "-":
            result1 = b1 - b2;
            if (b2 > b1) {
                output = "작은 수에서 큰 수를 뺄 수 없습니다.";
            } else {
                output = intToRoman(result1);
            }
            break;

        case "*":
            result1 = b1 * b2;
            if (result1 > 39 || result1 < 1) {
                output = "범위를 벗어났습니다.";
            } else {
                output = intToRoman(result1);
            }
            break;

        case "/":
            result1 = b1 / b2;
            result2 = b1 % b2;
            if (b2 > b1) {
                output = "작은 수를 큰 수로 나눌 수 없습니다.";
            } else {
                output = "몫 " + intToRoman(result1) + ", 나머지 "
                        + intToRoman(result2);
            }
            break;

        default:
            break;
        }
        return output;
    }

    // ......................................................................
    int romanToInteger(String roman) {
        // System.out.println("---romanToInteger(" + roman + ")");
        int num10 = 0; // 10의자리 숫자
        int num01 = 0; // 1의자리 숫자
        int leng = roman.length();

        // 십의자리 자르기

        for (int i = 3; i > 0; i--) {
            String temp = "XXXX";
            temp = temp.substring(0, i);
            // System.out.println(temp);
            if (roman.indexOf(temp) == 0) {
                num10 = i * 10;
                // System.out.println("num10=" + num10);
                leng = roman.length();
                // System.out.println("roman=" + roman+" leng=" + leng);
                roman = roman.substring(i, leng);
                leng = roman.length();
                // System.out.println("roman=" + roman+" leng=" + leng);
            }
        }

        // 1의자리 계산
        int vx = 0;
        int iii = 0;
        int isVXbehind = 1;
        if (roman.indexOf("V") == 0) {
            vx = 5;
            roman = roman.replaceAll("V", "");
        } else if (roman.indexOf("V") > 0) {
            vx = 5;
            isVXbehind = -1;
            roman = roman.replaceAll("V", "");
        }
        if (roman.indexOf("X") == 0) {
            vx = 10;
            roman = roman.replaceAll("X", "");
        } else if (roman.indexOf("X") > 0) {
            vx = 10;
            isVXbehind = -1;
            roman = roman.replaceAll("X", "");
        }

        // System.out.println("vx(" + vx + ") isVXbehind(" + isVXbehind + ")");

        String iiiString = "";
        for (int i = 1; i <= 4; i++) {
            iiiString += "I";
            if (iiiString.equals(roman)) {
                iii = i;
            }
        }
        num01 = vx + (isVXbehind * iii);

        // System.out.println("num10=" + num10 + " num01=" + num01 + " 남은
        // roman=" + roman);

        return num10 + num01;
    }

    // ......................................................................
    String intToRoman(int num) {
        // System.out.println("---intToRoman(" + num + ")");
        int a1 = num / 10;
        int a2 = num % 10;
        // System.out.println(a1 + "/" + a2);
        String x = "";

        for (int i = 0; i < a1; i++) {
            x += "X";
        }
        // System.out.println("x=" + x);

        // String a4 = a3[a2];
        // System.out.println(a4);

        int d2 = (a2 + 1) / 5;
        // key 0 1 2 3 4 5 6 7 8 9
        // val 0 0 0 0 1 1 1 1 1 2
        int d3 = a2 % 5;
        // key 0 1 2 3 4 5 6 7 8 9
        // val 0 1 2 3 4 0 1 2 3 4

        String vx = "";
        String iii = "";

        if (d2 == 1) {
            vx = "V";
        } else if (d2 == 2) {
            vx = "X";
        }

        if (d3 == 4) {
            vx = "I" + vx;
        } else {
            for (int i = 0; i < d3; i++) {
                iii += "I";
            }
            vx += iii;
        }

        return x + vx;
    }

    // ......................................................................
    public static void main(String[] args) {

        RomanCalCulrater romanCal = new RomanCalCulrater();

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String output = romanCal.calcul(input);

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println(output);
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        scan.close();

    }
}