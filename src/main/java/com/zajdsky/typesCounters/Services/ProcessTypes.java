package com.zajdsky.typesCounters.Services;
import com.zajdsky.typesCounters.Templates.Types;

import javax.lang.model.type.NullType;
import java.util.*;

public class ProcessTypes {

    public static List<List<String>> getTypes(String type1, String type2, String inst) {

        if (Objects.equals(type1, type2)){
            type2 = "None";
        }

        if(Objects.equals(inst, "simple")){
            return ProcessTypes.processSimpleType(type1, type2);
        }else if (Objects.equals(inst, "detailed")){
            return ProcessTypes.processDetailedType(type1, type2);
        }else{
            throw new IllegalArgumentException("Wrong instruction");
        }
    }


//    TODO Simple returns good types to defend with even if that type is good against only one of the types of the enemy pokemon
    private static List<List<String>> processSimpleType(String type1, String type2){
        List<List<String>> results = new ArrayList<>();

        HashMap<String, List<String>> typeInteractions = getTypeInteractions(type1, type2);

        HashMap<String,List<String>> finalInteractions = processInteractions(typeInteractions, "simple");

        List<String> attackWith = finalInteractions.get("weakDefense");
        List<String> defendWith = finalInteractions.get("weakAttack");
        defendWith.addAll(finalInteractions.get("cannotDamage"));
        List<String> avoidAttackWith = finalInteractions.get("effectiveDefense");
        avoidAttackWith.addAll(finalInteractions.get("immuneTo"));
        List<String> avoidDefendWith = finalInteractions.get("effectiveAttack");

        results.add(attackWith);
        results.add(defendWith);
        results.add(avoidAttackWith);
        results.add(avoidDefendWith);

        return results;
    }


    private static List<List<String>> processDetailedType(String type1, String type2){
        List<List<String>> results = new ArrayList<>();

        HashMap<String, List<String>> type1Interactions = getTypeInteractions(type1, "None");
        HashMap<String, List<String>> type2Interactions = getTypeInteractions(type2, "None");
        HashMap<String, List<String>> allInteractions = getTypeInteractions(type1, type2);

        HashMap<String, List<String>> attackInteractions = processInteractions(allInteractions, "detailed");

//        Processing with what types to attack
        List<String> attackWith = attackInteractions.get("weakDefense");
        List<String> avoidAttackWith = attackInteractions.get("effectiveDefense");
        List<String> enemyImmunity = attackInteractions.get("immuneTo") ;

//        Processing with what types to defend with separately for each enemy type
        List<String> defendWithType1 = type1Interactions.get("weakAttack");
        List<String> avoidDefendWithType1 = type1Interactions.get("effectiveAttack");
        List<String> cannotDmgType1 = type1Interactions.get("cannotDamage");
        List<String> defendWithType2 = type2Interactions.get("weakAttack");
        List<String> avoidDefendWithType2 = type2Interactions.get("effectiveAttack");
        List<String> cannotDmgType2 = type2Interactions.get("cannotDamage");


        results.add(attackWith);
        results.add(defendWithType1);
        results.add(avoidAttackWith);

        results.add(avoidDefendWithType1);
        results.add(avoidDefendWithType2);
        results.add(defendWithType2);

        results.add(enemyImmunity);
        results.add(cannotDmgType1);
        results.add(cannotDmgType2);

        return results;
    }


    private static HashMap<String, List<String>> getTypeInteractions(String type1, String type2) {
        String[] pokemonTypes = {type1, type2};

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


    private static HashMap<String, List<String>> processInteractions(HashMap<String, List<String>> mapToProcess, String inst){
        HashMap<String, List<String>> finalInteractions = new HashMap<>();

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
                iterator1.remove();
                weakDefense.remove(type);
            }
        }
        if(Objects.equals(inst, "simple")){
//        Handling how this Pokémon interacts with other types
            for (String type : cannotDamage){
                    effectiveAttack.remove(type);
                    weakAttack.remove(type);
            }

            Iterator<String> iterator2 = effectiveAttack.iterator();
            while (iterator2.hasNext()) {
                String type = iterator2.next();
                if(weakAttack.contains(type)) {
                    iterator2.remove();
                    weakAttack.remove(type);
                }
            }
            finalInteractions.put("effectiveAttack", effectiveAttack);
            finalInteractions.put("weakAttack", weakAttack);
            finalInteractions.put("cannotDamage", cannotDamage);
        }

        finalInteractions.put("immuneTo", immuneTo);
        finalInteractions.put("effectiveDefense", effectiveDefense);
        finalInteractions.put("weakDefense", weakDefense);

        return finalInteractions;
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
