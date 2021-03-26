package Lambda.predicate;

import Lambda.Project;
import Lambda.ProjectPredicate;

public class ProjectLanguagePredicate implements ProjectPredicate {

    private String language;

    public ProjectLanguagePredicate(String language){
        this.language = language;
    }


    @Override
    public boolean test(Project project) {
        return language.equals(project.getLanguage());
    }
}
