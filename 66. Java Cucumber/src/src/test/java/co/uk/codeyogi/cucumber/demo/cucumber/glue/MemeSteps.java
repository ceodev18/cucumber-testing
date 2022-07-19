package co.uk.codeyogi.cucumber.demo.cucumber.glue;

import co.uk.codeyogi.cucumber.demo.model.Meme;
import co.uk.codeyogi.cucumber.demo.repository.MemeRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.ArrayList;
import java.util.List;

public class MemeSteps {

    @Autowired
    private TestRestTemplate testRestTemplate;
    @Autowired
    private MemeRepository memeRepository;
    @Autowired
    private ObjectMapper objectMapper;

    private List<Meme> expectedMemes;
    private List<Meme> actualMemes;

    @Before
    public void setup(){
        expectedMemes = new ArrayList<>();
        actualMemes = new ArrayList<>();
        memeRepository.deleteAll();
    }
    @Given("^the following memes$")
    public void givenTheFollowingMemes(final List<Meme> memes){
        expectedMemes.addAll(memes);
        memeRepository.saveAll(expectedMemes);
    }

    @When("^the user request all the memes$")
    public void whenTheUserRequestAllMemes(){

    }
    @Then("^all the memes are returned")
    public void thenAllMemesReturned(){

    }


}
