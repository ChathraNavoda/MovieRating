package com.movies.movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class movie {

    private ObjectId Id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;



}
