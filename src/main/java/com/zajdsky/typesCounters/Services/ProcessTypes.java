package com.zajdsky.typesCounters.Services;
import com.zajdsky.typesCounters.Templates.Types;

import java.util.*;

//TODO change this class to allow to process Types in a Simple and Detailed way
public class ProcessTypes {

//    TODO possibly add new variable and if/else or switch case to allow processing in 2 ways
    public static List<List<String>> getTypes(String type1, String type2) {

        return ProcessTypes.processType(new String[]{type1, type2});
    }


    private static List<List<String>> processType(String[] pokemonTypes) {

        List<String> effectiveAttack = new ArrayList<>();
        List<String> effectiveDefense = new ArrayList<>();
        List<String> weakAttack = new ArrayList<>();
        List<String> weakDefense = new ArrayList<>();
        List<String> immuneTo = new ArrayList<>();
        List<String> cannotDamage = new ArrayList<>();

        List<String> effectiveAttackers;
        List<String> effectiveDefenders;
        List<String> prioritizeAttack;
        List<String> prioritizeDefense;
        List<String> avoidAttack;
        List<String> avoidDefense;

        if(Objects.equals(pokemonTypes[0], pokemonTypes[1])){
            pokemonTypes[1]= "None";
        }

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
                    effectiveAttack.addAll(Types.fireEffectiveAttack);
                    effectiveDefense.addAll(Types.fireEffectiveDefense);
                    weakAttack.addAll(Types.fireWeakAttack);
                    weakDefense.addAll(Types.fireWeakDefense);
                    immuneTo.addAll(Types.fireImmuneTo);
                    cannotDamage.addAll(Types.fireCannotDamage);
                    break;
                case "WATER":
                    effectiveAttack.addAll(Types.waterEffectiveAttack);
                    effectiveDefense.addAll(Types.waterEffectiveDefense);
                    weakAttack.addAll(Types.waterWeakAttack);
                    weakDefense.addAll(Types.waterWeakDefense);
                    immuneTo.addAll(Types.waterImmuneTo);
                    cannotDamage.addAll(Types.waterCannotDamage);
                    break;
                case "ELECTRIC":
                    effectiveAttack.addAll(Types.electricEffectiveAttack);
                    effectiveDefense.addAll(Types.electricEffectiveDefense);
                    weakAttack.addAll(Types.electricWeakAttack);
                    weakDefense.addAll(Types.electricWeakDefense);
                    immuneTo.addAll(Types.electricImmuneTo);
                    cannotDamage.addAll(Types.electricCannotDamage);
                    break;
                case "GRASS":
                    effectiveAttack.addAll(Types.grassEffectiveAttack);
                    effectiveDefense.addAll(Types.grassEffectiveDefense);
                    weakAttack.addAll(Types.grassWeakAttack);
                    weakDefense.addAll(Types.grassWeakDefense);
                    immuneTo.addAll(Types.grassImmuneTo);
                    cannotDamage.addAll(Types.grassCannotDamage);
                    break;
                case "ICE":
                    effectiveAttack.addAll(Types.iceEffectiveAttack);
                    effectiveDefense.addAll(Types.iceEffectiveDefense);
                    weakAttack.addAll(Types.iceWeakAttack);
                    weakDefense.addAll(Types.iceWeakDefense);
                    immuneTo.addAll(Types.iceImmuneTo);
                    cannotDamage.addAll(Types.iceCannotDamage);
                    break;
                case "FIGHTING":
                    effectiveAttack.addAll(Types.fightingEffectiveAttack);
                    effectiveDefense.addAll(Types.fightingEffectiveDefense);
                    weakAttack.addAll(Types.fightingWeakAttack);
                    weakDefense.addAll(Types.fightingWeakDefense);
                    immuneTo.addAll(Types.fightingImmuneTo);
                    cannotDamage.addAll(Types.fightingCannotDamage);
                    break;
                case "POISON":
                    effectiveAttack.addAll(Types.poisonEffectiveAttack);
                    effectiveDefense.addAll(Types.poisonEffectiveDefense);
                    weakAttack.addAll(Types.poisonWeakAttack);
                    weakDefense.addAll(Types.poisonWeakDefense);
                    immuneTo.addAll(Types.poisonImmuneTo);
                    cannotDamage.addAll(Types.poisonCannotDamage);
                    break;
                case "GROUND":
                    effectiveAttack.addAll(Types.groundEffectiveAttack);
                    effectiveDefense.addAll(Types.groundEffectiveDefense);
                    weakAttack.addAll(Types.groundWeakAttack);
                    weakDefense.addAll(Types.groundWeakDefense);
                    immuneTo.addAll(Types.groundImmuneTo);
                    cannotDamage.addAll(Types.groundCannotDamage);
                    break;
                case "FLYING":
                    effectiveAttack.addAll(Types.flyingEffectiveAttack);
                    effectiveDefense.addAll(Types.flyingEffectiveDefense);
                    weakAttack.addAll(Types.flyingWeakAttack);
                    weakDefense.addAll(Types.flyingWeakDefense);
                    immuneTo.addAll(Types.flyingImmuneTo);
                    cannotDamage.addAll(Types.flyingCannotDamage);
                    break;
                case "PSYCHIC":
                    effectiveAttack.addAll(Types.psychicEffectiveAttack);
                    effectiveDefense.addAll(Types.psychicEffectiveDefense);
                    weakAttack.addAll(Types.psychicWeakAttack);
                    weakDefense.addAll(Types.psychicWeakDefense);
                    immuneTo.addAll(Types.psychicImmuneTo);
                    cannotDamage.addAll(Types.psychicCannotDamage);
                    break;
                case "BUG":
                    effectiveAttack.addAll(Types.bugEffectiveAttack);
                    effectiveDefense.addAll(Types.bugEffectiveDefense);
                    weakAttack.addAll(Types.bugWeakAttack);
                    weakDefense.addAll(Types.bugWeakDefense);
                    immuneTo.addAll(Types.bugImmuneTo);
                    cannotDamage.addAll(Types.bugCannotDamage);
                    break;
                case "ROCK":
                    effectiveAttack.addAll(Types.rockEffectiveAttack);
                    effectiveDefense.addAll(Types.rockEffectiveDefense);
                    weakAttack.addAll(Types.rockWeakAttack);
                    weakDefense.addAll(Types.rockWeakDefense);
                    immuneTo.addAll(Types.rockImmuneTo);
                    cannotDamage.addAll(Types.rockCannotDamage);
                    break;
                case "GHOST":
                    effectiveAttack.addAll(Types.ghostEffectiveAttack);
                    effectiveDefense.addAll(Types.ghostEffectiveDefense);
                    weakAttack.addAll(Types.ghostWeakAttack);
                    weakDefense.addAll(Types.ghostWeakDefense);
                    immuneTo.addAll(Types.ghostImmuneTo);
                    cannotDamage.addAll(Types.ghostCannotDamage);
                    break;
                case "DRAGON":
                    effectiveAttack.addAll(Types.dragonEffectiveAttack);
                    effectiveDefense.addAll(Types.dragonEffectiveDefense);
                    weakAttack.addAll(Types.dragonWeakAttack);
                    weakDefense.addAll(Types.dragonWeakDefense);
                    immuneTo.addAll(Types.dragonImmuneTo);
                    cannotDamage.addAll(Types.dragonCannotDamage);
                    break;
                case "DARK":
                    effectiveAttack.addAll(Types.darkEffectiveAttack);
                    effectiveDefense.addAll(Types.darkEffectiveDefense);
                    weakAttack.addAll(Types.darkWeakAttack);
                    weakDefense.addAll(Types.darkWeakDefense);
                    immuneTo.addAll(Types.darkImmuneTo);
                    cannotDamage.addAll(Types.darkCannotDamage);
                    break;
                case "STEEL":
                    effectiveAttack.addAll(Types.steelEffectiveAttack);
                    effectiveDefense.addAll(Types.steelEffectiveDefense);
                    weakAttack.addAll(Types.steelWeakAttack);
                    weakDefense.addAll(Types.steelWeakDefense);
                    immuneTo.addAll(Types.steelImmuneTo);
                    cannotDamage.addAll(Types.steelCannotDamage);
                    break;
                case "FAIRY":
                    effectiveAttack.addAll(Types.fairyEffectiveAttack);
                    effectiveDefense.addAll(Types.fairyEffectiveDefense);
                    weakAttack.addAll(Types.fairyWeakAttack);
                    weakDefense.addAll(Types.fairyWeakDefense);
                    immuneTo.addAll(Types.fairyImmuneTo);
                    cannotDamage.addAll(Types.fairyCannotDamage);
                    break;
                default:
                    break;
            }
        }

//        Checking if some resistances or weaknesses are overlaping and prioritizing using/avoiding them if so
        if(!Objects.equals(pokemonTypes[0], "None") && !Objects.equals(pokemonTypes[1], "None")) {
            prioritizeAttack = handleDuplicates(weakDefense);
            prioritizeDefense = handleDuplicates(weakAttack);
            avoidAttack = handleDuplicates(effectiveDefense);
            avoidDefense = handleDuplicates(effectiveAttack);

            effectiveAttackers = processAttack(effectiveDefense, weakDefense, immuneTo);
            effectiveDefenders = processDefense(effectiveAttack, weakAttack, cannotDamage);
        } else {
            prioritizeAttack = new ArrayList<>();
            prioritizeDefense = cannotDamage;
            avoidAttack = effectiveDefense;
            avoidAttack.addAll(immuneTo);
            avoidDefense = effectiveAttack;

            effectiveAttackers = weakDefense;
            effectiveDefenders = weakAttack;
        }

//        Removing duplicates from the lists
        effectiveAttackers.removeAll(prioritizeAttack);
        effectiveDefenders.removeAll(prioritizeDefense);

        List<List<String>> combinedList = new ArrayList<>();
        combinedList.add(prioritizeAttack);
        combinedList.add(prioritizeDefense);
        combinedList.add(effectiveAttackers);
        combinedList.add(effectiveDefenders);
        combinedList.add(avoidAttack);
        combinedList.add(avoidDefense);

        return combinedList;
    }


    private static List<String> processAttack(List<String> effectiveDefense, List<String> weakDefense, List<String> immuneTo) {
        List<String> attackAs = new ArrayList<>();
//        Checking whether a Pokemon has resistance from one type and weakness from the other
        for(String type : weakDefense) {
            if(!effectiveDefense.contains(type) && !immuneTo.contains(type)){
                attackAs.add(type);
            }
        }
        return attackAs;
    }


    private static List<String> processDefense(List<String> EffectiveAttack, List<String> WeakAttack, List<String> CannotDamage) {
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


    private static List<String> handleDuplicates(List<String> listOfTypes) {
        List<String> duplicate = new ArrayList<>();
        Set<String> seen = new HashSet<>();

        for(String item : listOfTypes){
            if(!seen.add(item)){
                duplicate.add(item);
            }
        }
        return duplicate;
    }

}
