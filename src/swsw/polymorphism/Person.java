package swsw.polymorphism;

import java.util.*;

interface Father {
    public int isThisFather();
}

interface Mother {
    public int isThisMother();
}

interface Developer {
    public int isThisDeveloper();
}

abstract class JavaDeveloper implements Developer {
    public int isJAVA() {
        return 1;
    }
}

abstract class PythonDeveloper implements Developer {
    public int isPython() {
        return 1;
    }
}

class John implements Developer, Father {

    @Override
    public int isThisFather() {
        // TODO Auto-generated method stub
        return 10;
    }

    @Override
    public int isThisDeveloper() {
        // TODO Auto-generated method stub
        return 100;
    }

}

class Jane implements Developer, Mother {

    @Override
    public int isThisMother() {
        // TODO Auto-generated method stub
        return 20;
    }

    @Override
    public int isThisDeveloper() {
        // TODO Auto-generated method stub
        return 200;
    }

}

class Chulsoo extends JavaDeveloper implements Father {

    @Override
    public int isThisDeveloper() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int isThisFather() {
        // TODO Auto-generated method stub
        return 0;
    }

}

class Yeonghee extends PythonDeveloper implements Mother {

    @Override
    public int isThisDeveloper() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int isThisMother() {
        // TODO Auto-generated method stub
        return 0;
    }

}

public class Person {

    public static void main(String[] args) {

        Developer d1 = new John();
        Developer d2 = new Jane();
        Developer d3 = new JavaDeveloper() {

            @Override
            public int isThisDeveloper() {
                // TODO Auto-generated method stub
                return 33;
            }
        };
        Developer d4 = new PythonDeveloper() {

            @Override
            public int isThisDeveloper() {
                // TODO Auto-generated method stub
                return 44;
            }
        };

        JavaDeveloper j1 = new JavaDeveloper() {

            @Override
            public int isThisDeveloper() {
                // TODO Auto-generated method stub
                return 0;
            }
        };

        JavaDeveloper j2 = new Chulsoo();
        // JavaDeveloper j3 = new Yeonghee();

        d1.isThisDeveloper();
        // d1.isThisFather();
        // ----- 데이터형 Developer.... Father Interface 사용 불가
        d2.isThisDeveloper();
        // d2.isThisMother();
        // ----- 데이터형 Developer.... Mother Interface 사용 불가

        d3.isThisDeveloper();
        // d3.isJAVA();
        ((JavaDeveloper) d3).isJAVA();

        d4.isThisDeveloper();
        // d4.isPython();
        ((PythonDeveloper) d4).isPython();

        //// 4명의 개발자를 모집하였다.
        Hashtable<String, Developer> ht = new Hashtable<>();
        ht.put("Jane", new Jane());
        ht.put("John", new John());
        ht.put("Chulsoo", new Chulsoo());
        ht.put("Yeonghee", new Yeonghee());
        ht.put("d4", d4);

        ht.get("Jane").isThisDeveloper();
        ht.get("John").isThisDeveloper();
        ht.get("Chulsoo").isThisDeveloper();
        ht.get("Yeonghee").isThisDeveloper();
        ht.get("d4").isThisDeveloper();
        // 4명 모두 데이터형(Developer)로 모였기 때문에, Father Mother 메소드 사용 불가
        // JAVA Python 마찬가지

    }

}