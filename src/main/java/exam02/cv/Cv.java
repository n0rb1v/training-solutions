package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {
    private String name;
    private List<Skill> skills;

    public Cv(String name) {
        this.name = name;
        this.skills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(String... s) {
        for (String item : s) {
            int lev = Integer.parseInt(item.substring(item.indexOf("(") + 1, item.indexOf("(") + 2));
            String snam = item.substring(0, item.lastIndexOf(" "));
            skills.add(new Skill(snam, lev));
        }
    }

    public int findSkillLevelByName(String s) {
        for (Skill item : skills) {
            if (item.getName().equals(s)) {
                return item.getLevel();
            }
        }
        return 0;
        //throw new SkillNotFoundException("Not found");
    }
}
