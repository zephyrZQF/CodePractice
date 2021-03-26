package Lambda;

import Lambda.predicate.ProjectLanguagePredicate;
import Lambda.predicate.ProjectStarPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class filterProject {

    public  static List<Project> filterProjects(List<Project> projects,ProjectPredicate projectPredicate){
        List<Project> result = new ArrayList<>();
        for( Project project : projects){
            if(projectPredicate.test(project)){
                result.add(project);
            }
        }

        return  result;
    }


    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for(T t : list){
            if(predicate.test(t))
                result.add(t);
        }

        return  result;
    }



    public static void main(String[] args) {
        List<Project> data =new ArrayList<>();

        data.add(Project.builder().name("Blade").language("java").author("biezhi")
                .stars(3500).description("Lightning fast and elegant mvc framework for Java8").build());

        data.add(Project.builder().name("Tale").language("java").author("biezhi")
                .stars(2600).description("Best beautiful java blog, worth a try").build());

        data.add(Project.builder().name("Vue.js").language("js").author("yyx990803")
                .stars(83000).description("A progressive, incrementally-adoptable JavaScript framework for building UI on the web.").build());

        data.add(Project.builder().name("Flask").language("python").author("pallets")
                .stars(10500).description("The Python micro framework for building web applications").build());

        data.add(Project.builder().name("Elves").language("java").author("biezhi")
                .stars(200).description("Spider").build());


        List<Project> projects = filterProjects(data,new ProjectLanguagePredicate("JAVA"));
        projects = filterProjects(data,new ProjectStarPredicate(100));

        System.out.println(projects.size());

        List<Project> filter  = filter(data, project -> project.getStars() > 100);


        data.sort(Comparator.comparing(Project::getStars));

        Runnable task = () -> System.out.println("hello world");

        Thread t = new Thread(task);
        t.start();

    }
}
