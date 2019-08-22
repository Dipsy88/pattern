package builder;

public class LunchOrderBean_Telescoping {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderBean_Telescoping() {

    }

    public LunchOrderBean_Telescoping(String bread) {
        this.bread = bread;
    }

    public LunchOrderBean_Telescoping(String bread, String condiments){
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderBean_Telescoping(String bread, String condiments, String dressing){
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderBean_Telescoping(String bread, String condiments, String dressing, String meat){
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

}
