package class_basic.man;

public class StuTest {
    public static void main(String[] args) {
//        학생을 5명 저장 할수있는 배열을 생성
        Student[] students=new Student[5];

        // 배열에 저장할 학생 객체 생성
        Student s1=new Student("kim",20,80);
        Student s2=new Student("이",30,90);
        Student s3=new Student("최",40,20);
        Student s4=new Student("박",50,50);
        Student s5=new Student("홍",60,40);

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;
        students[4]=s5;

        // 배열에 저장 된 모든 학생의 이름, 나이, 점수를 출력
//        for(int i=0; i<students.length;i++){
//            students[i].print();
//            System.out.println();
//        }

        // 1번 문제를 for-each문으로 해결
        for(Student s:students){
            s.print();
        }

//        배열에 저장된 학생중 점수가 80점 이상인 학생의 이름, 나이, 점수 출력
        for(int i=0; i<students.length; i++){
            if(students[i].getScore()>79){
                students[i].print();
            }
        }

        // 이름이 '박'인 학생을 찾아 해당 학생의 나이를 10으로 변경
        for (int i=0; i<students.length;i++){
            if(students[i].getName().equals("박")){
                //            문자를 같다라고 표시하는 방법  .equals
                students[i].setAge(10);
            }
        }
        for (Student e:students){
            if(e.getName().equals("박")){
                e.setAge(10);
            }
        }

    }
}
