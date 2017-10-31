package com.example.popie.retrofit_example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by popie on 10/31/2017.
 */

public interface GutHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> repositoryForUser(@Path("user") String user);
}
