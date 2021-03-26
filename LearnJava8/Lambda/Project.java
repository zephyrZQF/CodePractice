package Lambda;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Project {

     private String name;

     private String language;

     private int stars;

     private String description;

     private String author;

}
