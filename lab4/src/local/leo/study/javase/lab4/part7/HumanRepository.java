package local.leo.study.javase.lab4.part7;

import java.util.Arrays;
import java.util.Date;

public class HumanRepository {

    private Human[] humans;

    public HumanRepository(int count) {
        humans = new Human[count];
    }

    public Human findByLastname(String lastname) {
        Human h = null;
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].getLastname().equals(lastname)) {
                h = humans[i];
                break;
            }
        }
        return h;
    }

    public Human findByAddress(String address) {
        Human h = null;
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].getAddress().getFullAddress().equals(address)) {
                h = humans[i];
                break;
            }
        }
        return h;
    }

    public Human[] findByStreet(String street) {
        Human[] result = Arrays.copyOf(humans, humans.length);
        for (Human h : result) {
            if (!h.getAddress().getStreet().equals(street)) {
                h = null;
            }
        }
        return result;
    }

    public Human[] findBetweenBirthDates(Date begin, Date end) {
        Human[] result = Arrays.copyOf(humans, humans.length);
        for (Human h : result) {
            if (h.getBirthDate().before(begin) || h.getBirthDate().after(end)) {
                h = null;
            }
        }
        return result;
    }

    public Human findTheOldest() {
        Human human = humans[0];
        for (Human h : humans) {
            if (h.getAge() > human.getAge()) {
                human = h;
            }
        }
        return human;
    }

    public Human findTheYoungest() {
        Human human = humans[0];
        for (Human h : humans) {
            if (h.getAge() < human.getAge()) {
                human = h;
            }
        }
        return human;
    }

    public void saveAll(Human... human) {
        humans = Arrays.copyOf(human, humans.length);
    }

    public Human[] getHumans() {
        return humans;
    }
}
