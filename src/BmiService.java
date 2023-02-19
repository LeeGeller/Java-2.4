public class BmiService {
    public int bmiService (float hight,float weight){
        float hightMeters = hight/100;
        float squareHight = hightMeters * hightMeters;
        float calculate = weight/squareHight;
        int indexBmi = (int) calculate;
        return indexBmi;
    }
}
