package MyJavaTest;

/**
 * 枚举的练习
 */
public class TestEnum {
    public static void main(String[] args) {
        //枚举的遍历
        for (Week week:Week.values()) {
            System.out.print(week+"\t");
        }

        Season season=Season.SPRING;
        switch (season){
            case SPRING:
                System.out.println("春天来了");
                break;
            case AUTUMN:
                System.out.println("秋天来了");
                break;
            case SUMMER:
                System.out.println("夏天来了");
                break;
            case WINTER:
                System.out.println("冬天来了");
                break;
        }
    }
}
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
enum Week{
    星期一,星期二,星期三,星期四,星期五,星期六,星期日
}