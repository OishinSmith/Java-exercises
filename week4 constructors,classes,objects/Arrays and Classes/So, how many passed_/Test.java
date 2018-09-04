public class Test
{
    public static int numberPasses(Student [] student){
        int j = 0;
        for(int i=0; i < student.length;i++){
            if(student[i].getMark()>= 40){
                j = j + 1;   
                }
            }
        return(j);    
    }
}