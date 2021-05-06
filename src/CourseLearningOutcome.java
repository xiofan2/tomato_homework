public class CourseLearningOutcome extends ProgramLearningOutcome{

    CourseLearningOutcome(String text) {
        super(text);
    }

    @Override
    protected void setData(String data) {
        super.setData(this.getClass().getName() + " - " +
                getOrgName() + ", " +
                getText().split("\\|")[0] + " " + getText().split("\\|")[2] + ", " +
                getText().split("\\|")[3] + ", " +
                getText().split("\\|")[4]);
    }
}
