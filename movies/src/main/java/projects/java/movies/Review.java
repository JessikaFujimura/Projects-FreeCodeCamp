package projects.java.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "review")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    private ObjectId id;

    private String body;
    
}
