public class Main {
    public static void main(String[] args) {
        System.out.println(solution(1905));
    }
    public static int solution(int year) {
        if(year%100 == 0){
            return year/100;
        }else{
            return (year/100)+1;
        }
    }
}
