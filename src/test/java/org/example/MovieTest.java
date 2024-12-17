package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MovieTest {

    Movie movie;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        movie = new Movie();
        movie.setId(12312L);
        movie.setCountry("India");
        movie.setDesc("Thriller");
        movie.setLanguage("Malayalam");
        movie.setSite(new URL("https:www.movies.com"));
        movie.setRating(10);
        movie.setTitle("Bougainvillae");

    }


    @Test
    public void testGetId() {
        Assert.assertNotNull(movie);
        Assert.assertEquals(12312L,movie.getId());

    }

    @Test
    public void testSetId() {
        Assert.assertNotNull(movie);
        movie.setId(123L);
        Assert.assertEquals(123L,movie.getId());

    }

    @Test
    public void testGetTitle() {
        Assert.assertNotNull(movie);
        Assert.assertEquals("Bougainvillae",movie.getTitle());
    }

    @Test
    public void testSetTitle() {
        Assert.assertNotNull(movie);
        movie.setTitle("Viduthalai");
        Assert.assertEquals("Viduthalai",movie.getTitle());
    }

    @Test
    public void testGetDesc() {
        Assert.assertNotNull(movie);
        Assert.assertEquals("Thriller",movie.getDesc());
    }

    @Test
    public void testSetDesc() {
        Assert.assertNotNull(movie);
        movie.setDesc("Action Thriller");
        Assert.assertEquals("Action Thriller",movie.getDesc());
    }

    @Test
    public void testGetCountry() {
        Assert.assertNotNull(movie);
        Assert.assertEquals("India",movie.getCountry());
    }

    @Test
    public void testSetCountry() {
        Assert.assertNotNull(movie);
        movie.setCountry("Ukraine");
        Assert.assertEquals("Ukraine",movie.getCountry());
    }

    @Test
    public void testGetRating() {
        Assert.assertNotNull(movie);
        Assert.assertEquals(10,movie.getRating());
    }

    @Test
    public void testSetRating() {
        Assert.assertNotNull(movie);
        movie.setRating(9);
        Assert.assertEquals(9,movie.getRating());
    }

    @Test
    public void testGetSite() {
        Assert.assertNotNull(movie);
        Assert.assertEquals("https:www.movies.com",movie.getSite().toString());
    }

    @Test
    public void testSetSite() throws MalformedURLException {

        Assert.assertNotNull(movie);
        movie.setSite(new URL("https://www.tamilmovies.com"));
        Assert.assertEquals("https://www.tamilmovies.com",movie.getSite().toString());
    }

    @Test
    public void testGetLanguage() {
        Assert.assertNotNull(movie);
        Assert.assertEquals("Malayalam",movie.getLanguage());
    }



    @Test
    public void testSetLanguage() {
        Assert.assertNotNull(movie);
        movie.setLanguage("Tamil");
        Assert.assertEquals("Tamil",movie.getLanguage());
    }
}