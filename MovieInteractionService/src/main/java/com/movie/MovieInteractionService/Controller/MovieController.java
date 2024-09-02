package com.movie.MovieInteractionService.Controller;



import com.movie.MovieInteractionService.Entity.CatalogItem;
import com.movie.MovieInteractionService.Entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movie")
public class MovieController {
   RestTemplate restTemplate=new RestTemplate();

    @GetMapping("/getMovieFromMovieInfo")
    public Movie getMovieFromMovieInfo(){
       Movie movie = restTemplate.getForObject("",Movie.class);
       return movie;
    }
    @GetMapping("/getMovieFromCatalog")
    public CatalogItem getMovieFromCtatlog(){
       CatalogItem catalogItem=restTemplate.getForObject("",CatalogItem.class);
       return catalogItem;
    }

}
