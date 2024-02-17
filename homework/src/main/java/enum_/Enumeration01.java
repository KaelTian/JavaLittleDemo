package enum_;

/**
 * @author 田赛
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
//        Gender boy = Gender.BOY;
//        System.out.println(boy);
        //使用SeasonPlus演示枚举中的方法
//        SeasonPlus seasonPlus1 = SeasonPlus.SPRING;
//        SeasonPlus seasonPlus2 = SeasonPlus.AUTUMN;
//        System.out.println(seasonPlus1.name());
//        System.out.println(seasonPlus2.ordinal());
//        for (SeasonPlus value : SeasonPlus.values()) {
//            System.out.println(value);
//        }
//        int compareValue = seasonPlus2.compareTo(seasonPlus1);
        for (Week week : Week.values()) {
            System.out.println(week.getName());
        }
    }
}

class Season {
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

enum SeasonPlus {
    SPRING("春天"),
    SUMMER("夏天"),
    AUTUMN("秋天"),
    WINTER("冬天");
    //Storm;

    private String description;

    private SeasonPlus() {

    }

    private SeasonPlus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

enum Gender {
    BOY, GIRL;
}

enum Week {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private String name;

    private Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
