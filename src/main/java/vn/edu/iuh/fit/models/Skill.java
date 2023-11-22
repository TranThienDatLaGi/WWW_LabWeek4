package vn.edu.iuh.fit.models;

import org.springframework.data.annotation.Id;

public class Skill {
    @Id
    private long skill_id;
    private String name;
    private String description;

    public Skill() {
    }

    public Skill(long skill_id, String name, String description) {
        this.skill_id = skill_id;
        this.name = name;
        this.description = description;
    }

    public long getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(long skill_id) {
        this.skill_id = skill_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skill_id=" + skill_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}