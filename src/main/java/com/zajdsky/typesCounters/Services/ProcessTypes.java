package com.zajdsky.typesCounters.Services;

import com.zajdsky.typesCounters.Templates.Types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class ProcessTypes {

//    TODO change return type
//    TODO this should send the response to the html
    public static void getTypes(String name1, String name2) {

//        processType(new String[]{name1, name2});


    }
//    TODO add 'None' as an option to the javascript an html when choosing type
//    TODO change all cases to .addALL() instead of '='
    private void processType(String[] pokemonTypes) {
        List<String> effectiveAttack = new ArrayList<>();
        List<String> effectiveDefense = new ArrayList<>();
        List<String> weakAttack = new ArrayList<>();
        List<String> weakDefense = new ArrayList<>();
        List<String> immuneTo = new ArrayList<>();
        List<String> cannotDamage = new ArrayList<>();

        List<String> attackAs;
        List<String> defenseAs;

        for(String type : pokemonTypes) {
            switch (type.toUpperCase()) {
                case "NORMAL":
                    effectiveAttack.addAll(Types.normalEffectiveAttack);
                    effectiveDefense.addAll(Types.normalEffectiveDefense);
                    weakAttack.addAll(Types.normalWeakAttack);
                    weakDefense.addAll(Types.normalWeakDefense);
                    immuneTo.addAll(Types.normalImmuneTo);
                    cannotDamage.addAll(Types.normalCannotDamage);
                    break;
                case "FIRE":
                    effectiveAttack = Types.fireEffectiveAttack;
                    effectiveDefense = Types.fireEffectiveDefense;
                    weakAttack = Types.fireWeakAttack;
                    weakDefense = Types.fireWeakDefense;
                    immuneTo = Types.fireImmuneTo;
                    cannotDamage = Types.fireCannotDamage;
                    break;
                case "WATER":
                    effectiveAttack = Types.waterEffectiveAttack;
                    effectiveDefense = Types.waterEffectiveDefense;
                    weakAttack = Types.waterWeakAttack;
                    weakDefense = Types.waterWeakDefense;
                    immuneTo = Types.waterImmuneTo;
                    cannotDamage = Types.waterCannotDamage;
                    break;
                case "ELECTRIC":
                    effectiveAttack = Types.electricEffectiveAttack;
                    effectiveDefense = Types.electricEffectiveDefense;
                    weakAttack = Types.electricWeakAttack;
                    weakDefense = Types.electricWeakDefense;
                    immuneTo = Types.electricImmuneTo;
                    cannotDamage = Types.electricCannotDamage;
                    break;
                case "GRASS":
                    effectiveAttack = Types.grassEffectiveAttack;
                    effectiveDefense = Types.grassEffectiveDefense;
                    weakAttack = Types.grassWeakAttack;
                    weakDefense = Types.grassWeakDefense;
                    immuneTo = Types.grassImmuneTo;
                    cannotDamage = Types.grassCannotDamage;
                    break;
                case "ICE":
                    effectiveAttack = Types.iceEffectiveAttack;
                    effectiveDefense = Types.iceEffectiveDefense;
                    weakAttack = Types.iceWeakAttack;
                    weakDefense = Types.iceWeakDefense;
                    immuneTo = Types.iceImmuneTo;
                    cannotDamage = Types.iceCannotDamage;
                    break;
                case "FIGHTING":
                    effectiveAttack = Types.fightingEffectiveAttack;
                    effectiveDefense = Types.fightingEffectiveDefense;
                    weakAttack = Types.fightingWeakAttack;
                    weakDefense = Types.fightingWeakDefense;
                    immuneTo = Types.fightingImmuneTo;
                    cannotDamage = Types.fightingCannotDamage;
                    break;
                case "POISON":
                    effectiveAttack = Types.poisonEffectiveAttack;
                    effectiveDefense = Types.poisonEffectiveDefense;
                    weakAttack = Types.poisonWeakAttack;
                    weakDefense = Types.poisonWeakDefense;
                    immuneTo = Types.poisonImmuneTo;
                    cannotDamage = Types.poisonCannotDamage;
                    break;
                case "GROUND":
                    effectiveAttack = Types.groundEffectiveAttack;
                    effectiveDefense = Types.groundEffectiveDefense;
                    weakAttack = Types.groundWeakAttack;
                    weakDefense = Types.groundWeakDefense;
                    immuneTo = Types.groundImmuneTo;
                    cannotDamage = Types.groundCannotDamage;
                    break;
                case "FLYING":
                    effectiveAttack = Types.flyingEffectiveAttack;
                    effectiveDefense = Types.flyingEffectiveDefense;
                    weakAttack = Types.flyingWeakAttack;
                    weakDefense = Types.flyingWeakDefense;
                    immuneTo = Types.flyingImmuneTo;
                    cannotDamage = Types.flyingCannotDamage;
                    break;
                case "PSYCHIC":
                    effectiveAttack = Types.psychicEffectiveAttack;
                    effectiveDefense = Types.psychicEffectiveDefense;
                    weakAttack = Types.psychicWeakAttack;
                    weakDefense = Types.psychicWeakDefense;
                    immuneTo = Types.psychicImmuneTo;
                    cannotDamage = Types.psychicCannotDamage;
                    break;
                case "BUG":
                    effectiveAttack = Types.bugEffectiveAttack;
                    effectiveDefense = Types.bugEffectiveDefense;
                    weakAttack = Types.bugWeakAttack;
                    weakDefense = Types.bugWeakDefense;
                    immuneTo = Types.bugImmuneTo;
                    cannotDamage = Types.bugCannotDamage;
                    break;
                case "ROCK":
                    effectiveAttack = Types.rockEffectiveAttack;
                    effectiveDefense = Types.rockEffectiveDefense;
                    weakAttack = Types.rockWeakAttack;
                    weakDefense = Types.rockWeakDefense;
                    immuneTo = Types.rockImmuneTo;
                    cannotDamage = Types.rockCannotDamage;
                    break;
                case "GHOST":
                    effectiveAttack = Types.ghostEffectiveAttack;
                    effectiveDefense = Types.ghostEffectiveDefense;
                    weakAttack = Types.ghostWeakAttack;
                    weakDefense = Types.ghostWeakDefense;
                    immuneTo = Types.ghostImmuneTo;
                    cannotDamage = Types.ghostCannotDamage;
                    break;
                case "DRAGON":
                    effectiveAttack = Types.dragonEffectiveAttack;
                    effectiveDefense = Types.dragonEffectiveDefense;
                    weakAttack = Types.dragonWeakAttack;
                    weakDefense = Types.dragonWeakDefense;
                    immuneTo = Types.dragonImmuneTo;
                    cannotDamage = Types.dragonCannotDamage;
                    break;
                case "DARK":
                    effectiveAttack = Types.darkEffectiveAttack;
                    effectiveDefense = Types.darkEffectiveDefense;
                    weakAttack = Types.darkWeakAttack;
                    weakDefense = Types.darkWeakDefense;
                    immuneTo = Types.darkImmuneTo;
                    cannotDamage = Types.darkCannotDamage;
                    break;
                case "STEEL":
                    effectiveAttack = Types.steelEffectiveAttack;
                    effectiveDefense = Types.steelEffectiveDefense;
                    weakAttack = Types.steelWeakAttack;
                    weakDefense = Types.steelWeakDefense;
                    immuneTo = Types.steelImmuneTo;
                    cannotDamage = Types.steelCannotDamage;
                    break;
                case "FAIRY":
                    effectiveAttack = Types.fairyEffectiveAttack;
                    effectiveDefense = Types.fairyEffectiveDefense;
                    weakAttack = Types.fairyWeakAttack;
                    weakDefense = Types.fairyWeakDefense;
                    immuneTo = Types.fairyImmuneTo;
                    cannotDamage = Types.fairyCannotDamage;
                    break;
                default:
                    break;
            }
        }

//        TODO remove this part because strenghts and weaknesses are multiplicative --> possible add new functions to handle that
//        Removing Duplicates
        effectiveAttack = new ArrayList<>((new HashSet<>(effectiveAttack)));
        effectiveDefense = new ArrayList<>((new HashSet<>(effectiveDefense)));
        weakAttack = new ArrayList<>((new HashSet<>(weakAttack)));
        weakDefense = new ArrayList<>((new HashSet<>(weakDefense)));
        immuneTo = new ArrayList<>((new HashSet<>(immuneTo)));
        cannotDamage = new ArrayList<>((new HashSet<>(cannotDamage)));


        if(!Objects.equals(pokemonTypes[0], "None") && !Objects.equals(pokemonTypes[1], "None")) {
            attackAs = processAttack(effectiveDefense, weakDefense, immuneTo);
            defenseAs = processDefense(effectiveAttack, weakAttack, cannotDamage);
        } else {
            attackAs = effectiveAttack;
            defenseAs = effectiveDefense;

        }

    }


    private List<String> processAttack(List<String> EffectiveDefense, List<String> WeakDefense, List<String> ImmuneTo) {
        List<String> attackAs = new ArrayList<>();
//        Checking whether a Pokemon has resistance from one type and weakness from the other
        for(String type : WeakDefense) {
            if(!EffectiveDefense.contains(type) && !ImmuneTo.contains(type)){
                attackAs.add(type);
            }
        }
        return attackAs;
    }


    private List<String> processDefense(List<String> EffectiveAttack, List<String> WeakAttack, List<String> CannotDamage) {
        List<String> defendAs = new ArrayList<>();
//        Checking whether a Pokemon has resistance from one type and weakness from the other
        for(String type : WeakAttack) {
            if(!EffectiveAttack.contains(type)){
                defendAs.add(type);
            }
        }
        defendAs.addAll(CannotDamage);
        return defendAs;
    }

}
