package zw.co.econet.repository;

import zw.co.econet.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class SpeakerRepositoryImp implements SpeakerRepository {
    @Override
    public List<Speaker> findSpeaker(){
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFname("Marvelous");
        speaker.setLname("Mashamba");
        speakers.add(speaker);

        return speakers;
    }

}
