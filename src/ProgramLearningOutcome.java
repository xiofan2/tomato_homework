public class ProgramLearningOutcome extends LearningOutcome{
    private String orgName;
    private String description;

    ProgramLearningOutcome(String text) {
        super(text);
    }

    protected String getOrgName() { return orgName; }
    @Override
    protected void initData() {
        initNo();
        orgName = getText().split("\\|")[1];
        description = getText().split("\\|")[4];
        String[] splitText = orgName.split(" ");
        StringBuilder orgName = new StringBuilder();
        for(int i = 0;i<splitText.length;i++) {
            if(i==0) orgName.append(splitText[i]);
            else {
                orgName.append(" ");
                orgName.append(splitText[i].substring(0,3));
            }
        }
        setData("ProgramLearningOutcome - " +
                orgName + ", " + getText().split("\\|")[0] + " " + getText().split("\\|")[2] + ", " +
                getText().split("\\|")[3] + ", " +
                getText().split("\\|")[4]
        );
    }

    @Override
    protected void initNo() {
        super.setNo(getText().split("\\|")[2]);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getOutcome() {
        return getText().split("\\|")[3];
    }

}
