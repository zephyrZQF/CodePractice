package Lambda.predicate;

import Lambda.Project;
import Lambda.ProjectPredicate;

public class ProjectStarPredicate implements ProjectPredicate {

    private int star;

    public ProjectStarPredicate(int star){
        this.star = star;
    }

    @Override
    public boolean test(Project project) {
        return project.getStars() > star;
    }
}
