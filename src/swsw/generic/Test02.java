package swsw.generic;

class StudentInfo {
    public int grade;

    StudentInfo(int set_grade) {
        this.grade = set_grade;
    }
}

class StudentPerson {
    public StudentInfo info;

    StudentPerson(StudentInfo set_info) {
        this.info = set_info;
    }
}

class EmployeeInfo {
    public int rank;

    EmployeeInfo(int set_rank) {
        this.rank = set_rank;
    }
}

class EmployeePerson {
    public EmployeeInfo info;

    EmployeePerson(EmployeeInfo set_info) {
        this.info = set_info;
    }
}

public class Test02 {

    public static void main(String[] args) {
        StudentInfo si = new StudentInfo(2); // grade 2학년 객체생성
        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info);
        // swsw.generic.Test02
        // swsw.generic.StudentInfo@70dea4e
        System.out.println(sp.info.grade); // 2

        System.out.println("-------------------------");

        EmployeeInfo ei = new EmployeeInfo(1); // rank 1 인스턴스 생성
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank);
        // ep 객체에 info.rank 출력

    }
}// class end
