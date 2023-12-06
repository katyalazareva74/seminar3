package comparearray;

public class CompareArray {
    public static <E  extends Number> boolean compareArr(E[] array1, E[] array2){
        if(compareArrays(array1, array2)){
            if(compareArrays(array2, array1)){
                return true;
            }
        }
        return false;
    }
    private static <E  extends Number> boolean compareArrays(E[] array1, E[] array2){
        if(array2.length!= array1.length){
            return false;
        }
        int count=0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if(array1[i].doubleValue() == array2[j].doubleValue()){
                    count++;
                }
            }
            if(count==0){
                return false;
            } else if (count>1) {
                if(!compareArray(array1, count, array1[i])) {
                    return false;
                }
            }
            count=0;
        }
        return true;
    }
    private static  <E  extends Number> boolean compareArray(E[] array1, int count, E array){
        int count1=0;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i].doubleValue()==array.doubleValue()){
                count1++;}
        }
        if(count==count1){
            return true;
        }
        return false;
    }
}
