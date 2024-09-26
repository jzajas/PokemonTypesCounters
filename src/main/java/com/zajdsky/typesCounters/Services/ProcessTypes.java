package com.zajdsky.typesCounters.Services;
import com.zajdsky.typesCounters.Templates.Types;

import java.util.*;

//TODO change this class to allow to process Types in a Simple and Detailed way
public class ProcessTypes {

//    TODO possibly add new variable and if/else or switch case to allow processing in 2 ways
    public static List<List<String>> getTypes(String type1, String type2, String inst) {

        String[] types = new String[]{type1, type2};

        if(Objects.equals(inst, "simple")){
            return ProcessTypes.processSimpleType(types);
        }else if (Objects.equals(inst, "detailed")){
            return ProcessTypes.processDetailedType(types);
        }else{
            throw new IllegalArgumentException("Wrong instruction");
        }
    }


//    Good/Avoid Attack and Defense
//    TODO finish this method
    private static List<List<String>> processSimpleType(String[] types){
        List<List<String>> results = new ArrayList<>();

        HashMap<String, List<String>> typeInteractions = getTypeInteractions(types);

        processInteractions(typeInteractions);

        List<String> attackWith = typeInteractions.get("weakDefense");
        List<String> avoidAttackingWith = typeInteractions.get("effectiveDefense");
        avoidAttackingWith.addAll(typeInteractions.get("immuneTo"));
        List<String> defendWith = typeInteractions.get("weakAttack");
        defendWith.addAll(typeInteractions.get("cannotDamage"));
        List<String> avoidDefendingWith = typeInteractions.get("effectiveAttack");

        results.add(attackWith);
        results.add(avoidAttackingWith);
        results.add(defendWith);
        results.add(avoidDefendingWith);

        return results;
    }


//    Good/Avoid/Ineffective Attack and Prioritize/Good/Avoid Defense
//    TODO finish this method
    private static List<List<String>> processDetailedType(String[] types){
        List<List<String>> results = new ArrayList<>();

        HashMap<String, List<String>> typeInteractions = getTypeInteractions(types);


        return results;
    }


    private static HashMap<String, List<String>> getTypeInteractions(String[] pokemonTypes) {

        HashMap<String, List<String>> typeInteractions = initializeHashMap();

        List<String> effectiveAttack = typeInteractions.get("effectiveAttack");
        List<String> effectiveDefense = typeInteractions.get("effectiveDefense");
        List<String> weakAttack = typeInteractions.get("weakAttack");
        List<String> weakDefense = typeInteractions.get("weakDefense");
        List<String> immuneTo = typeInteractions.get("immuneTo");
        List<String> cannotDamage = typeInteractions.get("cannotDamage");

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

        return typeInteractions;
    }


    private static void processInteractions(HashMap<String, List<String>> mapToProcess){

        List<String> effectiveAttack = removeDuplicates(mapToProcess.get("effectiveAttack"));
        List<String> effectiveDefense = removeDuplicates(mapToProcess.get("effectiveDefense"));
        List<String> weakAttack = removeDuplicates(mapToProcess.get("weakAttack"));
        List<String> weakDefense = removeDuplicates(mapToProcess.get("weakDefense"));
        List<String> cannotDamage = removeDuplicates(mapToProcess.get("cannotDamage"));
        List<String> immuneTo = removeDuplicates(mapToProcess.get("immuneTo"));

//        Handling how other types interact with this Pokémon
        for(String type: immuneTo) {
            effectiveDefense.remove(type);
            weakDefense.remove(type);
        }

        Iterator<String> iterator1 = effectiveDefense.iterator();
        while (iterator1.hasNext()) {
            String type = iterator1.next();
            if(weakDefense.contains(type)) {
                effectiveDefense.remove(type);
                weakDefense.remove(type);
            }
        }

//        Handling how this Pokémon interacts with other types
//        TODO in detailed approach this will likely have to change as different moves types have different interactions
        for (String type : cannotDamage){
                effectiveAttack.remove(type);
                weakAttack.remove(type);
        }

        Iterator<String> iterator2 = effectiveAttack.iterator();
        while (iterator2.hasNext()) {
            String type = iterator1.next();
            if(weakAttack.contains(type)) {
                effectiveAttack.remove(type);
                weakAttack.remove(type);
            }
        }
    }


    private static List<String> removeDuplicates(List<String> listOfTypes){
        Set<String> set = new HashSet<>(listOfTypes);
        return new ArrayList<>(set);
    }


    private static HashMap<String, List<String>> initializeHashMap(){
        HashMap<String, List<String>> newHashMap = new HashMap<>();

        String[] keys = {"effectiveAttack", "effectiveDefense", "weakAttack", "weakDefense", "immuneTo", "cannotDamage"};
        for (String key : keys) {
            newHashMap.put(key, new ArrayList<>());
        }

        return newHashMap;
    }

}
