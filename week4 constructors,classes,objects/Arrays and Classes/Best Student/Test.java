public class Test
{
    
    // Add a static getBestSTudent method to this class. It should return a Student object.
    public static Student getBestStudent(Student [] student){
        int max = 0;
        for(int i = 0; i < student.length; i++){
            if(student[i].getMark() >= max && student[i].getMark() != max){
                max = student[i].getMark();
                }
            }
        int ans = 0;
        for(int j = 0; j < student.length; j++){
            if(student[j].getMark() == max){
                ans = j;
                return student[ans];
            }
        }
        return student[ans];
     }
}