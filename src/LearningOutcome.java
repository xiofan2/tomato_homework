public class LearningOutcome {
    private String text;
    private String no;

    private String data;

    LearningOutcome(String text) {
        this.text = text;
        initNo();
        initData();
    }

    protected void initNo(){
        setNo(text.split("\\|")[1]);
    }

    protected void setNo(String no){
        this.no = no;
    }

    protected void setData(String data){
        this.data = data;
    }

    protected void initData() {
        String data = this.getClass().getName() + " - " +
                String.format("Learning Outcome #%s", no) + ", " +
                getOutcome() + ", " +
                getDescription();
        setData(data);
    }

    protected String getText() {return text;}

    @Override
    public String toString() {
        return data;
    }

    public String getDescription() {
        return text.split("\\|")[2];
    }

    public String getOutcome() {
        return "Generic description";
    }
}
