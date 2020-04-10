package zw.co.econet;

import zw.co.econet.model.Speaker;
import zw.co.econet.service.SpeakerService;
import zw.co.econet.service.SpeakerServiceImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceImp();

        System.out.println(service.findAll().get(0).getFname());
        System.out.println(service.findAll().get(0).getLname());
    }
}
