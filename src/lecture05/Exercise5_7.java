package lecture05;

import java.util.ArrayList;
import java.util.List;

public class Exercise5_7 {
    public static void main(String[] args) {
        List<Insect> insectlist = new ArrayList<>();
        insectlist.add(new Insect());
        insectlist.add(new Butterfly());
        insectlist.add(new Locust());
        insectlist.add(new SwallowtailButterfly());

        for (Insect insect:insectlist){
            insect.move();
        }
    }
}
