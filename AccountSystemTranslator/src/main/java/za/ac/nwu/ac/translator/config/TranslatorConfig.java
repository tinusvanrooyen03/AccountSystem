package za.ac.nwu.ac.translator.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import za.ac.nwu.ac.repo.config.RepositoryConfig;
import za.ac.nwu.ac.repo.persistence.MemberRepository;

import javax.persistence.Entity;

@Import({RepositoryConfig.class})
@Configuration
@ComponentScan(basePackages = {"za.ac.nwu.ac.translator"})

public class TranslatorConfig {
}
