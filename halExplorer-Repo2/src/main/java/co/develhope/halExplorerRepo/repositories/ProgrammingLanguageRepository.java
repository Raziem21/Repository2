package co.develhope.halExplorerRepo.repositories;

import co.develhope.halExplorerRepo.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("This is a programming languages collection"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
