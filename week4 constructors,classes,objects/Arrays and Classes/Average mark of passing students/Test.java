public class Test
{
    // Add a static getPassingAverage method to this class. It should return a double value
    //  representing the average makr of passing students
    public static double getPassingAverage(Student [] student){
        double j = 0;
        double sum = 0;
        for(int i=0; i < student.length;i++){
            if(student[i].getMark() >= 40){
                j = j + 1;
                sum = sum + student[i].getMark();
                    }
                }
        return sum/j;
    }
}