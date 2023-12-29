public class Skill {
    private String skillName;
    private String skillDescription;

    public Skill(String name, String description) {
        this.skillName = name;
        this.skillDescription = description;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    @Override
    public String toString() {
        return skillName + ": " + skillDescription;
    }
}