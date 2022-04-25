package hu.blackjack.event;

import lombok.Getter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HitEvent {

    private @Getter
    Set<Integer> huzas;

    public void BlackJackHitEvent(Integer... huz){
        this.huzas = new HashSet<>(Arrays.asList(huz));
    }
}
