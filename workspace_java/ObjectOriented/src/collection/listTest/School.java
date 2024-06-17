package collection.listTest;

import java.util.List;

public class School {
    private List<StudyClass> classlist;
    public School(List<StudyClass> classlist){
        this.classlist=classlist;
    }
    public List<StudyClass> getClasslist(){
        return classlist;
    }
}
