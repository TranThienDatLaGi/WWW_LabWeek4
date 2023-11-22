package vn.edu.iuh.fit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.repositories.SkillRepository;
import vn.edu.iuh.fit.models.Skill;

import java.util.Optional;

@SpringBootTest
public class SkillTest {
    @Autowired
    private SkillRepository skillRepository;

    @Test
    void insert(){
        Skill skill = new Skill(1l, "Lam viec nhom", "Lam viec nhom");
        skillRepository.insert(skill);
        Optional<Skill> skillOptional = skillRepository.findById(1l);
        Assertions.assertTrue(skillOptional.isPresent());
    }
}