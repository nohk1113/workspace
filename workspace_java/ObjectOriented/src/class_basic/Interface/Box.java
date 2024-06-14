package class_basic.Interface;

import java.util.Objects;

//무엇이든 넣고 뺄수있는 만능 상자
public class Box {
    String str;
    public void setBox(Object str){  // 넣는 것
        this.str= (String) str;
    }
    public Object getBox(){    // 빼는것
        return str;
    }

}
