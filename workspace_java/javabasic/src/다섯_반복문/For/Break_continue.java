package 다섯_반복문.For;

public class Break_continue {
    public static void main(String[] args) {
//        반복문(while, for)에서의 break 역할
      //  break 문을 만나면 가장 가까운 반복문을 벗어난다.
           //   1     2     3
        for (int i=1; i<11;i++){
            if(i==5){
                break;
            }
            //           4
            System.out.println(i);
//        순서   1>>2>>4>>3>>2>>4>>3>>2>>4>>3>> 무한 반복


        }
        System.out.println();

//        반복문에서의 continue역할
//        continue를 만나는 순간 반복문의 끝으로 이동한다.( 안의 내용은 스킵함)

        for (int i=1; i<11;i++){
            if(i==3){
                continue;
            }
            //           4
            System.out.println(i);
            }
        }
    }
